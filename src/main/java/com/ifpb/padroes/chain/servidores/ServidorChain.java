
package com.ifpb.padroes.chain.servidores;

import java.math.BigDecimal;

/**
 *
 * @author lyndemberg
 */
public abstract class ServidorChain {
    private BigDecimal limite;
    private ServidorChain proximo;

    public ServidorChain(BigDecimal limite) {
        this.limite = limite;
    }
    
    public void setProximo(ServidorChain proximoServidor){
        if(proximo == null){
            this.proximo = proximoServidor;
        }else{
            this.proximo.setProximo(proximoServidor);
        }
    }
    public void atenderRequisicoes(BigDecimal requisicoes) throws Exception{
        if(podeAtender(requisicoes)){
            atendeu();
        }else{
            if(proximo == null){
                throw new Exception("(x) Não existe servidores que atendam as requisicoes (x)");
            }
            System.out.println("Tentando com o próximo.....");
            proximo.atenderRequisicoes(requisicoes);
        }
    
    }
    
    private boolean podeAtender(BigDecimal requisicoes){
        return limite.compareTo(requisicoes) == 1 || limite.compareTo(requisicoes)==0;
    }
    
    
    protected abstract void atendeu();
    
}

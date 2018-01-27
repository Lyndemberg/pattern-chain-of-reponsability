package com.ifpb.padroes.chain.servidores;

import java.math.BigDecimal;

/**
 *
 * @author lyndemberg
 */
public class Payara extends ServidorChain{

    public Payara(BigDecimal requisicoes) {
        super(requisicoes);
    }

    @Override
    protected void atendeu() {
        System.out.println("Payara conseguiu atender");
    }
    
}

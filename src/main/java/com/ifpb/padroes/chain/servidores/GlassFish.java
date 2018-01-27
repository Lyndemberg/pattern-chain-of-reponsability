
package com.ifpb.padroes.chain.servidores;

import java.math.BigDecimal;

/**
 *
 * @author lyndemberg
 */
public class GlassFish extends ServidorChain{

    public GlassFish(BigDecimal requisicoes) {
        super(requisicoes);
    }

    @Override
    protected void atendeu() {
        System.out.println("GlashFish conseguiu atender");
    }
    
}

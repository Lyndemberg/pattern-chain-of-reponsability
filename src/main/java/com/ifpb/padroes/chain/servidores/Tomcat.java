package com.ifpb.padroes.chain.servidores;

import java.math.BigDecimal;

/**
 *
 * @author lyndemberg
 */
public class Tomcat extends ServidorChain{

    public Tomcat(BigDecimal requisicoes) {
        super(requisicoes);
    }

    @Override
    protected void atendeu() {
        System.out.println("Tomcat atendeu");
    }
    
}

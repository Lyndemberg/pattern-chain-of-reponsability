package com.ifpb.padroes.chain.app;

import com.ifpb.padroes.chain.servidores.GlassFish;
import com.ifpb.padroes.chain.servidores.Payara;
import com.ifpb.padroes.chain.servidores.ServidorChain;
import com.ifpb.padroes.chain.servidores.Tomcat;
import java.math.BigDecimal;


/**
 *
 * @author lyndemberg
 */
public class App {
    public static void main(String[] args) throws Exception {
        ServidorChain chain = new GlassFish(new BigDecimal(1000));
        chain.setProximo(new Tomcat(new BigDecimal(15000)));
        chain.setProximo(new Payara(new BigDecimal(20000)));
        chain.atenderRequisicoes(new BigDecimal(10000));
    }
}

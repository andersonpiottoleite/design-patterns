package br.com.bb.designpatterns.adapter;

import java.math.BigDecimal;

public class TesteOperacoesContaCorrente {

    public static void main(String[] args) {
        ClientJarOperacoesContaCorrente client = new ClientJarOperacoesContaCorrente(new JarOperacoesContaCorrente());

        BigDecimal valorSaquePretendido = new BigDecimal(1000);

        if(client.validaSaldo(valorSaquePretendido)){
            client.saca(valorSaquePretendido);
        }

        client.deposita(new BigDecimal(1000));
    }
}

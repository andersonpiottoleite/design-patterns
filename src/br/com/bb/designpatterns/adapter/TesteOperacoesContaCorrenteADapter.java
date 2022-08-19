package br.com.bb.designpatterns.adapter;

import java.math.BigDecimal;

public class TesteOperacoesContaCorrenteADapter {

    public static void main(String[] args) {
        ClientAdapterOperacoesContaCorrente client = new ClientAdapterOperacoesContaCorrente(new OperacoesContaCorrenteAdapter());

        BigDecimal valorSaquePretendido = new BigDecimal(1000);

        client.saca(valorSaquePretendido);

        client.deposita(new BigDecimal(1000));
    }
}

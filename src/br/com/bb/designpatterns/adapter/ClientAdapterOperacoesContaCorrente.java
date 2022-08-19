package br.com.bb.designpatterns.adapter;

import java.math.BigDecimal;

public class ClientAdapterOperacoesContaCorrente {

    private OperacoesContaCorrenteAdapter occa;

    public ClientAdapterOperacoesContaCorrente(OperacoesContaCorrenteAdapter occa){

        this.occa = occa;
    }

    public void saca(BigDecimal valorPretendido){

        occa.saca(valorPretendido);
    }

    public void deposita(BigDecimal valor){

        occa.deposita(valor);
    }
}

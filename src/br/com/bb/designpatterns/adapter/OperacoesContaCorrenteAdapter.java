package br.com.bb.designpatterns.adapter;

import java.math.BigDecimal;

public class OperacoesContaCorrenteAdapter {

    private JarOperacoesContaCorrente jocc = new JarOperacoesContaCorrente();

    public void saca(BigDecimal valorPretendido){
        if (jocc.validaSaldo(valorPretendido)){
            jocc.saca(valorPretendido);
        }
    }

    public void deposita(BigDecimal valor){
        jocc.deposita(valor);
    }
}

package br.com.bb.designpatterns.chainofresponsibility;

import java.math.BigDecimal;

public class SemDireitoADesconto extends DescontoCarro{

    public SemDireitoADesconto(DescontoCarro proximoDesconto) {
        super(proximoDesconto);
    }
    @Override
    public BigDecimal aplicaDesconto(Carro carro) {
        return BigDecimal.ZERO;
    }
}

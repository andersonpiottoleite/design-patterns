package br.com.bb.designpatterns.chainofresponsibility;

import java.math.BigDecimal;

public class VendaCarroService {

    public BigDecimal calculaValorVenda(Carro carro){
        DescontoCarro desconto =
                new DescontoCarroFIAT(
                        new DescontoCarroFORD(
                                        new DescontoCarroValorMaiorQueCemMil(
                                                new SemDireitoADesconto(null))));

        return desconto.aplicaDesconto(carro);
    }
}

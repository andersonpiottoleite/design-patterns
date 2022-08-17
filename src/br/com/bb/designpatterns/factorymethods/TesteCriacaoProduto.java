package br.com.bb.designpatterns.factorymethods;

import java.util.Calendar;

public class TesteCriacaoProduto {

    public static void main(String[] args) {
        /*Produto produtoFisico = new ProdutoFisico();
        produtoFisico.setPossuiDimensoesFisicas(Boolean.TRUE);

        Produto produtoDigital = new ProdutoDigital();
        produtoDigital.setPossuiDimensoesFisicas(Boolean.FALSE);*/

        Produto produtoFisico = ProdutoFactory.getInstance(TipoProdutoEnum.FISICO);

        Produto produtoDigital = ProdutoFactory.getInstance(TipoProdutoEnum.DIGITAL);

        System.out.println(produtoFisico.getPossuiDimensoesFisicas());
        System.out.println(produtoDigital.getPossuiDimensoesFisicas());

        Calendar calendar = Calendar.getInstance();

        Produto produto = ProdutoFactory.getInstance();

        new ProdutoFactory().getInstance2();


    }

}

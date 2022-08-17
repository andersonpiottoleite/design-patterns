package br.com.bb.designpatterns.factorymethods;

public class ProdutoFactory {

    public static Produto getInstance(){ // static factory method
        return new Produto();
    }

    public Produto getInstance2(){
        return new Produto();
    }

    public static Produto getInstance(TipoProdutoEnum tipoProduto){

        switch (tipoProduto){
            case FISICO:
                Produto produtoFisico = new ProdutoFisico();
                produtoFisico.setPossuiDimensoesFisicas(Boolean.TRUE);
                return produtoFisico;

            case DIGITAL:
                Produto produtoDigital = new ProdutoDigital();
                produtoDigital.setPossuiDimensoesFisicas(Boolean.FALSE);
                return produtoDigital;

            default:
                throw new IllegalArgumentException("Tipo de Produto não disponivel");
        }
    }
}

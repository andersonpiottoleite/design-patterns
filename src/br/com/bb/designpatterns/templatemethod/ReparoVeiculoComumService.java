package br.com.bb.designpatterns.templatemethod;

public class ReparoVeiculoComumService extends ReparoVeiculoService{

    private VeiculoParaReparo veiculoParaReparo;

    public ReparoVeiculoComumService(VeiculoParaReparo veiculoParaReparo){

        this.veiculoParaReparo = veiculoParaReparo;
    }
    @Override
    protected boolean veiculoParaReparo() {
        return veiculoParaReparo.getPorcentagemDano() <= 70;
    }

    @Override
    protected void entradaOficina() {
        System.out.println("Esta entrando na oficina meu carro simples, mas tá pago!");
    }
}

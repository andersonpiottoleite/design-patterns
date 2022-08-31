package br.com.bb.designpatterns.templatemethod;

public class ReparoVeiculoDeLuxoService extends ReparoVeiculoService{

    private VeiculoParaReparo veiculoParaReparo;

    public ReparoVeiculoDeLuxoService(VeiculoParaReparo veiculoParaReparo){

        this.veiculoParaReparo = veiculoParaReparo;
    }
    @Override
    protected boolean veiculoParaReparo() {
        return veiculoParaReparo.getPorcentagemDano() <= 50;
    }
}

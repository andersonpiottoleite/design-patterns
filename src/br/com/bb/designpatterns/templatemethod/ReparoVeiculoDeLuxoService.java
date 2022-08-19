package br.com.bb.designpatterns.templatemethod;

public class ReparoVeiculoDeLuxoService extends ReparoVeiculoService{

    private VeiculoParaReparo veiculoParaReparo;

    public ReparoVeiculoDeLuxoService(VeiculoParaReparo veiculoParaReparo){

        this.veiculoParaReparo = veiculoParaReparo;
    }
    @Override
    protected boolean veiculoParaReparo() {
        return !veiculoParaReparo.isQuebrouMotor() && // motor é muito caro :(
                !veiculoParaReparo.isQuebrouCambio(); // e o cambio é uma fortuan :(
    }
}

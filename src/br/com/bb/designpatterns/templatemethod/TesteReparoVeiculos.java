package br.com.bb.designpatterns.templatemethod;

public class TesteReparoVeiculos {

    public static void main(String[] args) {
        VeiculoParaReparo veiculoDeLuxo = new VeiculoParaReparo();
        veiculoDeLuxo.setQuebrouMotor(false);
        veiculoDeLuxo.setQuebrouCambio(false);
        veiculoDeLuxo.setQuebrouSuspensao(true);

        ReparoVeiculoService rpl = new ReparoVeiculoDeLuxoService(veiculoDeLuxo);

        rpl.reparaVeiculo();

        System.out.println("---------------------------------");

        VeiculoParaReparo veiculoComum = new VeiculoParaReparo();
        veiculoComum.setQuebrouMotor(false);
        veiculoComum.setQuebrouCambio(true);
        veiculoComum.setQuebrouSuspensao(false);

        ReparoVeiculoService rpc = new ReparoVeiculoComumService(veiculoComum);

        rpc.reparaVeiculo();
    }
}

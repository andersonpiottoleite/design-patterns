package br.com.bb.designpatterns.templatemethod;

public class TesteReparoVeiculos {

    public static void main(String[] args) {
        VeiculoParaReparo veiculoDeLuxo = new VeiculoParaReparo();
        veiculoDeLuxo.setPorcentagemDano(50);

        ReparoVeiculoService rpl = new ReparoVeiculoDeLuxoService(veiculoDeLuxo);

        rpl.reparaVeiculo();

        System.out.println("---------------------------------");

        VeiculoParaReparo veiculoComum = new VeiculoParaReparo();
        veiculoComum.setPorcentagemDano(71);

        ReparoVeiculoService rpc = new ReparoVeiculoComumService(veiculoComum);

        rpc.reparaVeiculo();
    }
}

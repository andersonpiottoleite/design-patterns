package br.com.bb.designpatterns.prototype;

public class TesteBotao {

    public static void main(String[] args) {
        BotaoRegistry botaoRegistry = BotaoRegistry.getBotaoRegistry();

        Botao botaoAzul = botaoRegistry.getBotao("BOTAO_AZUL");
        System.out.println(botaoAzul);

        Botao botaoVermelho = botaoRegistry.getBotao("BOTAO_VERMELHO");
        System.out.println(botaoVermelho);

        Botao botaoAmarelo = botaoRegistry.getBotao("BOTAO_AMARELO");
        System.out.println(botaoAmarelo);

        botaoAmarelo.setLargura(500);
        System.out.println(botaoAmarelo);

        botaoAmarelo = botaoRegistry.getBotao("BOTAO_AMARELO");
        System.out.println(botaoAmarelo);

        Botao prototipoBotaoRoxo = new Botao();
        prototipoBotaoRoxo.setCor("Roxo");
        prototipoBotaoRoxo.setAltura(10);
        prototipoBotaoRoxo.setLargura(70);
        prototipoBotaoRoxo.setTipoBorda(TipoBordaEnum.TRACEJADA);

        botaoRegistry.addRegistry("BOTAO_ROXO", prototipoBotaoRoxo);

        Botao botaoRoxo = botaoRegistry.getBotao("BOTAO_ROXO");
        System.out.println(botaoRoxo);

    }
}

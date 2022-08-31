package br.com.bb.designpatterns.prototype;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class BotaoRegistry {

    private static BotaoRegistry botaoRegistry;

    private static Map<String, Botao> REGISTRY = new HashMap<>();

    static {
        Botao botaoVermelho = new Botao();
        botaoVermelho.setCor("Vermelha");
        botaoVermelho.setAltura(30);
        botaoVermelho.setLargura(100);
        botaoVermelho.setTipoBorda(TipoBordaEnum.FINA);

        Botao botaoAzul = new Botao();
        botaoAzul.setCor("Azul");
        botaoAzul.setAltura(35);
        botaoAzul.setLargura(125);
        botaoAzul.setTipoBorda(TipoBordaEnum.TRACEJADA);

        Botao botaoAmarelo = new Botao();
        botaoAmarelo.setCor("Amarela");
        botaoAmarelo.setAltura(40);
        botaoAmarelo.setLargura(150);
        botaoAmarelo.setTipoBorda(TipoBordaEnum.GROSSA);

        // mais botoes...

        REGISTRY.put("BOTAO_VERMELHO", botaoVermelho);
        REGISTRY.put("BOTAO_AZUL", botaoAzul);
        REGISTRY.put("BOTAO_AMARELO", botaoAmarelo);
    }

    public static BotaoRegistry getBotaoRegistry() {
        if (Objects.isNull(botaoRegistry)){
            botaoRegistry = new BotaoRegistry();
        }
        return botaoRegistry;
    }

    public static Botao getBotao(String chave) {
        return BotaoFactory.getInstance(REGISTRY.get(chave));
    }

    public static void addRegistry(String chave, Botao botao) {
        REGISTRY.put(chave, botao);
    }
}

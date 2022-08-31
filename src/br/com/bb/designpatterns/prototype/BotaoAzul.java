package br.com.bb.designpatterns.prototype;

public class BotaoAzul extends Botao{

    public BotaoAzul() {
        setCor("Azul");
        setAltura(35);
        setLargura(125);
        setTipoBorda(TipoBordaEnum.TRACEJADA);

    }
}

package br.com.bb.designpatterns.prototype;

public class BotaoVermelho extends Botao{

    public BotaoVermelho() {
        setCor("Vermelha");
        setAltura(30);
        setLargura(100);
        setTipoBorda(TipoBordaEnum.FINA);
    }
}

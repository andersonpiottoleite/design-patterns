package br.com.bb.designpatterns.prototype;

public class BotaoFactory {

    public static Botao getInstance(Botao prototipoBotao) {
        Botao clone = new Botao();
        clone.setCor(prototipoBotao.getCor());
        clone.setLargura(prototipoBotao.getLargura());
        clone.setAltura(prototipoBotao.getAltura());
        clone.setTipoBorda(prototipoBotao.getTipoBorda());

        return clone;
    }
}

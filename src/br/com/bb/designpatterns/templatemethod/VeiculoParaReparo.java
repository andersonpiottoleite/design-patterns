package br.com.bb.designpatterns.templatemethod;

public class VeiculoParaReparo {

    private boolean quebrouMotor;
    private boolean quebrouCambio;
    private boolean quebrouSuspensao;

    public boolean isQuebrouMotor() {
        return quebrouMotor;
    }

    public void setQuebrouMotor(boolean quebrouMotor) {
        this.quebrouMotor = quebrouMotor;
    }

    public boolean isQuebrouCambio() {
        return quebrouCambio;
    }

    public void setQuebrouCambio(boolean quebrouCambio) {
        this.quebrouCambio = quebrouCambio;
    }

    public boolean isQuebrouSuspensao() {
        return quebrouSuspensao;
    }

    public void setQuebrouSuspensao(boolean quebrouSuspensao) {
        this.quebrouSuspensao = quebrouSuspensao;
    }
}

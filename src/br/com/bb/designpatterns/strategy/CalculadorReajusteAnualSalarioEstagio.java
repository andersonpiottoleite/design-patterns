package br.com.bb.designpatterns.strategy;

import java.math.BigDecimal;

public class CalculadorReajusteAnualSalarioEstagio implements CalculadorReajusteAnualSalario{
    @Override
    public void calculaRejusteAnual(Funcionario funcionario) {
        BigDecimal salario = funcionario.getSalario();
        funcionario.setSalario(salario.add(salario.multiply(new BigDecimal(0.02))));
    }
}

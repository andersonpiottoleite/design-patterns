package br.com.bb.designpatterns.strategy;

import java.math.BigDecimal;

public class ReajusteAnualSalario {

    public void calculaRejusteAnual(Funcionario funcionario){
        
        if (TipoContratacaoEnum.CLT.name().equals(funcionario.getTipoContratacao().name())){
            BigDecimal salario = funcionario.getSalario();
            funcionario.setSalario(salario.add(salario.multiply(new BigDecimal(0.10))));

        } else if (TipoContratacaoEnum.PJ.equals(funcionario.getTipoContratacao())){
            BigDecimal salario = funcionario.getSalario();
            funcionario.setSalario(salario.add(salario.multiply(new BigDecimal(0.05))));

        } else if (TipoContratacaoEnum.ESTAGIO.equals(funcionario.getTipoContratacao())){
            BigDecimal salario = funcionario.getSalario();
            funcionario.setSalario(salario.add(salario.multiply(new BigDecimal(0.02))));

        }
    }

    public void calculaRejusteAnual(Funcionario funcionario, CalculadorReajusteAnualSalario calculadorReajusteAnualSalario){
        calculadorReajusteAnualSalario.calculaRejusteAnual(funcionario);
    }
}

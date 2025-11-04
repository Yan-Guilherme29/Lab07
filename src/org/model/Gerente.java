package org.model;

public class Gerente extends Funcionario {

    private String departamento;
    private double bonificacaoPercentual;

    public Gerente(String nome, String cpf, double salarioBase, String departamento, double bonificacaoPercentual) {
        super(nome, cpf, salarioBase);
        this.departamento = departamento;
        this.bonificacaoPercentual = bonificacaoPercentual;
    }

    @Override
    public double calcularSalarioTotal() {
        double bonificacao = salarioBase * (bonificacaoPercentual / 100);
        return salarioBase + bonificacao;

    }

}

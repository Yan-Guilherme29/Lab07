package org.model;

class Desenvolvedor extends Funcionario {
    private String linguagemPrincipal;
    private double bonusPorProjeto;

    // Construtor
    public Desenvolvedor(String nome, String cpf, double salarioBase, String linguagemPrincipal, double bonusPorProjeto) {
        super(nome, cpf, salarioBase);
        this.linguagemPrincipal = linguagemPrincipal;
        this.bonusPorProjeto = bonusPorProjeto;
    }

    // Sobrescreve o método calcularSalarioTotal()
    @Override
    public double calcularSalarioTotal() {
        return salarioBase + bonusPorProjeto;
    }
}
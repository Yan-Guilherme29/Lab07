package org.model;

 public class Desenvolvedor extends Funcionario {
     private String linguagemPrincipal;
     private double bonusPorProjeto;


     public Desenvolvedor(String nome, String cpf, double salarioBase, String linguagemPrincipal, double bonusPorProjeto) {
         super(nome, cpf, salarioBase);
         this.linguagemPrincipal = linguagemPrincipal;
         this.bonusPorProjeto = bonusPorProjeto;
     }


     @Override
     public double calcularSalarioTotal() {
         return salarioBase + bonusPorProjeto;
     }

     @Override
     public void exibirInformacoes() {
         System.out.println("Nome: " + nome + " (Desenvolvedor)");
         System.out.println("Linguagem Principal: " + linguagemPrincipal);
         System.out.println("CPF: " + cpf);
         System.out.println("Salário Total: R$ " + calcularSalarioTotal());
         System.out.println("------------------------------");

     }
 }
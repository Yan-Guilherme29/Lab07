package org.Principal;

import org.model.Desenvolvedor;
import org.model.Funcionario;
import org.model.Gerente;

public class Main {
    public static void main(String[] args) {

        Funcionario funcionario1 = new Funcionario("Yan", "70849598150", 3000.00);
        Gerente g1 = new Gerente("Carlos Lima", "987.654.321-00", 6000.0, "Vendas", 20.0);
        Desenvolvedor d1 = new Desenvolvedor("João Pedro", "111.222.333-44", 5000.0, "Java", 1500.0);

        // Exibição dos salários
        funcionario1.exibirInformacoes();
        g1.exibirInformacoes();
        d1.exibirInformacoes();

    }



}

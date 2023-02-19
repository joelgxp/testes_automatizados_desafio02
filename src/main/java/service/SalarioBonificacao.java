package service;

import model.Funcionario;

public class SalarioBonificacao {
    double boni;

    public SalarioBonificacao(double boni) {
        this.boni = boni;
    }
    public SalarioBonificacao(){}

    public double salarioBoni(Funcionario f) {
        if (f.getSalario() > 0 && f.getBonificacao() > 0) {
            boni = f.getBonificacao() + f.getSalario();
            return boni;
        } else {
            System.out.println("Salario e Bonificacao tem que serem maiores que 0");
        }
        return 0;
    }

    @Override
    public String toString() {
        return "SalarioBonificacao{" +
                "boni=" + boni +
                '}';
    }
}

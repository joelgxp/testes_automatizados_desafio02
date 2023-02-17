package service;

import model.Funcionario;

public class SalarioBonificacao {

    private double soma;

    public void salarioBoni(Funcionario f) {
        double boni = f.getBonificacao();
        this.soma = this.soma + boni;
    }

    public double getSoma() {
        return soma;
    }

}

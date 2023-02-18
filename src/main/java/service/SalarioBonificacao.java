package service;

import model.Funcionario;

public class SalarioBonificacao {
    double boni;

    public SalarioBonificacao(double boni) {
        this.boni = boni;
    }

//    public double salarioBoni(Funcionario f) {
//        boni = f.getBonificacao() + f.getSalario();
//        return boni;
//
//    }

    @Override
    public String toString() {
        return "SalarioBonificacao{" +
                "boni=" + boni +
                '}';
    }
}

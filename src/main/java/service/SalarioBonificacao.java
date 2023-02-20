package service;

import model.Funcionario;

public class SalarioBonificacao {
    Double boni;

    public Double salarioBoni(Funcionario f) {
        if (f.getSalario() > 0 && f.getBonificacao() > 0) {
            boni = f.getBonificacao() + f.getSalario();
        return boni;
        }

        return null;
    }
}

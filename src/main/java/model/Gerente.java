package model;

public class Gerente extends Funcionario{

    private int senha = 123456;

    public Gerente(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    public int getSenha() {
        return senha;
    }
}

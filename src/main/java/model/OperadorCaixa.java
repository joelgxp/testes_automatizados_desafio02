package model;

public class OperadorCaixa extends Funcionario{

    private int senha = 1234;

    public OperadorCaixa(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    @Override
    public int getSenha() {
        return senha;
    }
}

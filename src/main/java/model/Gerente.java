package model;

public class Gerente extends Funcionario{

    private int senha;

    public Gerente(String nome, String cpf) {
        super(nome, cpf);
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
}

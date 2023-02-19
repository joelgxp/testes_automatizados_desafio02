package model;

public class Gerente extends Funcionario{

    private int senha = 123456;
    private String tipoAcesso = "admin";

    public Gerente(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }


    public int getSenha() {
        return senha;
    }

    @Override
    public void setSenha(int senha) {
        this.senha = senha;
    }

    public String getTipoAcesso(){
        return tipoAcesso;
    }


}

package model;

public class OperadorCaixa extends Funcionario{

    private int senha = 1234;
    private boolean tipoAcesso = false;

    public OperadorCaixa(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
            }

    @Override
    public int getSenha() {
        return senha;
    }

    @Override
    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean getTipoAcesso(){
        return tipoAcesso;
    }
}

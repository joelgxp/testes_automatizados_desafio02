package model;

import service.SalarioBonificacao;

public abstract class Funcionario {
    private String nome;
    private String cpf;
    private double salario;
    private int senha;
    private Double bonificacao;
    private boolean tipoAcesso;

    public Funcionario(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public Double getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(double bonificacao) {
        this.bonificacao = bonificacao;
    }

    public boolean getTipoAcesso() {
        return tipoAcesso;
    }

}
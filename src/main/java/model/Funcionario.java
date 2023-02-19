package model;

import service.SalarioBonificacao;

public abstract class Funcionario {
    private String nome;
    private String cpf;
    private double salario;
    private int senha;
    private double bonificacao;
    private String tipoAcesso;



    public Funcionario(String nome, String cpf, double salario, int senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.senha = senha;
    }

    public Funcionario(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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

    public double getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(double bonificacao) {
        this.bonificacao = bonificacao;
    }

    public String getTipoAcesso() {
        return tipoAcesso;
    }

}
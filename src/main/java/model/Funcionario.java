package model;

public abstract class Funcionario {
    private String nome;
    private String cpf;
    private double salarioBonificado;
    private double salario;
    private double bonificacao;

    public Funcionario(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
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

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(double bonificacao) {
        this.bonificacao = bonificacao;
    }

    public boolean autentica(int senha) {
        return false;
    }

    public double getSalarioBonificado() {

        return salarioBonificado = getSalario() + getBonificacao();

    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", salarioBonificado=" + salarioBonificado +
                ", salario=" + salario +
                ", bonificacao=" + bonificacao +
                '}';
    }
}



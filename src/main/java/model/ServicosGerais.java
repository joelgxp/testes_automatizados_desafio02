package model;

public class ServicosGerais extends Funcionario{

    static double bonificacao = 0.0;

    public ServicosGerais(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    @Override
    public Double getBonificacao() {
        return bonificacao;
    }
}

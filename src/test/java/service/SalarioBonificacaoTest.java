package service;

import model.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SalarioBonificacaoTest {
    SalarioBonificacao salarioBonificacao;
    Funcionario gerente;
    OperadorCaixa opCaixa;
    ServicosGerais servGeral;

    @BeforeEach
    public void setup(){
        salarioBonificacao = new SalarioBonificacao();
        gerente = new Gerente("Joel", "12345678910", 10000.00);
        opCaixa = new OperadorCaixa("Patricia", "78945612310", 3500.00);
        servGeral = new ServicosGerais("Samuel", "45678912310", 2500.00);
    }

    @Test
    public void verificaSalarioComBonificaoDoGerente() {
        //quando
        gerente.setBonificacao(3000.00);

        //entao
        assertNotNull(salarioBonificacao.salarioBoni(gerente));
        System.out.println(gerente.getSalario());
        System.out.println(salarioBonificacao.salarioBoni(gerente));

    }@Test
    public void verificaSalarioComBonificaoDoOperadoCaixa() {
        //quando
        opCaixa.setBonificacao(1500.00);

        //entao
        assertNotNull(salarioBonificacao.salarioBoni(opCaixa));
        System.out.println(opCaixa.getSalario());
        System.out.println(salarioBonificacao.salarioBoni(opCaixa));

    }

    @Test
    public void funcionarioServicosGeraisNaoPossueBonificacao() {
        //quando
        servGeral.setBonificacao(100.00);

        //entao
        assertNull(salarioBonificacao.salarioBoni(servGeral));
        System.out.println(servGeral.getSalario());
        System.out.println(servGeral.getBonificacao());
        System.out.println(salarioBonificacao.salarioBoni(servGeral));

    }
    @Test
    public void bonificacaoOuSalarioNaoPodeSerValoresNegativos (){
        //QUANDO
        gerente.setBonificacao(-1000.00);

        //ENTAO
        assertNull(salarioBonificacao.salarioBoni(gerente));
    }

}

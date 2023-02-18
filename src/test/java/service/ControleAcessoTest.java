package service;

import model.Funcionario;
import model.*;
import service.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ControleAcessoTest {

    @Test
    public void verificaAcessoAoSistemaDoGerente() {
        //dado
        Funcionario gerente = new Gerente("Joel", "12345678910", 10000.00);
        ControleDeAcesso controleDeAcesso = new ControleDeAcesso();

        //quando
        controleDeAcesso.setSenhaAcesso(123456);
        //controleDeAcesso.autentica(gerente);

        //entao
        Assertions.assertTrue(controleDeAcesso.autentica(gerente));

    }

    @Test
    public void verificaAcessoAoSistemaDoOperadorDeCaixa() {
        //dado
        OperadorCaixa opCaixa = new OperadorCaixa("Patricia", "78945612310", 3500.00);
        ControleDeAcesso controleDeAcesso = new ControleDeAcesso();

        //quando
        controleDeAcesso.setSenhaAcesso(1234);
        System.out.println(opCaixa.getSenha());


        //entao
        Assertions.assertTrue(controleDeAcesso.autentica(opCaixa));

    }

    @Test
    public void verificaAcessoAoSistemaDoServicosGerais() {
        //dado
        Funcionario servGeral = new ServicosGerais("Samuel", "45678912310", 2500.00);
        ControleDeAcesso controleDeAcesso = new ControleDeAcesso();

        //quando
        //servGeral.setSenhaAcesso(0);
        //controleDeAcesso.autentica(gerente);

        //entao
        Assertions.assertTrue(controleDeAcesso.autentica(servGeral));

    }

}

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
        Gerente gerente = new Gerente("Joel", "12345678910");

        //quando
        gerente.setSenha(112233);
        //gerente.autentica(1234);


        //entao
        //Assertions.assertTrue(ControleDeAcesso);
        System.out.println(gerente.getSenha());

    }

}

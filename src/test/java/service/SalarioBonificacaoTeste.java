package service;

import model.Gerente;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SalarioBonificacaoTeste {

    @Test
    public void verificaSalarioComBonificaoDoGerente() {
        //dado
        Gerente gerente = new Gerente("Joel", "12345678910");

        //quando
        gerente.setSalario(15000.00);
        gerente.setBonificacao(3000.00);


        //entao
        //Assertions.assertTrue();
        System.out.println(gerente.getSalarioBonificado());
        System.out.println(gerente.toString());

    }
}

package service;

import model.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SalarioBonificacaoTest {

    @Test
    public void verificaSalarioComBonificaoDoGerente() {
        //dado
        Gerente gerente = new Gerente("Joel", "12345678910", 10000.00);
        SalarioBonificacao salarioBonificacao = new SalarioBonificacao();

        //quando
        //gerente.setBonificacao(3000.00);

        //entao
        Assertions.assertNotNull(salarioBonificacao.salarioBoni(gerente));

    }
}

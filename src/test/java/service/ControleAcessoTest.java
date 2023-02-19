package service;

import model.Funcionario;
import model.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import service.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ControleAcessoTest {
    ControleDeAcesso controleDeAcesso = new ControleDeAcesso();
    Funcionario gerente;
    OperadorCaixa opCaixa;
    ServicosGerais servGeral;

    @Test
    public void verificaAcessoAoSistemaDoGerente() throws Exception {
        //dado
        Funcionario gerente = new Gerente("Joel", "12345678910", 10000.00);

        //quando
        controleDeAcesso.setSenhaAcesso(123456);
        //controleDeAcesso.autentica(gerente);

        //entao
        assertTrue(controleDeAcesso.verificaAcesso(gerente));

    }

    @Test
    public void verificaAcessoAoSistemaDoOperadorDeCaixa() throws Exception{
        //dado
        OperadorCaixa opCaixa = new OperadorCaixa("Patricia", "78945612310", 3500.00);

        //quando
        controleDeAcesso.setSenhaAcesso(1234);

        //entao
        assertTrue(controleDeAcesso.verificaAcesso(opCaixa));

    }

    @Test
    public void usuarioSemPermissaoParaAcesso(){
        //DADO
        ServicosGerais servGeral = new ServicosGerais("Samuel", "45678912310", 2500.00);

        //ENTAO
        Throwable throwable = Assertions.assertThrows(Exception.class, () -> controleDeAcesso.verificaAcesso(servGeral));

        assertEquals("Usuario sem acesso ao sistema", throwable.getMessage());
    }

    @Test
    public void somenteUsuarioDoTipoAdminPodeAlterarSenha() throws Exception {
        //DADO
        OperadorCaixa opCaixa = new OperadorCaixa("Patricia", "78945612310", 3500.00);

        //ENQUANTO
        Throwable throwable = assertThrows(Exception.class, ()-> controleDeAcesso.alterarSenha(opCaixa, 112233));
        assertEquals("Usuario sem permissao para alterar senha", throwable.getMessage());

    }

}

package service;

import model.Funcionario;
import model.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)

public class ControleDeAcessoTest {
    Funcionario gerente;
    OperadorCaixa opCaixa;
    ServicosGerais servGeral;

    @Mock
    VerificaAcessoAdministrador verificaAcessoAdministrador;

    @InjectMocks
    ControleDeAcesso controleDeAcesso;

    @BeforeEach
    public void before(){
        MockitoAnnotations.openMocks(this);
        controleDeAcesso = new ControleDeAcesso();
        gerente = new Gerente("Joel", "12345678910", 10000.00);
        opCaixa = new OperadorCaixa("Patricia", "78945612310", 3500.00);
        servGeral = new ServicosGerais("Samuel", "45678912310", 2500.00);
    }


    @Test
    public void verificaAcessoAoSistemaDoGerente() throws Exception {
        //quando
        controleDeAcesso.setSenhaAcesso(123456);
        //controleDeAcesso.autentica(gerente);

        //entao
        assertTrue(controleDeAcesso.verificaAcesso(gerente));

    }

    @Test
    public void verificaAcessoAoSistemaDoOperadorDeCaixa() throws Exception{
        //quando
        controleDeAcesso.setSenhaAcesso(1234);

        //entao
        assertTrue(controleDeAcesso.verificaAcesso(opCaixa));

    }

    @Test
    public void usuarioServicoGeraisSemPermissaoParaAcessoAoSistema(){
       //ENTAO
        Throwable throwable = Assertions.assertThrows(Exception.class, () -> controleDeAcesso.verificaAcesso(servGeral));

        assertEquals("Usuario sem acesso ao sistema", throwable.getMessage());
    }

    @Test
    public void alterarSenhaDoFuncionarioGerente() throws Exception {
        //ENQUANTO
        int senhaAntiga = gerente.getSenha();
        System.out.println(senhaAntiga);
        controleDeAcesso.alterarSenha(gerente, 112233);
        System.out.println(gerente.getSenha());

        //ENQUANTO
        assertNotEquals(gerente.getSenha(), senhaAntiga);

    }

    @Test
    public void usuarioOperadorCaixaNaoPodeAlterarSenha() throws Exception {
        //ENQUANTO
        Throwable throwable = assertThrows(Exception.class, ()-> controleDeAcesso.alterarSenha(opCaixa, 112233));
        assertEquals("Usuario sem permissao para alterar senha", throwable.getMessage());

    }

//    @Test
//    public void usuarioOperadorCaixaComPermissaoAdministradorPodeAlterarSenha() throws Exception {
//
//        Mockito.when(verificaAcessoAdministrador.autenticaMudarSenha(opCaixa)).thenReturn(true);
//
//        int senhaAntiga = opCaixa.getSenha();
//        System.out.println(senhaAntiga);
//        controleDeAcesso.alterarSenha(opCaixa, 112233);
//        System.out.println(opCaixa.getSenha());
//
//        //ENQUANTO
//        assertNotEquals(opCaixa.getSenha(), senhaAntiga);
//
//    }

}

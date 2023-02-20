package service;

import model.Funcionario;
import model.Gerente;

public class ControleDeAcesso {

    private int senhaAcesso;
    VerificaAcessoAdministrador verificaAcessoAdministrador = new VerificaAcessoAdministrador();

    private int getSenhaAcesso() {
        return senhaAcesso;
    }
    public void setSenhaAcesso(int senhaAcesso) {
        this.senhaAcesso = senhaAcesso;
    }
    public boolean verificaAcesso(Funcionario funcionario) throws Exception {
        if (funcionario.getSenha() == 0) {
            throw new Exception("Usuario sem acesso ao sistema");
        }
        if (getSenhaAcesso() == funcionario.getSenha()) {
            return true;
        } else {
            return false;
        }

    }

    public void alterarSenha(Funcionario funcionario, int senhaNova) throws Exception {

        if(verificaAcessoAdministrador.autenticaMudarSenha(funcionario) == true) {
            funcionario.setSenha(senhaNova);
        } else {
            throw new Exception("Usuario sem permissao para alterar senha");
        }


    }

}

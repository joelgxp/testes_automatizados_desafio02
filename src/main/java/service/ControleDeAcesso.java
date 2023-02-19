package service;

import model.Funcionario;
import model.Gerente;

public class ControleDeAcesso {

    private int senhaAcesso;
    private int senhaNova;

    private int getSenhaAcesso() {
        return senhaAcesso;
    }

    public void setSenhaAcesso(int senhaAcesso) {
        this.senhaAcesso = senhaAcesso;
    }

    private int getSenhaNova() {
        return senhaNova;
    }

    public void setSenhaNova(int senhaNova) {
        this.senhaNova = senhaNova;
    }

    public boolean verificaAcesso(Funcionario funcionario) throws Exception {
        if (funcionario.getSenha() == 0) {
            throw new Exception("Usuario sem acesso ao sistema");
        }
        if (senhaAcesso == funcionario.getSenha()) {
            return true;
        } else {
            return false;
        }

    }

    public void alterarSenha(Funcionario funcionario, int senhaNova) throws Exception {

        if(funcionario.getTipoAcesso() != "admin") {
            throw new Exception("Usuario sem permissao para alterar senha");
        }
            senhaNova = getSenhaNova();
            funcionario.setSenha(senhaNova);

    }

}

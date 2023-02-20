package service;

import model.Funcionario;

public class VerificaAcessoAdministrador {

    public VerificaAcessoAdministrador() {
    }

    public boolean autenticaMudarSenha (Funcionario funcionario) {
        if (funcionario.getTipoAcesso() == true) {
            return true;
        }
        return false;
    }
}

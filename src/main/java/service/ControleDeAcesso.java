package service;

import model.Funcionario;

public class ControleDeAcesso {

    private int senhaAcesso;

    public int getSenhaAcesso() {
        return senhaAcesso;
    }

    public void setSenhaAcesso(int senhaAcesso) {
        this.senhaAcesso = senhaAcesso;
    }

    //    public void acesso(Funcionario funcionario){
//        boolean autenticou = senha;
//        if(autenticou) {
//            System.out.println("Pode entrar");
//        } else {
//            System.out.println("Nao pode entrar");
//
//        }
//    }

    public boolean autentica(Funcionario f){
        if(senhaAcesso == f.getSenha()){
            return true;
        } else {
            return false;
        }
    }
}

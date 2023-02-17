package service;

import model.Funcionario;

public class ControleDeAcesso {
    private int senha;

    public void acesso(Funcionario a){
        boolean autenticou = a.autentica(this.senha);
        if(autenticou) {
            System.out.println("Pode entrar");
        } else {
            System.out.println("Nao pode entrar");

        }
    }
}

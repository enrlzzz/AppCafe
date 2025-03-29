package controller;

import model.ItensCafe;
import util.Utilitarios;
import view.CafeView;

public class CafeController {
    CafeView view = new CafeView();
    public void iniciarPreparoCafe() {
        ItensCafe itens = new ItensCafe(

        view.perguntaItem("Pó de Café"),
        view.perguntaItem("Àgua"),
        view.perguntaItem("Fogo"),
        view.perguntaItem("Coador"),
        view.perguntaItem("Bule")
        );
        
        if(itens.verificarItens()) {
            prepararCafe(); 
        } else {
            CafeView.exibirMensagem("Não é possível fazer o café, pois faltam alguns itens!");
        }


    }

    public void prepararCafe() {
    CafeView.exibirMensagem("Passo 1: Colocando a água para ferver...");
        Utilitarios.aguarde(1000);

        CafeView.exibirMensagem("Passo 2: Aguardando a água ferver...");
        Utilitarios.aguarde(1000);

        CafeView.exibirMensagem("Passo 3: Colocando o pó de café no coador...");
        Utilitarios.aguarde(1000);

        CafeView.exibirMensagem("Passo 4: Coando o café...");
        Utilitarios.aguarde(1000);

        CafeView.exibirMensagem("Passo 5: Café pronto! Aproveite!\n😎😉");
    }

}


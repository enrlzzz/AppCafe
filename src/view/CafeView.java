package view;

import java.util.Scanner;

public class CafeView {

    Scanner entrada = new Scanner(System.in);
    
    public boolean perguntaItem(String item) {
        System.out.println("Você tem" + item + "? (1 para sim | 0 para Não: )");
        int resposta = entrada.nextInt();
        return resposta == 1;
    }

    public static void exibirMensagem(String mensagem) {
        System.out.println(mensagem);

    }


}


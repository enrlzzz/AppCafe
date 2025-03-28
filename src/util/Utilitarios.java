package util;

public class Utilitarios {
    
public static void aguarde(int milisegundos) {
    try {
        Thread.sleep(milisegundos);
    } catch (InterruptedException e) {
        System.err.println("Erro na pausa:" + e.getMessage());;
    }
}

}


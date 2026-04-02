
import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {


    public static void main(String[] args) {

        double mesada = 50.0;

        while(mesada >0) {
            Double valorDoce = valorAleatorio();
            if (valorDoce > mesada) 
                valorDoce = mesada;
            System.out.println("Valor do doce: " + valorDoce + "Adicionando ao carrinho...");
            mesada = mesada - valorDoce;
        }
        System.out.println("Valor da mesada: " + mesada);
        System.out.println("Acabou a mesada, não tem mais doces...");
    }
    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 15);
    }
}
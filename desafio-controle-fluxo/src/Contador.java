import java.util.Scanner;
public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o primeiro parametro: ");
        int parametro1 = scan.nextInt();
        System.out.print("Digite o segundo parametro: ");   
        int parametro2 = scan.nextInt();

        try{

            contar(parametro1, parametro2);

        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }

    }

    static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException {
        if (parametro1 < parametro2) {
            throw new ParametrosInvalidosException("O primeiro parametro deve ser maior que o segundo parametro");
        }

        int contagem = parametro1-parametro2;

        for (int i = 0; i <= contagem; i++) {
            System.out.println("Imprimindo o numero: " + i);
        }

    }
}

class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String message) {
        super(message);
    }
}


import java.util.Scanner;
public class Maior {
    
    public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);

        int numero1, numero2, numero3;

        System.out.print("Digite o primeiro número: ");
        numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        numero2 = scanner.nextInt();

        System.out.print("Digite o terceiro número: ");
        numero3 = scanner.nextInt();

        if (numero1 > numero2 && numero1 > numero3){
            System.out.println("O maior numero é o primeiro : " + numero1);
        } else if (numero2 > numero1 && numero2 > numero3){
            System.out.println("O maior numero é o segundo  : " + numero2);
        } else {
            System.out.println("O maior numero é o terceiro  : " + numero3);  
        }


    }
}

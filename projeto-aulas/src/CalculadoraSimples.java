
import java.util.Scanner;

public class CalculadoraSimples {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: "); 
        int numero1 = scanner.nextInt();

        System.out.print("Digite a operação desejada (+, -, *, /): ");  
        String operacao = scanner.next();


        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();



        int resultado = 0; 

        switch (operacao) {
            case "+":
                resultado = numero1 + numero2;
                break;
                case "-":
                    resultado = numero1 - numero2;
                    break;
                case "*":
                    resultado = numero1 * numero2;
                    break;
                case "/":
                    resultado = numero1 / numero2;
                    break;

        }    

        System.out.println("Resultado: " + resultado);
    }




    
}

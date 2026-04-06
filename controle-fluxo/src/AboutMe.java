import java.util.InputMismatchException;
import java.util.Scanner;

public class AboutMe {

    public static void main(String[] args){

     try{

        Scanner  scanner = new Scanner(System.in);

        System.out.print("Qual é o seu nome? ");
        String name = scanner.nextLine();

        System.out.print("Qual é a sua idade? ");
        int age = scanner.nextInt();

        System.out.print("Qual é a sua altura? ");
        double height = scanner.nextDouble();

     } catch(InputMismatchException e) {
        System.out.println("Entrada inválida. Por favor, insira os dados corretamente. De forma numerica");
     }

    }
}
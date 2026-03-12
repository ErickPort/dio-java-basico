import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   

        System.out.print("Digite o numero de linha que deve ter o triangulo: ");
        int linhas = scanner.nextInt(); 
        for (int i = 1; i <= linhas; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }   


    }
}

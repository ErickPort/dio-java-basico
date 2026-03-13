import java.util.Scanner;

public class Termos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   
    
        int numero = 0;
        int soma = 0;   

        System.out.print("Digite a quantidade de termos 1+11+111... que deseja somar: ");
        numero = scanner.nextInt(); 

        for (int i = 1; i <= numero; i++) {
            int termo = 0;
            for (int j = 1; j <= i; j++) {
                termo += Math.pow(10, j - 1);
            }
            soma += termo;
        }
        System.out.println("A soma dos termos é: " + soma);


    }}
import java.util.Random;
import java.util.Scanner;

public class jogoAdivinha {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroAleatorio = random.nextInt(20) + 1; 
        int palpite = 0;

        System.out.println("Bem-vindo ao jogo de adivinhação! TENTE ADIVINHAR O NÚMERO ENTRE 1 E 20.");

    while (palpite != numeroAleatorio) {
        System.out.print("Digite seu palpite: ");
        palpite = scanner.nextInt();

        if (palpite < numeroAleatorio) {
            System.out.println("Tente um número maior!");
        } else if (palpite > numeroAleatorio) {
            System.out.println("Tente um número menor!");
        } else {
            System.out.println("Parabéns! Você adivinhou o número!");
        }




        
    }
}}
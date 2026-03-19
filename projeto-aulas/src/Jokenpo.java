import java.util.Random;
import java.util.Scanner;   
public class Jokenpo{


public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

int escolhaComputador = random.nextInt(3)+1;
int escolha = 0;


System.out.println("Bem-vindo ao jogo de Jokenpo!");

System.out.print ("Digite sua escolha (1 - Pedra, 2 - Papel, 3 - Tesoura): ");
    escolha = scanner.nextInt();

    while (escolha < 1 || escolha > 3) {
        System.out.print("Escolha inválida. Digite novamente (1 - Pedra, 2 - Papel, 3 - Tesoura): ");
        escolha = scanner.nextInt();
    }
if (escolhaComputador == escolha) {
    System.out.println("Empate! O computador também escolheu o mesmo.");
} else if ((escolha == 1 && escolhaComputador == 3) || 
           (escolha == 2 && escolhaComputador == 1) || 
           (escolha == 3 && escolhaComputador == 2)) {
    System.out.println("Parabéns! Você venceu!");
} else {
    System.out.println("Que pena! O computador venceu!");
}
}
}
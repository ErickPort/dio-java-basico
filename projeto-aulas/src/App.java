
import java.util.Scanner;

public class App {
public static void main(String[] args) {
    System.out.println("Hello, World!");

// Variáveis e constantes
    String nome = "Erick";
    String sobrenome ="Porto";
    int idade = 10;
    float altura = 1.75f;
    final String NOME_COMPLETO = "Erick Silva";
    idade = 19; 
    String nomeMae = "Deliane";
    long numeroTelefone = 1234567890L;
    String nomeCompleto = nomeCompleto(nome, sobrenome);

    System.out.println("Meu nome é " + NOME_COMPLETO + ", tenho "
     + idade + " anos e minha altura é " + altura + "m. Minha mãe se chama " + nomeMae + 
     " e meu número de telefone é " + numeroTelefone + "."  );

     Scanner scanner = new Scanner(System.in);
     System.out.print("Digite seu nome: ");
     String nomeDigitado = scanner.nextLine();

    System.out.print("Digite o ano de fabricação do seu carro: ");
        int anoFabricacao = scanner.nextInt();

    System.out.print("Digite o primeiro numero: ");
    int primeiroNumero = scanner.nextInt();

    System.out.print("Digite o segundo numero: ");
    int segundoNumero = scanner.nextInt();

System.out.println("Olá, " + nomeDigitado + "! Bem-vindo ao curso de Java Básico.");
System.out.println("Seu carro foi fabricado em " + anoFabricacao + ".");
System.out.println("A soma dos números é: " + (primeiroNumero + segundoNumero));
System.out.println(nomeCompleto);

idade = 32;





 
}


public static String nomeCompleto(String nome, String sobrenome) {
    return nome + " " + sobrenome;





} 



  

} 

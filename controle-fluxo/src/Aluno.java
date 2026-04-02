
import java.util.Scanner;

public class Aluno {
public static void main(String[] args) {
    int nota;

Scanner scanner = new Scanner(System.in);

System.out.print("Digite a nota do aluno: ");
nota = scanner.nextInt();

String resultado = (nota >= 7) ? "Aprovado" : "Reprovado";
System.out.println("O aluno está: " + resultado);

}
   








}


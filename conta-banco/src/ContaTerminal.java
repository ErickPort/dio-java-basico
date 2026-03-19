import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número da conta: ");
        int numeroConta = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite o número da agência: ");
        String agencia = scanner.nextLine();

        System.out.print("Digite o nome do titular da conta: ");
        String nomeTitular = scanner.nextLine();

        System.out.print("Digite o saldo inicial da conta: ");
        double saldoInicial = scanner.nextDouble();

        System.out.println("Olá " + nomeTitular
                + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numeroConta
                + " e seu saldo inicial é de R$" + saldoInicial);

        scanner.close();
    }
}
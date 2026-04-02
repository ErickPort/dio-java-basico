public class Saque {
    public static void main(String[] args)  {
        double saldo = 1000.00; 
        double valorSaque = 1200.00; 

        if (valorSaque < saldo) {
   
            saldo = saldo - valorSaque;
            System.out.println("Saque realizado com sucesso. Saldo atual: " + saldo);

        }
           
        else
            System.out.println("Saldo insuficiente para realizar o saque.");

    }
}

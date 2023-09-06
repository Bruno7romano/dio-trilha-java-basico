import java.util.Scanner;

public class ContaTerminal {
   
    public static void main(String[] args) throws Exception {
     
     Scanner ler = new Scanner(System.in);
        int Numero;
        String Agencia, NomeCliente;
        double  Saldo;

        System.out.printf("Informe o seu nome por favor: ");
         NomeCliente = ler.next();    
        
        System.out.printf("Por favor, informe o número da conta: ");
         Numero = ler.nextInt();
    
        System.out.printf("Informe a agência: ");
         Agencia = ler.next();

        System.out.printf("Informe o valor que deseja depositar: ");
            Saldo = ler.nextDouble();

        ler.close();

        System.out.println("Olá, " + NomeCliente + ".\n" + "Sua agencia é: " + Agencia + "\n" + "Sua Conta é: " + Numero + "\n" + "Seu saldo é: " + Saldo);
    }
}

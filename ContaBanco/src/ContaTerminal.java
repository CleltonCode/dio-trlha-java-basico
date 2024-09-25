import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência!");
        String agenciaCliente = in.nextLine();
        System.out.println("Por favor, digite o seu nome completo!");
        String nomeCliente = in.nextLine();
        System.out.println("Por favor, digite o número da sua conta!");
        int numeroConta = in.nextInt();
        System.out.println("Por favor, digite o seu saldo inicial!");
        double saldoCliente = in.nextDouble();
        System.out.println("*************************");
        System.out.println("Olá " + nomeCliente + " Obrigado por criar uma conta em nosso banco!");
        System.out.println("Sua agência é " + agenciaCliente);
        System.out.println("Conta " + numeroConta);
        System.out.println("Saldo disponível " + saldoCliente + " ja está disponível para saque. ");
        System.out.println("*************************");
        in.close();
    }
}

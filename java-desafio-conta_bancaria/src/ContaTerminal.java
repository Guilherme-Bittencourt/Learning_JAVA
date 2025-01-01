import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ContaBanco contaBanco = new ContaBanco();

        System.out.println("Por favor, digite o seu nome: ");
        String nomeCliente = scan.nextLine();
        contaBanco.inserirNome(nomeCliente);

        System.out.println("Por favor, digite a sua conta: ");
        int conta = scan.nextInt();
        scan.nextLine();
        contaBanco.inserirConta(conta);

        System.out.println("Por favor, digite a sua agência: ");
        String agencia = scan.nextLine();
        contaBanco.inserirAgencia(agencia);

        System.out.println("Por favor, digite o seu saldo: ");
        double saldo = scan.nextDouble();
        scan.nextLine();
        contaBanco.inserirSaldo(saldo);

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + ", sua conta " + conta + ", e seu saldo " + saldo + " já está disponível para saque.");
        scan.close();
    }
}

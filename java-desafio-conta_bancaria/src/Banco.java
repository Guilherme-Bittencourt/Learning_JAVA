import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criação do objeto conta
        Conta conta = new Conta();

        // Entrada do nome do cliente
        System.out.println("Digite seu nome completo:");
        String nome = scanner.nextLine();
        conta.setNomeCliente(nome);

        // Entrada do número da conta
        System.out.println("Digite o número da sua conta:");
        int numeroConta = scanner.nextInt();
        conta.setNumeroConta(numeroConta);

        // Entrada da agência
        scanner.nextLine();  // Consumir a linha em branco
        System.out.println("Digite o número da sua agência:");
        String agencia = scanner.nextLine();
        conta.setAgencia(agencia);

        // Entrada do saldo inicial
        System.out.println("Digite o saldo inicial da sua conta:");
        double saldoInicial = scanner.nextDouble();
        conta.setSaldo(saldoInicial);

        // Exibindo as informações da conta
        System.out.println("\nCadastro realizado com sucesso!");
        System.out.println("Cliente: " + conta.getNomeCliente());
        System.out.println("Agência: " + conta.getAgencia());
        System.out.println("Número da Conta: " + conta.getNumeroConta());
        System.out.println("Saldo: R$ " + conta.getSaldo());
        
        scanner.close();
    }
}
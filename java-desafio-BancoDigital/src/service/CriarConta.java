package service;

import model.InfoClientes;
import java.util.Scanner;

public class CriarConta {

    public static InfoClientes criarConta(Scanner scan) {
        InfoClientes cliente = new InfoClientes();

        System.out.println("Por favor, digite o seu nome: ");
        String nomeCliente = scan.nextLine();
        cliente.setNome(nomeCliente);

        System.out.println("Por favor, digite a sua idade: ");
        int idadeCliente = scan.nextInt();
        cliente.setIdade(idadeCliente);
        scan.nextLine(); // Limpa a quebra de linha restante

        System.out.println("Por favor, digite o número da conta: ");
        int contaCliente = scan.nextInt();
        cliente.setConta(contaCliente);
        scan.nextLine(); // Limpa a quebra de linha restante

        System.out.println("Por favor, digite o número da agência: ");
        String agenciaCliente = scan.nextLine();
        cliente.setAgencia(agenciaCliente);

        System.out.println("Por favor, digite o seu saldo: ");
        double saldoCliente = scan.nextDouble();
        cliente.setSaldo(saldoCliente);
        scan.nextLine(); // Limpa a quebra de linha restante após o saldo

        return cliente;
    }
}

package service;

import model.InfoClientes;
import java.util.Scanner;

public class TransacoesBancarias {
    public static void encontrarCliente(InfoClientes[] clientes, Scanner scan) {
        System.out.println("Digite o número da Agência:");
        String agenciaCliente = scan.nextLine();
        System.out.println("Digite o número da Conta:");
        int contaCliente = scan.nextInt();
        scan.nextLine();

        boolean clienteEncontrado = false;
        
        for (InfoClientes cliente : clientes) {
            if (cliente.getAgencia().equals(agenciaCliente) && cliente.getConta() == contaCliente) {
                clienteEncontrado = true;
                System.out.println("Conta encontrada. Bem-vindo, " + cliente.getNome());
                System.out.println("O que deseja realizar? \n");
                System.out.println("Digite 1 para verificar o extrato");
                System.out.println("Digite 2 para realizar um saque ");
                System.out.println("Digite 3 para realizar um depósito");
                System.out.println("Digite 4 para realizar uma transferência");
                
                int option = scan.nextInt();
                scan.nextLine();
                double valor;
                
                switch (option) {
                    case 1:
                        System.out.println("O saldo atual é de: R$" + cliente.getSaldo());
                        break;
                    case 2:
                        System.out.println("Digite o valor a ser sacado");
                        valor = scan.nextDouble();
                        cliente.sacar(valor);
                        break;
                    case 3:
                        System.out.println("Digite o valor a ser depositado");
                        valor = scan.nextDouble();
                        cliente.depositar(valor);
                        break;
                    case 4:
                        System.out.println("Digite o valor a ser transferido");
                        valor = scan.nextDouble();
                        cliente.transferir(clientes, valor, scan);
                        break;
                    default:
                        System.out.println("Opção inválida.");
                        break;
                }
                break; // Encerra o loop, pois o cliente foi encontrado
            }
        }

        if (!clienteEncontrado) {
            System.out.println("Cliente não encontrado.");
        }
    }
}

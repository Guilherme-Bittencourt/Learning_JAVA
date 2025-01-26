package bancodigital;

import service.CriarConta;
import model.InfoClientes;
import service.TransacoesBancarias;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Criar novos clientes
        InfoClientes[] novosClientes = new InfoClientes[2]; // Array para armazenar os clientes

        int opcao;
        do {
            // Exibe o menu
            System.out.println("Digite a opção que deseja: \n");
            System.out.println("Digite 1 para criar nova conta.");
            System.out.println("Digite 2 para realizar transações bancárias (saque, depósito, transferência).");
            System.out.println("Digite 0 para sair.");
            opcao = scan.nextInt();
            scan.nextLine(); // Para consumir a linha em branco deixada pelo nextInt()

            switch (opcao) {
                case 1:
                    // Criar novas contas
                    for (int clientes = 0; clientes < 2; clientes++) {
                        novosClientes[clientes] = CriarConta.criarConta(scan);
                        System.out.println("Cliente Cadastrado: " + novosClientes[clientes].getNome());
                        if (clientes == (2 - 1)) {
                            System.out.println("Limite de contas atingido.");
                        }
                    }
                    break;

                case 2:
                    // Chama o método para buscar cliente e realizar transações
                    TransacoesBancarias.encontrarCliente(novosClientes, scan);
                    break;

                case 0:
                    System.out.println("Saindo... Até logo!");
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }

        } while (opcao != 0); // O loop continua até o usuário escolher sair (opção 0)

        scan.close();
    }
}

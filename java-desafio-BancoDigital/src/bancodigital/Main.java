package bancodigital;

import service.CriarConta;
import model.InfoClientes;
import service.TransacoesBancarias;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        InfoClientes[] novosClientes = new InfoClientes[2];

        int opcao;
        do {
            // Exibe o menu
            System.out.println("Digite a opção que deseja: \n");
            System.out.println("Digite 1 para criar nova conta.");
            System.out.println("Digite 2 para realizar transações bancárias (saque, depósito, transferência).");
            System.out.println("Digite 0 para sair.");
            opcao = scan.nextInt();
            scan.nextLine();

            switch (opcao) {
                case 1:
                    // Cria apenas uma conta de cada vez
                    for (int i = 0; i < novosClientes.length; i++) {
                        if (novosClientes[i] == null) {
                            novosClientes[i] = CriarConta.criarConta(scan);
                            System.out.println("Cliente Cadastrado: " + novosClientes[i].getNome());
                            break;  // Sai do loop após criar a primeira conta disponível
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

        } while (opcao != 0);

        scan.close();
    }
}

package bancodigital;

import service.ContaService;
import model.InfoClientes;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int total = 2;
        InfoClientes[] novosClientes = new InfoClientes[total];
        Scanner scan = new Scanner(System.in);

        for (int clientes = 0; clientes < total; clientes++) {
            novosClientes[clientes] = ContaService.criarConta(scan);
            System.out.println("Cliente Cadastrado: " + novosClientes[clientes].getNome());
            if (clientes == (total - 1))
                System.out.println("Limite de contas atingido");
        }
        scan.close();
    }
}

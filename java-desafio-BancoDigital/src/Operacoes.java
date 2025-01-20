import java.util.Scanner;

public class Operacoes {

    public static void main(String[] args) {
        int total = 2;
        InfoClientes[] novosClientes = new InfoClientes[total];
        Scanner scan = new Scanner(System.in);

        for(int clientes = 0; clientes < total; clientes++){
        novosClientes[clientes] = criarConta(scan);
        System.out.println("Cliente Cadastrado: " + novosClientes[clientes].getNome());
        if(clientes == (total-1))
            System.out.println("Limite de contas atingido");
    }
        scan.close();
    }

    public static InfoClientes criarConta(Scanner scan) {
        InfoClientes cliente = new InfoClientes();
    
        System.out.println("Por favor, digite o seu nome: ");
        String nomeCliente = scan.nextLine();
        cliente.setNome(nomeCliente);
        
        System.out.println("Por favor, digite a sua idade: ");
        int idadeCliente = scan.nextInt();
        cliente.setIdade(idadeCliente);
        scan.nextLine(); // Limpa o buffer, lembra desse bagaça (serve pra int e double)
    
        System.out.println("Por favor, digite o número da conta: ");
        int contaCliente = scan.nextInt();
        cliente.setConta(contaCliente);
        scan.nextLine(); // Limpa o buffer, lembra desse bagaça (serve pra int e double)
    
    
        System.out.println("Por favor, digite o número da agência: ");
        String agenciaCliente = scan.nextLine();
        cliente.setAgencia(agenciaCliente);
    
        System.out.println("Por favor, digite o seu saldo: ");
        double saldoCliente = scan.nextDouble();
        cliente.setSaldo(saldoCliente);
        scan.nextLine();
        
        return cliente;
    }
    
}

package model;

import java.util.Scanner;

public class InfoClientes {
    private String nome;
    private int idade;
    private int conta;
    private String agencia;
    private double saldo;

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso!");
            return true;
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
            return false;
        }
    }

    // Método para realizar depósito
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso!");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public boolean transferir(InfoClientes[] clientes, double valor, Scanner scan) {
        System.out.println("Digite o número da Agência de destino:");
        String agenciaDestino = scan.nextLine();
        System.out.println("Digite o número da Conta de destino:");
        int contaDestino = scan.nextInt();
        scan.nextLine();

        InfoClientes contaDestinoCliente = null;
        // Encontrar a conta de destino
        for (InfoClientes cliente : clientes) {
            if (cliente.getAgencia().equals(agenciaDestino) && cliente.getConta() == contaDestino) {
                contaDestinoCliente = cliente;
                break;
            }
        }

        // Verificando se a conta de destino foi encontrada
        if (contaDestinoCliente != null) {
            if (valor > 0 && saldo >= valor) {
                saldo -= valor;
                contaDestinoCliente.setSaldo(contaDestinoCliente.getSaldo() + valor);
                System.out.println("Transferência de R$" + valor + " realizada com sucesso!");
                return true;
            } else {
                System.out.println("Valor de transferência inválido ou saldo insuficiente.");
                return false;
            }
        } else {
            System.out.println("Conta de destino não encontrada.");
            return false;
        }
    }
}

public class InfoClientes {
    String nome;
    int idade; 
    int conta;
    String agencia;
    double saldo;

    public void setNome(String nomeCliente) {
        this.nome = nomeCliente;
    }
    
    public String getNome() {
        return this.nome;
    }

    public void setIdade(int idadeCliente) {
        this.idade = idadeCliente;
    }
    
    public int getIdade() {
        return this.idade;
    }

    public void setAgencia(String agenciaCliente){
        this.agencia = agenciaCliente;
    }

    public String getAencia(){
        return this.agencia;
    }
    
    public void setConta(int contaCliente){
        this.conta = contaCliente;
    }

    public int getConta(){
        return this.conta;
    }

    public void setSaldo(double saldoCliente){
        this.saldo = saldoCliente;
    }

    public double getSaldo(){
        return this.saldo;
    }
}
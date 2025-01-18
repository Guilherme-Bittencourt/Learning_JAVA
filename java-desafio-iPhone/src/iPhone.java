// Classe iPhone que implementa as interfaces
public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    // Implementações da interface ReprodutorMusical
    @Override
    public void tocar() {
        System.out.println("Iniciando a música...");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando uma nova música...");
    }

    // Implementações da interface AparelhoTelefonico
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o número: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo a chamada...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando o correio de voz...");
    }

    // Implementações da interface NavegadorInternet
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Abrindo uma nova aba...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página...");
    }

    // Método main para testar a implementação
    public static void main(String[] args) {
        iPhone iphone = new iPhone();
        
        // Testando o reprodutor musical
        iphone.tocar(); 
        iphone.pausar();
        iphone.selecionarMusica();

        // Testando o aparelho telefônico
        iphone.ligar("123-456-789"); 
        iphone.atender();
        iphone.iniciarCorreioVoz();

        // Testando o navegador de internet
        iphone.exibirPagina("www.exemplo.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}

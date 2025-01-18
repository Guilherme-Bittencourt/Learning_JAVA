// Classe iPhone que implementa todas as interfaces
public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    // Implementações da interface ReprodutorMusical
    @Override
    public void tocarMusica() {
        System.out.println("Tocando música...");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Música pausada.");
    }

    @Override
    public void pararMusica() {
        System.out.println("Música parada.");
    }

    @Override
    public void avancarMusica() {
        System.out.println("Avançando para a próxima música.");
    }

    // Implementações da interface AparelhoTelefonico
    @Override
    public void fazerChamada(String numero) {
        System.out.println("Ligando para " + numero);
    }

    @Override
    public void atenderChamada() {
        System.out.println("Atendendo a chamada.");
    }

    @Override
    public void encerrarChamada() {
        System.out.println("Chamada encerrada.");
    }

    // Implementações da interface NavegadorInternet
    @Override
    public void abrirPaginaWeb(String url) {
        System.out.println("Abrindo página: " + url);
    }

    @Override
    public void fecharPaginaWeb() {
        System.out.println("Fechando página.");
    }

    @Override
    public void navegarPara(String url) {
        System.out.println("Navegando para: " + url);
    }

    // Método main para testar a implementação
    public static void main(String[] args) {
        iPhone iphone = new iPhone();
        iphone.tocarMusica(); // Teste do reprodutor musical
        iphone.fazerChamada("123-456-789"); // Teste do aparelho telefônico
        iphone.abrirPaginaWeb("www.exemplo.com"); // Teste do navegador de internet
    }
}
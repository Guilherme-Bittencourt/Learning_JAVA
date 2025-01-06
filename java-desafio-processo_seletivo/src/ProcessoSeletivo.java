import java.util.Random;

public class ProcessoSeletivo {

    
    static String[] selecionados = new String[5];
    static int candidatosSelecionados = 0;

    public static void main(String[] args) throws Exception {
        
        selecionarCandidato(1800.0, "FELIPE");
        selecionarCandidato(2200.0, "MARCIA");
        selecionarCandidato(1500.0, "JULIA");
        selecionarCandidato(2000.0, "PAULO");
        selecionarCandidato(1900.0, "AUGUSTO");
        selecionarCandidato(1700.0, "MONICA");

        imprimirCandidatosSelecionados();
        realizarLigacoes();
    }

    
    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO RESULTADO DEMAIS CANDIDATOS");
        }
    }

    
    static void selecionarCandidato(double salarioPretendido, String nomeCandidato) {
        double salarioBase = 2000.0;

        if (salarioPretendido <= salarioBase) {
            if (candidatosSelecionados < selecionados.length) {
                selecionados[candidatosSelecionados] = nomeCandidato;
                candidatosSelecionados++;
                System.out.println("Candidato " + nomeCandidato + " foi selecionado com salário pretendido de R$" + salarioPretendido);
            } else {
                System.out.println("Limite de candidatos selecionados atingido.");
            }
        } else {
            System.out.println("Candidato " + nomeCandidato + " não foi selecionado devido ao salário pretendido.");
        }
    }

    
    static void imprimirCandidatosSelecionados() {
        System.out.println("\nLista de candidatos selecionados para contato:");
        for (int i = 0; i < candidatosSelecionados; i++) {
            System.out.println(selecionados[i]);
        }
    }

    
    static void realizarLigacoes() {
        Random random = new Random();

        System.out.println("\nRealizando ligações para os candidatos...");
        for (int i = 0; i < candidatosSelecionados; i++) {
            String candidato = selecionados[i];
            boolean conseguiuContato = false;

            for (int tentativa = 1; tentativa <= 3; tentativa++) {
                int resultadoLigacao = random.nextInt(5) + 1; // Gera um número entre 1 e 5
                if (resultadoLigacao == 1) {
                    System.out.println("Conseguimos contato com " + candidato + " após " + tentativa + " tentativa(s).");
                    conseguiuContato = true;
                    break;
                }
            }

            if (!conseguiuContato) {
                System.out.println("Não conseguimos fazer contato com o candidato " + candidato + ".");
            }
        }
    }
}

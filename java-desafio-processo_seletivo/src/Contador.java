import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o primeiro número: ");
            int parametro1 = scanner.nextInt();

            System.out.print("Digite o segundo número: ");
            int parametro2 = scanner.nextInt();

            contar(parametro1, parametro2);

        } catch (ParametrosInvalidosException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro: Entrada inválida. Certifique-se de digitar números inteiros.");
        } finally {
            scanner.close();
        }
    }

    public static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException {
        if (parametro1 >= parametro2) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
        }

        int quantidadeInteracoes = parametro2 - parametro1;

        for (int i = 1; i <= quantidadeInteracoes; i++) {
            System.out.println("Imprimindo o número " + (parametro1 + i));
        }
    }
}

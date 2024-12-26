package edu.carlos.primeirasemana;

public class MinhaClasse {
    public static void main(String[] args) {
        String primeiroNome = "daniel";
        String segundoNome = "camelyer";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.print(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
    }
}

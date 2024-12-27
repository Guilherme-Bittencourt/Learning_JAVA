public class Televisao {
        int volume=0;
        int canal=1;
        boolean ligada = false;

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

    public void aumentarCanal(){
        canal++;
    }
    public void diminuirCanal(){
        canal--;
    }
    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando o volume para: " + volume);
    }
    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo o volume para: " + volume);
    }
    public void ligarTv(){
        ligada = true;
    }
    public void desligarTv(){
        ligada = false;
    }
}

public class SmartTv{
    boolean ligada = false;
    int canal = 31;
    int volume = 25;

    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }

    public void aumentarVolume(){
        volume++;
    }

    public void diminuirVolume(){
        volume--;
    }

    public void diminuirCanal(){
        canal--;
    }
    public void aumentarCanal(){
        canal++;
    }
    public void escolherCanal(int valorCanal){
        canal = valorCanal;
    }
}
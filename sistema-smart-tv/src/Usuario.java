public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Canal atual?  " + smartTv.canal);
        System.out.println("Volume atual? " + smartTv.volume);



        smartTv.ligar();
        System.out.println("Novo Status -> TV Ligada? : " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status -> TV Ligada? : " + smartTv.ligada);


        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume atual : " + smartTv.volume);

        smartTv.diminuirCanal();
        smartTv.diminuirCanal();
        smartTv.diminuirCanal();
        smartTv.aumentarCanal();
        System.out.println("Canal é: " + smartTv.canal);

        smartTv.escolherCanal(31);

        System.out.println("Mudou o canal para: " + smartTv.canal);
    }
}

public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("Tv Ligada? " + smartTv.ligada);
        System.out.println("Canal: " + smartTv.canal);
        System.out.println("Volume: " + smartTv.volume);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.mudarCanal(15);
        System.out.println("Canal atual: " + smartTv.canal);

        smartTv.ligar();
        System.out.println("Novo status -> Tv Ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo status -> Tv Ligada? " + smartTv.ligada);
    }
}

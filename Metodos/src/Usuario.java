public class Usuario {
    public static void main(String[] args) {

        SmartTv SmartTv = new SmartTv();

        System.out.println("TV Ligada?" + "=" + SmartTv.ligada);
        System.out.println("Canal atual" + "=" + SmartTv.canal);
        System.out.println("Valume atual" + "=" + SmartTv.volume);

        SmartTv.aumentarVolume();
        SmartTv.aumentarVolume();
        SmartTv.aumentarVolume();
        SmartTv.aumentarVolume();

        System.out.println(SmartTv.volume);

    }
}

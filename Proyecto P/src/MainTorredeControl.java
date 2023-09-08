public class MainTorredeControl {
    public static void main(String[] args) {
        TorreDeControl torreDeControl = new TorreDeControl();

        torreDeControl.agregarVueloAterrizar("AR156");
        torreDeControl.agregarVueloAterrizar("AR32");
        torreDeControl.agregarVueloDespegar("KLM1267");

        torreDeControl.gestionarVuelos();
    }
}
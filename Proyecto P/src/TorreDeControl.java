import java.util.LinkedList;
import java.util.Queue;

public class TorreDeControl {
    public Queue<String> vuelosAterrizar;
    public Queue<String> vuelosDespegar;

    public TorreDeControl() {
        this.vuelosAterrizar = new LinkedList<>();
        this.vuelosDespegar = new LinkedList<>();
    }

    public void agregarVueloAterrizar(String vuelo) {
        vuelosAterrizar.offer(vuelo);
    }

    public void agregarVueloDespegar(String vuelo) {
        vuelosDespegar.offer(vuelo);
    }

    public void gestionarVuelos() {
        while (!vuelosAterrizar.isEmpty()) {
            String vuelo = vuelosAterrizar.poll();
            System.out.println("El vuelo " + vuelo + " aterrizó con éxito.");
        }

        while (!vuelosDespegar.isEmpty()) {
            String vuelo = vuelosDespegar.poll();
            System.out.println("El vuelo " + vuelo + " despegó con éxito.");
        }

        System.out.println("No hay vuelos en espera.");
    }
}
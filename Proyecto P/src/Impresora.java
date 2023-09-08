import java.util.LinkedList;
import java.util.Queue;

public class Impresora {
    private int capacidadMaxima;
    private int nivelTinta;
    private Queue<String> documentos;

    public Impresora(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        this.nivelTinta = capacidadMaxima;
        this.documentos = new LinkedList<>();
    }

    public void encolarDocumento(String nombreDocumento) {
        documentos.offer(nombreDocumento);
    }

    public void imprimirDocumentos() {
        if (documentos.isEmpty()) {
            System.out.println("No hay documentos encolados.");
            return;
        }

        while (!documentos.isEmpty()) {
            String documento = documentos.peek();

            if (nivelTinta <= 0) {
                System.out.println("No hay tinta suficiente para imprimir el documento " + documento);
                break;
            }

            System.out.println("Imprimiendo el documento " + documento);
            documentos.poll();
            nivelTinta--;
        }
    }

    public void cargarTinta(int cantidadTinta) {
        nivelTinta += cantidadTinta;

        if (nivelTinta > capacidadMaxima) {
            nivelTinta = capacidadMaxima;
        }
    }
}
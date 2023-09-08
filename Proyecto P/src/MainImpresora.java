import java.util.Scanner;

public class MainImpresora {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("Ingrese la capacidad máxima de tinta de la impresora: ");
        int capacidadMaxima = scanner.nextInt();

        Impresora impresora = new Impresora(capacidadMaxima);

        while (true) {
            System.out.println("Ingrese una opción:");
            System.out.println("1. Encolar un documento");
            System.out.println("2. Imprimir los documentos encolados");
            System.out.println("3. Cargar tinta");
            System.out.println("4. Salir");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del documento: ");
                    String nombreDocumento = scanner.next();
                    impresora.encolarDocumento(nombreDocumento);
                    break;
                case 2:
                    impresora.imprimirDocumentos();
                    break;
                case 3:
                    System.out.print("Ingrese la cantidad de tinta a cargar: ");
                    int cantidadTinta = scanner.nextInt();
                    impresora.cargarTinta(cantidadTinta);
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Opción inválida.");
            }
            
        }
    }
}
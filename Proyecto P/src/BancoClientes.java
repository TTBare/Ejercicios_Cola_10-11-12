import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BancoClientes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Integer> clientesPar = new LinkedList<>();
        Queue<Integer> clientesImpar = new LinkedList<>();

        System.out.print("Ingrese la cantidad de clientes: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el DNI del cliente " + (i + 1) + ": ");
            int dni = scanner.nextInt();

            if (dni % 2 == 0) {
                clientesPar.offer(dni);
            } else {
                clientesImpar.offer(dni);
            }
        }

        System.out.println("Clientes con DNI terminado en número par:");
        while (!clientesPar.isEmpty()) {
            System.out.println(clientesPar.poll());
        }

        System.out.println("Clientes con DNI terminado en número impar:");
        while (!clientesImpar.isEmpty()) {
            System.out.println(clientesImpar.poll());
        }
        scanner.close();
    }
}
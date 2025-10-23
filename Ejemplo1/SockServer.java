import java.io.*;
import java.net.*;

public class SockServer {
    public static void main(String[] args) throws IOException {
        if (args.length != 1) {
            System.out.println("Uso: java SockServer <puerto>");
            // java SockServer 9099
            return;
        }

        int puerto = Integer.parseInt(args[0]);
        ServerSocket serverSocket = new ServerSocket(puerto);
        System.out.println("Servidor escuchando en el puerto: " + puerto);

        while (true) {
            Socket cliente = serverSocket.accept();
            BufferedReader entrada = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
            PrintWriter salida = new PrintWriter(cliente.getOutputStream(), true);

            int num1 = Integer.parseInt(entrada.readLine());
            int num2 = Integer.parseInt(entrada.readLine());
            int suma = num1 + num2;

            System.out.println("Servidor recibio: " + num1 + " y " + num2);
            salida.println("El resultado es: " + suma);

            cliente.close();
        }
    }
}

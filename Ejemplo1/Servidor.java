import java.io.*;
import java.net.*;

public class Servidor {
    public static void main(String[] args) throws IOException {
        ServerSocket servidor = new ServerSocket(9099);
        System.out.println("Servidor escuchando en el puerto 9099...");
        Socket cliente = servidor.accept();
        BufferedReader entrada = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
        PrintWriter salida = new PrintWriter(cliente.getOutputStream(), true);

        String mensaje = entrada.readLine();
        System.out.println("Cliente dice: " + mensaje);
        salida.println("Mensaje recibido: " + mensaje);

        cliente.close();
        servidor.close();
    }
}

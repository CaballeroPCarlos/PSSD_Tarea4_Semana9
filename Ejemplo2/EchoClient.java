import java.io.*;
import java.net.*;

public class EchoClient {
    public static void main(String[] args) {
        String servidor = "localhost"; // Dirección del servidor
        int puerto = 9099; // Mismo puerto del servidor
        try (Socket socket = new Socket(servidor, puerto);
                BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
                PrintWriter salida = new PrintWriter(socket.getOutputStream(), true);
                BufferedReader respuesta = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {

            System.out.println("Conectado al servidor. Escribe mensajes ('salir' para terminar).");
            String mensaje;
            while ((mensaje = entrada.readLine()) != null) {
                salida.println(mensaje);
                System.out.println("Servidor dice: " + respuesta.readLine());
                if (mensaje.equalsIgnoreCase("salir"))
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

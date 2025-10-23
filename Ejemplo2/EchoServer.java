import java.io.*;
import java.net.*;

public class EchoServer {
    public static void main(String[] args) throws IOException {
        int puerto = 9099; // Puerto donde el servidor escuchará
        try (ServerSocket serverSocket = new ServerSocket(puerto)) {
            System.out.println("Servidor iniciando en el puerto " + puerto);
            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("Cliente conectado.");

                BufferedReader entrada = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                PrintWriter salida = new PrintWriter(socket.getOutputStream(), true);

                String mensaje;
                while ((mensaje = entrada.readLine()) != null) {
                    System.out.println("Recibido: " + mensaje);
                    salida.println("Eco: " + mensaje); // Devuelve el mensaje.
                    if (mensaje.equalsIgnoreCase("salir"))
                        break;
                }
                socket.close();
                System.out.println("Cliente desconectado.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

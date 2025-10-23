import java.io.*;
import java.net.*;

public class PSockClient {
    public static void main(String[] args) {
        String servidor = "localhost"; // Dirección del servidor
        int puerto = 9099; // Mismo puerto del servidor
        try (Socket socket = new Socket(servidor, puerto);
                BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
                PrintWriter salida = new PrintWriter(socket.getOutputStream(), true);
                BufferedReader respuesta = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {

            System.out.println("Conectado al servidor.\n");
            System.out.println("Escribe una operación (<n1> <operador> <n2>).\n");
            System.out.println("O 'salir' para terminar con la sesión.\n");
            String mensaje;
            while ((mensaje = entrada.readLine()) != null) {
                salida.println(mensaje);
                if (mensaje.equalsIgnoreCase("salir"))
                    break;
                System.out.println(respuesta.readLine());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

import java.io.*;
import java.net.*;

public class Cliente {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 9099);
        PrintWriter salida = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader entrada = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        salida.println("Hola servidor.");
        System.out.println("Respuesta: " + entrada.readLine());

        socket.close();
    }
}

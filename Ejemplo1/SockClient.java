import java.io.*;
import java.net.Socket;

public class SockClient {
    public static void main(String[] args) throws IOException {
        if (args.length != 4) {
            System.out.println("Uso: java SockClient <host> <puerto> <n1> <n2>");
            // java SockClient localhost 9099 34 56 (por ejemplo).
            return;
        }

        String host = args[0];
        int puerto = Integer.parseInt(args[1]);
        int n1 = Integer.parseInt(args[2]);
        int n2 = Integer.parseInt(args[3]);

        Socket socket = new Socket(host, puerto);
        PrintWriter salida = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader entrada = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        salida.println(n1);
        salida.println(n2);
        System.out.println("Respuesta del servidor: " + entrada.readLine());

        socket.close();
    }
}

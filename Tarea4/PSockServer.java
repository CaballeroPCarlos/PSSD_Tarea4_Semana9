import java.io.*;
import java.net.*;

public class PSockServer {
    public static void main(String[] args) {
        int puerto = 9099; // Puerto donde el servidor escuchará
        try (ServerSocket serverSocket = new ServerSocket(puerto)) {
            System.out.println("Servidor iniciando en el puerto " + puerto);
            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("Cliente conectado.");

                BufferedReader entrada = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                PrintWriter salida = new PrintWriter(socket.getOutputStream(), true);

                String operacion;
                while ((operacion = entrada.readLine()) != null) {
                    System.out.println("Operación recibida: " + operacion);
                    String[] partes = operacion.split(" ");

                    if (operacion.equalsIgnoreCase("salir"))
                        break;
                    else if (partes.length != 3) {
                        salida.println("Formato no válido.");
                    } else if (!validarOperacion(operacion)) {
                        salida.println("Solo números y operadores lógicos (+, -, * y /).");
                    } else {
                        double n1 = Double.parseDouble(partes[0]);
                        String op = partes[1];
                        double n2 = Double.parseDouble(partes[2]);
                        double resultado = 0;

                        switch (op) {
                            case "+":
                                resultado = n1 + n2;
                                break;
                            case "-":
                                resultado = n1 - n2;
                                break;
                            case "*":
                                resultado = n1 * n2;
                                break;
                            case "/":
                                resultado = (n2 != 0) ? n1 / n2 : Double.NaN;
                                break;
                        }

                        salida.println("Resultado: " + resultado);
                    }

                }
                socket.close();
                System.out.println("Cliente desconectado.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Método para verificar si la operación tiene un formato válido
    public static boolean validarOperacion(String operacion) {
        // Expresión regular: permite dígitos, espacios, punto decimal y los operadores
        // + - * /
        return operacion.matches("[0-9+\\-*/.\\s]+");
    }

}

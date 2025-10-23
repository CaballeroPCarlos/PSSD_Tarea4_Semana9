public class SumaArgs {

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.println("La suma es " + (a + b));
        // aquí se ejecuta: java SumaArgs <a> <b>, siendo a y b: números.
    }
}
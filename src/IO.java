import java.util.Scanner;

public class IO {
    public static void mostrarTexto(String texto){
        System.out.println(texto);
    }
    public static Scanner digitarValores(){
        return new Scanner(System.in);
    }

    // Método IO  para não precisar usar varios souts ou varios scans.
}

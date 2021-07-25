import java.util.ArrayList;
import java.util.List;

public class ListaDeMoradores {
    private static List<Pessoa> moradores = new ArrayList<>();

    public static void mostrarListadeMoradores(){
        System.out.println("Mostrar lista de moradores:" );
        for (Pessoa morador: moradores){
            System.out.println(morador);
        }

    }


}

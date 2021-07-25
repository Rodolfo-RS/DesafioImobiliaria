import java.util.ArrayList;
import java.util.List;

public class ListaDeMoradores {
    private static List<Pessoa> moradores = new ArrayList<>();

<<<<<<< HEAD
    public static void mostrarListadeMoradores() {
        System.out.println("Mostrar lista de moradores:");
        for (Pessoa morador : moradores) {
            System.out.println(morador);
        }
    }

        public static void validarMoradorPorCpf(String cpf) throws Exception {
            for (Pessoa morador : moradores) {
                if (morador.getCpf().equals(cpf)) {
                    throw new Exception("Nao é possivel cadastrar o morador, pois ja existe um morador com este cpf.");
                }
            }
        }
        public static void adcionarMorador (Pessoa morador) throws Exception {
            validarMoradorPorCpf(morador.getCpf());
            moradores.add(morador);
        }
    }
}

=======
    public static void mostrarListadeMoradores(){
        System.out.println("Mostrar lista de moradores:" );
        for (Pessoa morador: moradores){
            System.out.println(morador);
        }

    }


}
>>>>>>> a056c9559ae38f84bbed4c078e0f21d744e1c3a5

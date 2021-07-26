import java.util.ArrayList;
import java.util.List;
// classe Lista de moradores.
public class ListaDeMoradores {
    // dcalaração da lista moradores .
    private static List<Pessoa> moradores = new ArrayList<>();

    // método para percorrer e validar o morador pelo cpf, usando o throws exception.
    // for para percorrer a lista e if para comparar a String cpf.
    public static void validarMoradorPorCpf(String cpf) throws Exception {
        for (Pessoa morador : moradores) {
            if (morador.getCpf().equals(cpf)) {
                throw new Exception("Nao È possivel cadastrar o morador, pois ja existe um morador com este cpf.");
            }
        }
    }
    // Método para adicionar morador.
    public static void adcionarMorador (Pessoa morador) throws Exception {
        validarMoradorPorCpf(morador.getCpf());
        moradores.add(morador);
    }

}




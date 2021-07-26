
// classe morador sendo heranca da classe pessoa.
public class Morador extends Pessoa{

    public Morador() {
    }
    // declaraçao de morador.
    public Morador(String nome, String cpf) {
        // Usando o super para puxar nome e cpf de outra classe.
        super(nome,cpf);

    }
}

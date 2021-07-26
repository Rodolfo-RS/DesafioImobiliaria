import java.util.List;

// aqui criei a classe Imovel e seus atributos de forma emcapsulada.
public class Imovel {
    private Endereco endereco;
    private double valorAluguel;
    private Funcionario funcionario;
    private List<Morador> moradores;

    // Aqui criei o primeiro construtor vazio.
    public Imovel() {
    }
        // Aqui criei o construtor passando os argumentos.
    public Imovel(Endereco endereco, double valorAluguel, Funcionario funcionario, List<Morador> moradores) {
        this.endereco = endereco;
        this.valorAluguel = valorAluguel;
        this.funcionario = funcionario;
        this.moradores = moradores;
    }

    // Override para sobrepor o metodo da classe.
    @Override
    public String toString() {
        String dadosMoradores = "";
        for (Morador morador:moradores){
            dadosMoradores += morador + "\n";
        }
        return "" +
                "\n" + endereco +
                "\nValorAluguel:" + valorAluguel +
                "\nFuncionario:'" + funcionario + '\n' +
                "\nMoradores\n" + dadosMoradores + "\n";

    }
}

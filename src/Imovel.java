import java.util.List;

public class Imovel {
    private Endereco endereco;
    private double valorAluguel;
    private Funcionario funcionario;
    private List<Morador> moradores;

    public Imovel() {
    }

    public Imovel(Endereco endereco, double valorAluguel, Funcionario funcionario, List<Morador> moradores) {
        this.endereco = endereco;
        this.valorAluguel = valorAluguel;
        this.funcionario = funcionario;
        this.moradores = moradores;
    }

    @Override
    public String toString() {
        String dadosMoradores = "";
        for (Morador morador:moradores){
            dadosMoradores += morador + "\n";
        }
        return "" +
                "\n" + endereco +
                "\nValorAluguel=" + valorAluguel +
                "\nFuncionario='" + funcionario + '\n' +
                "\nMoradores\n" + dadosMoradores + "\n";

    }
}

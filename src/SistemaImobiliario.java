import java.util.ArrayList;
import java.util.List;

public class SistemaImobiliario {
    private static List<Imovel> listaImoveis = new ArrayList<>();

    public static void main(String[] args) {



        int opcao = 0;
        do {
            IO.mostrarTexto("\n\n[1] Novo imovel. ");
            IO.mostrarTexto("[2] Listar imoveis. ");
            IO.mostrarTexto("[3] Sair. ");
            IO.mostrarTexto("Digite a opcao: ");
            opcao = IO.digitarValores().nextInt();

            if (opcao != 3) {
                if(opcao == 1){
                    Imovel imovel = cadastrarImovel();
                    listaImoveis.add(imovel);

                } else if (opcao == 2){
                    listarImoveis();


                }
            }

        } while (opcao != 3);

    }
    public static void listarImoveis(){

        if (listaImoveis.isEmpty()){
            IO.mostrarTexto("Nao existe imoveis cadastrados");


        }else {
            IO.mostrarTexto("Lista de imoveis cadastrados:  ");

            for (Imovel imovel: listaImoveis){
                IO.mostrarTexto("Imovel\n ");

                System.out.println(imovel);
            }


        }



    }

    public static Imovel cadastrarImovel() {
        IO.mostrarTexto("Cadastro de imovel\n ");

        // Dados do endereco.
        IO.mostrarTexto("Por favor digite o nome da rua: ");
        String rua = IO.digitarValores().next();
        IO.mostrarTexto("Por favor digite o numero:");
        int numero = IO.digitarValores().nextInt();
        IO.mostrarTexto("Digite o bairro: ");
        String bairro = IO.digitarValores().next();
        IO.mostrarTexto("Digite o cep: ");
        String cep = IO.digitarValores().next();
    }

        public static void validarMoradorPorCpf(cpf) throws Exception{
            for (Pessoa morador : moradores){
                if (morador.getCpf().equals(cpf)){
                    throw new Exception("Nao é possivel cadastrar o morador, pois ja existe um morador com este cpf.");
                }
            }
        }
        public static void adcionarMorador(Pessoa morador) throws Exception{
            validarMoradorPorCpf(morador.getCpf());
            moradores.add(morador);
        }

    

        IO.mostrarTexto("Digite o complemento:");
        String complemento = IO.digitarValores().next();
        Endereco endereco = new Endereco(rua, numero, bairro, cep, complemento);

        IO.mostrarTexto("Digite o valor do aluguel; ");
        double valorAluguel = IO.digitarValores().nextDouble();

        // dados do funcionario.
        IO.mostrarTexto("Dados do Funcionario ");
        IO.mostrarTexto("Digite o nome do funcionario: ");
        String nomeDoFuncionario = IO.digitarValores().next();
        IO.mostrarTexto("Digite o cpf do funcionario: ");
        String cpfDoFuncionario = IO.digitarValores().next();

        Funcionario funcionario = new Funcionario(nomeDoFuncionario,cpfDoFuncionario);


        List<Morador> listaMoradores = new ArrayList<>();

        int opcao = 0;
        do {
            IO.mostrarTexto("[1] Novo morador. ");
            IO.mostrarTexto("[2] sair. ");
            IO.mostrarTexto("Digite a opcao: ");
            opcao = IO.digitarValores().nextInt();

            if (opcao != 2) {
                // dados do morador.
                IO.mostrarTexto("Dados do morador ");
                IO.mostrarTexto("Digite o nome do morador: ");
                String nomeDoMorador = IO.digitarValores().next();
                IO.mostrarTexto("Digite o cpf do morador: ");
                String cpfDoMorador = IO.digitarValores().next();

                Morador morador = new Morador(nomeDoMorador,cpfDoMorador);

                listaMoradores.add(morador);

            }



        } while (opcao != 2);




        Imovel imovel = new Imovel(endereco,valorAluguel,funcionario,listaMoradores);


        System.out.println("Imovel cadastrado");
        System.out.println(imovel);

        return imovel;









    }
}

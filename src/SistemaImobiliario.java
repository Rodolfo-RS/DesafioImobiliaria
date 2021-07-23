public class SistemaImobiliario {

    public static void cadastrarImovel(){
        IO.mostrarTexto("Por favor digite o nome da rua: ");
        String rua = IO.digitarValores().next();
        IO.mostrarTexto("Por favor digite o numero:");
        int numero = IO.digitarValores().next();
        IO.mostrarTexto("Digite o bairro: ");
        String bairro = IO.digitarValores().next();
        IO.mostrarTexto("Digite o cep: ");
        String cep = IO.digitarValores().next();
        IO.mostrarTexto("Digite o complemento:");
        String complemento = IO.digitarValores().next();

        Endereco endereco = new Endereco(rua, numero, bairro, cep, complemento);
        ListaDeImoveis








    }
}

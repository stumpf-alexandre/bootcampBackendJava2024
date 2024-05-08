public class SistemaCadastro {
    public static void main(String[] args) {
        //cria uma pessoa no sistema
        //Pessoa marcos = new Pessoa();
        //criar uma pessoa no sistema e passando os valores para o construtor
        Pessoa marcos = new Pessoa("123", "Marcos");

        //defini o endereço de marcos
        marcos.setEndereco("Rua das Marias");

        //defini o nome e cpf do marcos


        //imprime o marcos sem o nome e cpf
        System.out.println(marcos.getNome() + " - " + marcos.getCpf());
    }
}

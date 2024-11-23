public class RodarAplicacao {
    public static void main(String[] args) {
        // classe Funcionario, criando uma variavel chamada funcionario, criei um objeto Funcionário e a guardei na variável;
        Funcionario funcionario = new Funcionario();

        // Funcionário é a classe mãe.
        //upcast (upcast é implícito):
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        // Downcast (downcast é explícito):
        // Downcast deve ser evitado, pois haverá perda de informação e provavelmente dara erro.
        Vendedor vendedor_ = (Vendedor) new Funcionario();
    }
}

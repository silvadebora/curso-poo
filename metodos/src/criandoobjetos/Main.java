package criandoobjetos;

public class Main {
    public static void main(String[] args) {
        Banco pessoa1 = new Banco();
        pessoa1.setNumConta(1111);
        pessoa1.setDono("Jubileu");
        pessoa1.abrirConta("contaCorrente");

        Banco pessoa2 = new Banco();
        pessoa2.setNumConta(2222);
        pessoa2.setDono("Creuza");
        pessoa2.abrirConta("contaPopanca");

        pessoa1.depositar(100);
        pessoa2.depositar(500);

        pessoa2.sacar(100);

        pessoa1.fecharConta();

        pessoa1.estadoAtual();
        pessoa2.estadoAtual();

    }
}

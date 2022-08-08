package Polimorfismo;

public class Main {
    public static void main(String[] args) {


        Mamifero mamifero = new Mamifero();
        Cachorro cachorro = new Cachorro();
        Canguru canguru = new Canguru();

        mamifero.setPeso(5.70f);
        mamifero.setIdade(8);
        mamifero.setMembros(4);
        mamifero.locomover();
        mamifero.alimentar();
        mamifero.emitirSom();

        cachorro.setPeso(25.5f);
        cachorro.setIdade(3);
        cachorro.setMembros(4);
        cachorro.locomover();
        cachorro.alimentar();
        cachorro.abanarRabo();
        cachorro.emitirSom();

        canguru.setPeso(55.3f);
        canguru.setIdade(3);
        canguru.setMembros(4);
        canguru.locomover();
        canguru.alimentar();
        canguru.usarBolsa();
        canguru.emitirSom();

    }
}

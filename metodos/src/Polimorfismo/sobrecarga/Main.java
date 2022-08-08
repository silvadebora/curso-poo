package Polimorfismo.sobrecarga;

public class Main {
    public static void main(String[] args) {

        Lobo lobo = new Lobo();
        //lobo.emitirSom();


        Cachorro cachorro = new Cachorro();
        cachorro.emitirSom();
        cachorro.reagir("Cheguei");
        cachorro.reagir(true);
        cachorro.reagir(11,45);
        cachorro.reagir(11, 12.5f);
        cachorro.reagir(false);
    }
}

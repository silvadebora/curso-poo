package Polimorfismo;

public class Reptil extends Animal{

    public String corEscama;

    @Override
    public void locomover(){
        System.out.println("Rastejando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo planta");
    }

    @Override
    public void emitirSom(){
        System.out.println("Emitindo som");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
}

package encapsulamento;

public class ControleRemoto implements Controlador{

    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto(){
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    public void ligar(){
        this.setLigado(true);
    }

    public void desligar(){
        this.setLigado(false);
    }

    public void abrirMenu(){
        System.out.println("---------Menu---------");
        System.out.println("Está ligado? " + this.getLigado());
        System.out.println("Está tocando? " + this.getTocando());
        System.out.println("Volume: " + this.getVolume());
        for (int i = 0; i <= this.getVolume(); i+=10){
            System.out.println("-");
        }
    }

    public void fecharMenu(){
        System.out.println("Fechando Menu...");
    }

    public void maisVolume(){
        if (this.getLigado()){
            this.setVolume(this.getVolume() + 1);
        } else System.out.println("Impossível aumentar o volume!");
    }

    public void menosVolume(){
        if (this.getLigado()){
            this.setVolume(this.getVolume() - 1);
        } else System.out.println("Impossível diminuir o volume!");
    }

    public void ligarMudo(){
        if (this.getLigado() && this.getVolume() > 0){
            this.setVolume(0);
        }
    }

    public void desligarMudo(){
        if (this.getLigado() && this.getVolume() == 0){
            this.setVolume(50);
        }
    }

    public void play(){
        if (this.getLigado() && !(this.getTocando())){
            this.setTocando(true);
        }
    }

    public void pause(){
        if (this.getLigado() && this.getTocando()){
            this.setTocando(false);
        }
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
}

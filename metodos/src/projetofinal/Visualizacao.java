package projetofinal;

public class Visualizacao {
    private Assinante espectador;
    private Video filme;

    public Visualizacao(Assinante espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotalDeVideosAssistidos(this.espectador.getTotalDeVideosAssistidos() + 1);
        this.filme.setView(this.filme.getView() + 1);
    }

    public void avaliar(){
        this.filme.setAvaliacao(5);
    }

    public void avaliar(int nota){
        this.filme.setAvaliacao(nota);
    }

    public void avaliar(float porcentagem){
        int total = 0;
        if (porcentagem <= 20){
            total = 3;
        } else if (porcentagem <= 50){
            total = 5;
        } else if (porcentagem <= 90) {
            total = 8;
        } else total = 10;
        this.filme.setAvaliacao(total);
    }

    public Assinante getEspectador() {
        return espectador;
    }

    public void setEspectador(Assinante espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return "Visualizacao{" +
                "espectador=" + espectador +
                ", filme=" + filme +
                '}';
    }
}

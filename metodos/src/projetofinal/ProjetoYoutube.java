package projetofinal;

public class ProjetoYoutube {
    public static void main(String[] args) {
        Video video[] = new Video[5];

        video[0] = new Video("Encapsulamento");
        video[1] = new Video("Relacionamento de Agregação");
        video[2] = new Video("Agregação entre Objetos");
        video[3] = new Video("Herança");
        video[4] = new Video("Polimorfismo");

        Assinante assinante[] = new Assinante[2];
        assinante[0] = new Assinante("Débora", 24, "Feminino", "silvadebora");
        assinante[1] = new Assinante("Gafanhoto", 2, "Feminino", "gafanhoto2");

        System.out.println(assinante[0].toString());
        System.out.println(video[0].toString());


        Visualizacao visualizacao[] = new Visualizacao[5];
        visualizacao[0] = new Visualizacao(assinante[0], video[1]);
        visualizacao[0].avaliar();
        System.out.println(visualizacao[0].toString());

        visualizacao[1] = new Visualizacao(assinante[0], video[2]);
        visualizacao[1].avaliar(80.3f);
        System.out.println(visualizacao[1].toString());
    }
}

package Herança.aulaeleven;

public class Main {
    public static void main(String[] args) {

        Visitante v1 = new Visitante();
        v1.setNome("Paulo");
        v1.setIdade(22);
        v1.setSexo("Masculino");
        System.out.println(v1.toString());

        Aluno a1 = new Aluno();
        a1.setNome("Cláudio");
        a1.setMatricula(111);
        a1.setCurso("Informática");
        a1.setIdade(16);
        a1.setSexo("Masculino");
        a1.pagarMensalidade();


        Bolsista b1 = new Bolsista();
        b1.setNome("Mário");
        b1.setMatricula(112);
        b1.setBolsa(12.5f);
        b1.setSexo("Masculino");
        b1.pagarMensalidade();
    }
}

package Herança;

public class Main {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Pedro");
        p1.setSexo("Masculino");
        p2.setNome("Maria");
        p2.setIdade(18);
        p3.setNome("Cláudio");
        p3.setSexo("Masculino");
        p4.setNome("Fabiana");
        p4.setIdade(48);

        p2.setCurso("Informática");
        p3.setEspecialidade("Biologia");
        p3.setSalario(2500.75f);
        p4.setSetor("Estoque");
        p3.receberAumento(550f);



        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());




    }
}

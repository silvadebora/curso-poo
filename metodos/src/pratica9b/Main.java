package pratica9b;

public class Main {
    public static void main(String[] args) {

        Pessoa[] pessoa = new Pessoa[2];
        Livro[] livro = new Livro[3];

        pessoa[0] = new Pessoa("Maria", 22, "Feminino");
        pessoa[1] = new Pessoa("Pedro", 25, "Masculino");

        livro[0] = new Livro("No mundo da Luna", "Carina Rissi", 250, pessoa[0]);
        livro[1] = new Livro("É assim que acaba", "Colleen Hoover", 200, pessoa[0]);
        livro[2] = new Livro("Manual de pescaria", "Cláudio Pedro", 100, pessoa[1]);

        livro[0].abrir();
        livro[0].voltarPagina();
        System.out.println(livro[0].detalhes());

    }



}

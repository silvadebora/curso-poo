package projetofinal;

public class Assinante extends Pessoa{
    private String login;
    private int totalDeVideosAssistidos;

    public Assinante(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totalDeVideosAssistidos = 0;
    }

    public void viuMaisUmVideo(){
        this.totalDeVideosAssistidos = this.totalDeVideosAssistidos + 1;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotalDeVideosAssistidos() {
        return totalDeVideosAssistidos;
    }

    public void setTotalDeVideosAssistidos(int totalDeVideosAssistidos) {
        this.totalDeVideosAssistidos = totalDeVideosAssistidos;
    }

    @Override
    public String toString() {
        return "Assinante{" + super.toString() +
                "login='" + login + '\'' +
                ", totalDeVideosAssistidos=" + totalDeVideosAssistidos +
                '}';
    }
}

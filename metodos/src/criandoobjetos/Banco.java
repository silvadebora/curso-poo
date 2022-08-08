package criandoobjetos;

public class Banco {

    public int numConta;
    protected String tipo;
    private String dono;
    private int saldo;
    private boolean status;

    public String contaPopanca;

    public String contaCorrente;

    public void estadoAtual(){
        System.out.println("----------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Dono" + this.getDono());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }

    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if (t == "contaCorrente"){
            this.setSaldo(50); // saldo(50);
        } else if(t == "contaPopanca") {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso");
    }

    public void fecharConta(){
        if(this.getSaldo() > 0){
            System.out.println("Conta com dinheiro");
        } else if (this.getSaldo() < 0){
            System.out.println("Conta em débito");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso");
        }
    }

    public void depositar(int valor){
        if(this.getStatus() == true){
            saldo = saldo + valor;
        } else System.out.println("Conta indisponível");
    }

    public void sacar(int valor){
        if (status == true){
            if (saldo < valor) {
                System.out.println("Saldo insuficiente");
            } else saldo = saldo - valor;
        } else System.out.println("Conta inexistente");
    }

    public void pagarMensal(){
        int valor;
        if (tipo == contaCorrente){
            valor = 12;
        } else valor = 20;
        if (status == true){
            if(saldo > 0) {
                saldo = saldo - valor;
            } else if (saldo < valor) {
                System.out.println("Não foi possível realizar o pagamento mensal");
            }
        } else System.out.println("Impossível pagar");
    }

    public Banco(){
        this.saldo = 0;
        this.status = false;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}

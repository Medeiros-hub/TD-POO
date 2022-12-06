public class Conta {
    public Pessoa client;

    public Conta(Pessoa client) {
        this.client = client;
    }

    public Pessoa getClient() {
        return this.client;
    }
    
    public void setClient(Pessoa client) {
        this.client = client;
    }

    public void setClient(String nome) {
        Pessoa client = new Pessoa(nome);
        this.client = client;
    }
}

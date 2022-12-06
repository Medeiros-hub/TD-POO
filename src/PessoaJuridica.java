public class PessoaJuridica extends Conta {
    
    private String cnpj;
    private String razaoSocial;
    
    public PessoaJuridica(Pessoa client, String cnpj, String razaoSocial) {
        super(client);
        setClient(client);

        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return this.razaoSocial;
    }

    public void serRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String output() {
        String out = "----------------";
        out += "\nNome: " + client.getNome();
        out += "\nCNPJ: " + this.getCnpj();
        out += "\nRazão Social: " + this.getRazaoSocial();
        out += "\n----------------";
        return out;
    }

    @Override
    public String toString() {
        return output();
    }
}
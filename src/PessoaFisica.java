public class PessoaFisica extends Conta {
    
    private String cpf;
    private String sobrenome;
    
    public PessoaFisica(Pessoa client, String cpf, String sobrenome) {
        super(client);
        setClient(client);
        setCpf(cpf);
        setSobrenome(sobrenome);
    }

	public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSobrenome() {
        return this.sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String output() {
        String out = "----------------";
        out += "\nNome: " + client.getNome();
        out += "\nSobrenome: " + this.getSobrenome();
        out += "\nCPF: " + this.getCpf();
        out += "\n----------------";
        return out;
    }

    @Override
    public String toString() {
        return output();
    }
}
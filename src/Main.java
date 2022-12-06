import java.io.Console;

public class Main {
    public static void main(String[] args) {
        Pessoa Pedro = new Pessoa("Pedro");
        PessoaFisica pf1 = new PessoaFisica(
            Pedro, 
            "123.456.789-10", 
            "Henrique Medeiros Ramalho"
        );

        System.out.println(pf1);


        PessoaJuridica pj1 = new PessoaJuridica(
            new Pessoa("Samuel"), 
            "12.345.678/0001-00", 
            "Samucas"
        );

        System.out.println(pj1);
    }
}
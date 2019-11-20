package trabalhopraticobicicleta;

public class Gerente extends Funcionario{
    private int codprojeto;

    public Gerente(String nome, String cpf) {
        super(nome, cpf);
    }

    public int getCodprojeto() {
        return codprojeto;
    }

    public void setCodprojeto(int codprojeto) {
        this.codprojeto = codprojeto;
    }

    @Override
    public String toString() {
        return "O nome do gerente é " +this.getNome()+ " o cpf é " +this.getCpf()+" o código do projeto que coordena é"+ this.codprojeto + '}';
    }
}

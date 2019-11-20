package trabalhopraticobicicleta;

public class Engenheiro extends Funcionario {
    private String crea;

    public Engenheiro(String crea, String nome, String cpf) {
        super(nome, cpf);
        this.crea = crea;
    }

    public String getCrea() {
        return crea;
    }

    public void setCrea(String crea) {
        this.crea = crea;
    }
    
    @Override
    public String toString() {
        return "O nome do engenheiro é" + this.getNome()+ "seu cpf é" +this.getCpf()+" e seu crea é" + this.crea + '.';
    }
}

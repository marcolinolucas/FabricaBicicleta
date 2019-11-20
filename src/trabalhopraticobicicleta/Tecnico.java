package trabalhopraticobicicleta;

public class Tecnico extends Funcionario {
    private String especializacao;

    public Tecnico(String especializacao, String nome, String cpf) {
        super(nome, cpf);
        this.especializacao = especializacao;
    }
    
    public String getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }

    @Override
    public String toString() {
        return "O nome do tecnico é" + this.getNome()+ "seu cpf é" +this.getCpf()+" e sua especializacao é" + this.especializacao + '.';
    }
}

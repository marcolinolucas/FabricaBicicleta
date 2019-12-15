package trabalhopraticobicicleta;

public class Rh {
    private int numeroTecnicos = 100;
    private int numeroEngenheiros = 100;
    private int numeroGerentes = 100;
    
    public void pegarFuncionarios(Projeto projeto) {
        this.numeroEngenheiros -= projeto.getNumeroEngenheiro();
        System.out.println("O numero atual de engenheiros disponível é "+getNumeroEngenheiros()+".");
        
        this.numeroTecnicos -= projeto.getNumeroTecnico(); 
        System.out.println("O numero atual de tecnicos disponível é "+getNumeroTecnicos() +".");
        
        this.numeroGerentes -= projeto.getNumeroGerente(); 
        System.out.println("O numero atual de gerentes de producao disponível é "+getNumeroGerentes() +".");
    }
    
    public void liberarFuncionarios(Projeto projeto){
        int quantidadeEngenheiro = projeto.getNumeroEngenheiro() + this.numeroEngenheiros; ;
        System.out.println("O numero atual de engenheiros disponível é "+quantidadeEngenheiro +".");
        
        int quantidadeTecnico = projeto.getNumeroTecnico()+ this.numeroTecnicos; 
        System.out.println("O numero atual de tecnicos disponível é "+quantidadeTecnico +".");
        
        int quantidadeGerente = projeto.getNumeroGerente() + this.numeroGerentes; 
        System.out.println("O numero atual de gerentes de producao disponível é "+quantidadeGerente +".");
    }
    
    public int getNumeroEngenheiros() {
        return numeroEngenheiros;
    }
    
    public int getNumeroTecnicos() {
        return numeroTecnicos;
    }

    public int getNumeroGerentes() {
        return numeroGerentes;
    }
}

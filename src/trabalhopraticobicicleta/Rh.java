package trabalhopraticobicicleta;

public class Rh {
    private int numeroTecnicos;
    private int numeroEngenheiros;
    private int numeroGerente;

    public int getNumeroTecnicos() {
        return numeroTecnicos;
    }

    public void setNumeroTecnicos(int numeroTecnicos) {
        this.numeroTecnicos = numeroTecnicos;
    }

    public int getNumeroEngenheiros() {
        return numeroEngenheiros;
    }

    public void setNumeroEngenheiros(int numeroEngenheiros) {
        this.numeroEngenheiros = numeroEngenheiros;
    }

    public int getNumeroGerente() {
        return numeroGerente;
    }

    public void setNumeroGerente(int numeroGerente) {
        this.numeroGerente = numeroGerente;
    }
    
    //por vontade minha a empresa comeca com nenhum funcionario
    public Projeto verificaFuncionario(Projeto projetoalocado){
        System.out.println("*********** CONTRANDO ***********");
        Financeiro financeiro = new Financeiro();
        int entrada = projetoalocado.getNumeroEngenheiro();
       int entrada1 = projetoalocado.getNumeroTecnico();
       int entrada2 = projetoalocado.getNumeroGerente();
       
       //contratando engenheiros
       if (entrada >= this.numeroEngenheiros){
            if (financeiro.liberaCota() == true){
                this.numeroEngenheiros = entrada - this.numeroEngenheiros;
                System.out.println("O numero de engenheiros CONTRADOS na empresa é de "+this.numeroEngenheiros +".");
                
            }           
        else{
            this.numeroEngenheiros = this.numeroEngenheiros - entrada;
            System.out.println("O numero de engenheiros CONTRADOS na empresa é de  0 visto que já existia pessoa suficiente.\n Pessoa alocadas = "+ entrada);
            
       }}
       
       //contratando tecnicos
       if (entrada1 >= this.numeroTecnicos){
            if (financeiro.liberaCota() == true){
                this.numeroTecnicos = entrada1 - this.numeroTecnicos;
                System.out.println("O numero de tecnicos CONTRADOS na empresa é de "+this.numeroTecnicos+".");
                
            }
        else{
            this.numeroTecnicos = this.numeroTecnicos - entrada1;
            System.out.println("O numero de tecnicos CONTRADOS na empresa é de  0 visto que já existia pessoa suficiente.\n Pessoa alocadas = "+ entrada1);
            
       }} 
        
       //contratando gerente
       if (entrada2 > this.numeroGerente){
           if(financeiro.liberaCota()==true){
               //while(entrada2 > this.numeroGerente)
                   this.numeroGerente = entrada2 - this.numeroGerente;
                    System.out.println("O numero de gerentes de projeto CONTRADOS na empresa é de "+this.numeroGerente+".");
           }
        else{
            this.numeroEngenheiros = this.numeroGerente - entrada2;
            System.out.println("O numero de gerentes de projeto CONTRADOS na empresa é de  0 visto que já existia pessoa suficiente.\n Pessoa alocadas = "+ entrada2);
           }   
       }

              
    return projetoalocado;
    }
    
    public Projeto liberarFuncionarios(Projeto projeto){
        if (projeto.getPedido().getNumeroPedido() ==1){

            System.out.println("O numero atual de engenheiros na empresa é "+this.numeroEngenheiros +".");


            System.out.println("O numero atual de tecnicos na empresa é "+this.numeroTecnicos +".");


            System.out.println("O numero atual de gerentes de producao na empresa é "+this.numeroGerente +".");
    }
        else{
            if (this.numeroEngenheiros > projeto.getNumeroEngenheiro() && this.numeroTecnicos > projeto.getNumeroTecnico()){

                this.numeroEngenheiros = this.numeroEngenheiros + projeto.getNumeroEngenheiro();
                System.out.println("O numero atual de engenheiros na empresa é "+this.numeroEngenheiros +".");

                this.numeroTecnicos= this.numeroTecnicos +projeto.getNumeroTecnico();
                System.out.println("O numero atual de tecnicos na empresa é "+this.numeroTecnicos +".");

                this.numeroGerente = this.numeroGerente + projeto.getNumeroGerente();
                System.out.println("O numero atual de gerentes de producao na empresa é "+this.numeroGerente +".");        
        }

            else if (this.numeroEngenheiros <= projeto.getNumeroEngenheiro() && this.numeroTecnicos <= projeto.getNumeroTecnico()){

                this.numeroEngenheiros = projeto.getNumeroEngenheiro();
                System.out.println("O numero atual de engenheiros na empresa é "+this.numeroEngenheiros +".");

                this.numeroTecnicos= projeto.getNumeroTecnico();
                System.out.println("O numero atual de tecnicos na empresa é "+this.numeroTecnicos +".");

                this.numeroGerente = this.numeroGerente + projeto.getNumeroGerente();
                System.out.println("O numero atual de gerentes de producao na empresa é "+this.numeroGerente +".");
        }

            else if (this.numeroEngenheiros > projeto.getNumeroEngenheiro() && this.numeroTecnicos <= projeto.getNumeroTecnico()){

                this.numeroEngenheiros = this.numeroEngenheiros + projeto.getNumeroEngenheiro();
                System.out.println("O numero atual de engenheiros na empresa é "+this.numeroEngenheiros +".");

                this.numeroTecnicos= projeto.getNumeroTecnico();
                System.out.println("O numero atual de tecnicos na empresa é "+this.numeroTecnicos +".");

                this.numeroGerente = this.numeroGerente + projeto.getNumeroGerente();
                System.out.println("O numero atual de gerentes de producao na empresa é "+this.numeroGerente +".");
        }

            else if (this.numeroEngenheiros <= projeto.getNumeroEngenheiro() && this.numeroTecnicos > projeto.getNumeroTecnico()){

                this.numeroEngenheiros = projeto.getNumeroEngenheiro();
                System.out.println("O numero atual de engenheiros na empresa é "+this.numeroEngenheiros +".");

                this.numeroTecnicos= this.numeroTecnicos + projeto.getNumeroTecnico();
                System.out.println("O numero atual de tecnicos na empresa é "+this.numeroTecnicos +".");

                this.numeroGerente = this.numeroGerente + projeto.getNumeroGerente();
                System.out.println("O numero atual de gerentes de producao na empresa é "+this.numeroGerente +".");
        }
        }
        
    return projeto;
    }
}

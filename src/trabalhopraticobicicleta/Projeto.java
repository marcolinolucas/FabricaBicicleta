package trabalhopraticobicicleta;

public class Projeto{
    private Pedido pedido;
    private boolean testeAprovado = false;
    private int numeroEngenheiro;
    private int numeroTecnico;
    private int numeroGerente;

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
    
    public boolean isTesteAprovado() {
        return testeAprovado;
    }

    public void setTesteAprovado(boolean testeAprovado) {
        this.testeAprovado = testeAprovado;
    }

    public int getNumeroEngenheiro() {
        return numeroEngenheiro;
    }

    public void setNumeroEngenheiro(int numeroEngenheiro) {
        this.numeroEngenheiro = numeroEngenheiro;
    }

    public int getNumeroTecnico() {
        return numeroTecnico;
    }

    public void setNumeroTecnico(int numeroTecnico) {
        this.numeroTecnico = numeroTecnico;
    }

    public int getNumeroGerente() {
        return numeroGerente;
    }

    public void setNumeroGerente(int numeroGerente) {
        this.numeroGerente = numeroGerente;
    }
    
    public Projeto recebePedido(Pedido pedido){
        //Producao producao = new Producao();
        Projeto projeto = new Projeto();
        projeto.setPedido(pedido);
        
        String modelo = pedido.getItensPedido().getModeloBicicleta();
        int quantidadeBicicleta = pedido.getItensPedido().getQuantidadeBicicleta();
        
        System.out.println("O modelo escolhido foi " + modelo);
        System.out.println("A quantidade decida foi " +  quantidadeBicicleta);
        
        projeto.setNumeroEngenheiro(analiseEngenheiroProjeto(modelo));
        projeto.setNumeroTecnico(analiseTecnicoProjeto(quantidadeBicicleta));
        projeto.setNumeroGerente(1);
        
        System.out.println("\n************ O PROJETO EH ************\n");
        System.out.println(projeto);
        
        //producao.adicionaProjeto(projeto);
        return projeto;
    }
    
    /*
    public int analiseEngenheiroProjeto(Pedido a){
        int entrada;
        if(this.getPedido().getItensPedido().getModelobicicleta().equals("bmx")){
            entrada = 2;
        }
        else if (this.getPedido().getItensPedido().getModelobicicleta().equals("trilha")){
            entrada = 3;
        }
        else if (this.getPedido().getItensPedido().getModelobicicleta().equals("esportivo")){
            entrada = 5;
        }
        else if (this.getPedido().getItensPedido().getModelobicicleta().equals("infatil")){
            entrada = 1;
        }
        else{
            entrada = 3;
        }
    return entrada;
    }
 
    public int analiseTecnicoProjeto(Pedido a){
        int entrada;
        if(this.getPedido().getItensPedido().getQuantidadebicicleta() <= 50){
            entrada = 5;
        }
        else if ( this.getPedido().getItensPedido().getQuantidadebicicleta() > 50 && this.getPedido().getItensPedido().getQuantidadebicicleta() <= 100){
            entrada = 15;
        }
        else if (this.getPedido().getItensPedido().getQuantidadebicicleta() >100 && this.getPedido().getItensPedido().getQuantidadebicicleta() <= 200){
            entrada = 30;
        }
        else if (this.getPedido().getItensPedido().getQuantidadebicicleta() > 40 && this.getPedido().getItensPedido().getModelobicicleta().equals("esportivo") ){
            entrada = 70;
        }
        else{
        entrada = 50;
        }
    return entrada;
    }
    */
    
    
    // if basico para definir quando engenheiros no projeto
    public int analiseEngenheiroProjeto(String modelo){
        int quantidadeEngenheiro;
        switch (modelo) {
            case "bmx":
                quantidadeEngenheiro = 2;
                break;
            case "trilha":
                quantidadeEngenheiro = 3;
                break;
            case "esportivo":
                quantidadeEngenheiro = 5;
                break;
            case "infatil":
                quantidadeEngenheiro = 1;
                break;
            default:
                quantidadeEngenheiro = 3;
                break;
        }
        return quantidadeEngenheiro;
    }
 
    // if basico para definir quando engenheiros no projeto
    public int analiseTecnicoProjeto(int quantidadeBicicleta){
        int quantidadeTecnico;
        if (quantidadeBicicleta <= 50){
            quantidadeTecnico = 5;
        } else if (quantidadeBicicleta <= 100){
            quantidadeTecnico = 15;
        } else if (quantidadeBicicleta <= 200){
            quantidadeTecnico = 30;
        } else {
        quantidadeTecnico = 50;
        }
        return quantidadeTecnico;
    }
        
    public int retornaNumeroPedido(){
        return getPedido().getNumeroPedido();
    }

    @Override
    public String toString() {
        return "Projeto para o Pedido: " + this.pedido + ".\n"
            + "Número de engenheiros: " + this.numeroEngenheiro 
            + "\nNúmero de tecnicos: " + this.numeroTecnico;
    }
}

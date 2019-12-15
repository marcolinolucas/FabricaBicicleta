package trabalhopraticobicicleta;

public class Projeto{
    private Pedido pedido;
    private int numeroEngenheiro;
    private int numeroTecnico;
    private int numeroGerente;
      
    public Projeto(Pedido pedido){
        this.setPedido(pedido);
        
        String modelo = pedido.getItensPedido().getModeloBicicleta();
        int quantidadeBicicleta = pedido.getItensPedido().getQuantidadeBicicleta();
        
        System.out.println("O modelo escolhido foi " + modelo);
        System.out.println("A quantidade decida foi " +  quantidadeBicicleta);
        
        this.setNumeroEngenheiro(analiseQuantidadeEngenheiro(modelo));
        this.setNumeroTecnico(analiseQuantidadeTecnico(quantidadeBicicleta));
        this.setNumeroGerente(1);

        Rh rh = new Rh();
        rh.pegarFuncionarios(this);
        
        Producao producao = new Producao(pedido);
        rh.liberarFuncionarios(this);
    }
    
    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
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
  
    public int analiseQuantidadeEngenheiro(String modelo){
        int quantidadeEngenheiro;
        switch (modelo) {
            case "bmx":
                quantidadeEngenheiro = 3;
                break;
            case "trilha":
                quantidadeEngenheiro = 4;
                break;
            case "esportivo":
                quantidadeEngenheiro = 2;
                break;
            case "infatil":
                quantidadeEngenheiro = 1;
                break;
            default:
                quantidadeEngenheiro = 5;
                break;
        }
        return quantidadeEngenheiro;
    }
 
    public int analiseQuantidadeTecnico(int quantidadeBicicleta){
        int quantidadeTecnico;
        if (quantidadeBicicleta <= 50){
            quantidadeTecnico = 10;
        } else if (quantidadeBicicleta <= 100){
            quantidadeTecnico = 20;
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

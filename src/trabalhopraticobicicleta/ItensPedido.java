package trabalhopraticobicicleta;

public class ItensPedido {
    private String modeloBicicleta;
    private String cor;
    private int quantidadeBicicleta;

    public String getModeloBicicleta() {
        return modeloBicicleta;
    }

    public void setModeloBicicleta(String modeloBicicleta) {
        this.modeloBicicleta = modeloBicicleta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public int getQuantidadeBicicleta() {
        return quantidadeBicicleta;
    }

    public void setQuantidadeBicicleta(int quantidadeBicicleta) {
        this.quantidadeBicicleta = quantidadeBicicleta;
    }

    @Override
    public String toString() {
        return "\n* Bicicleta(s) do pedido: \nModelo: " 
            + this.modeloBicicleta + "\nCor: " + this.cor + 
            "\nQuantidade: " + this.quantidadeBicicleta;
    }

    
}

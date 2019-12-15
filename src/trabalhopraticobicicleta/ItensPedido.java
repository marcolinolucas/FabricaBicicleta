package trabalhopraticobicicleta;

import java.util.Scanner;

public class ItensPedido {
    private boolean testeAprovado = false;
    private String modeloBicicleta;
    private String cor;
    private int quantidadeBicicleta;

    public ItensPedido(){
        System.out.println("\n- Informe os itens do pedido -");
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o modelo da(s) bicicleta(s): ");
        String modelo = teclado.nextLine();
        this.setModeloBicicleta(modelo);
        
        System.out.print("Digite a cor da(s) bicicleta(s): ");
        String cor = teclado.nextLine();
        this.setCor(cor);
        
        System.out.print("Digite a quantidade de bicicletas: ");
        int quantidade = teclado.nextInt();
        this.setQuantidadeBicicleta(quantidade);
    }

    public String getModeloBicicleta() {
        return modeloBicicleta;
    }

    public void setModeloBicicleta(String modeloBicicleta) {
        this.modeloBicicleta = modeloBicicleta;
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
    
    public boolean isTesteAprovado() {
        return testeAprovado;
    }

    public void setTesteAprovado(boolean testeAprovado) {
        this.testeAprovado = testeAprovado;
    }

    @Override
    public String toString() {
        return "\n* Bicicleta(s) do pedido: \nModelo: " 
            + this.modeloBicicleta + "\nCor: " + this.cor + 
            "\nQuantidade: " + this.quantidadeBicicleta;
    }
}

package trabalhopraticobicicleta;

public class Vendas {
    
    public Pedido fazerVenda(Pedido pedido){
        
        System.out.println(" ");
        System.out.println("************ CRIANDO O PEDIDO ************");
        System.out.println(" ");
        
        return pedido.criarPedido();
    }
    
}

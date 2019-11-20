package trabalhopraticobicicleta;

public class Entrega {
    
   public void expedirPedido(Pedido pedido){
       System.out.println("O Pedido#" + pedido.getNumeroPedido()
            + " será enviado para " + pedido.getCliente().getEndereco());
   }
}

package trabalhopraticobicicleta;

public class Financeiro {
    
    public boolean liberaCota() {
        return true;
    }
    
    // Implementar a função
    public void emitirNotaFiscal (Pedido pedido) {
        System.out.println("Nota emitida!");
    }

    // Implementar a função
    public void verificarPagamento(Pedido pedido) {
        if (true) {
           Entrega entrega = new Entrega();
           entrega.expedirPedido(pedido);
        }
    }
}

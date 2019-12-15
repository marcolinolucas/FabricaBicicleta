package trabalhopraticobicicleta;

public class Financeiro {
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

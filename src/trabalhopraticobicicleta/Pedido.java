package trabalhopraticobicicleta;

import java.util.Scanner;

public class Pedido {
    private int numeroPedido;
    private Financeiro financeiro;
    private Cliente cliente;
    private ItensPedido itensPedido;

    public Pedido() {
        this.numeroPedido++;
        this.cliente = new Cliente();
        this.itensPedido = new ItensPedido();
        this.financeiro = new Financeiro();
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public ItensPedido getItensPedido() {
        return itensPedido;
    }
    
    public Financeiro getFinanceiro() {
        return financeiro;
    }
    
    @Override
    public String toString() {
        return "\n*   Pedido#" + this.numeroPedido + "   *\n"
            + this.cliente +"\n" + this.itensPedido ;
    }
}

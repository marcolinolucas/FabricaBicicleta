package trabalhopraticobicicleta;

import java.util.Scanner;

public class Pedido {
    private int numeroPedido;
    private Financeiro financeiro;
    private Cliente cliente;
    private ItensPedido itensPedido;

    // FUNCAO QUE CRIA OS DADOS DO CLIENTE PARA SEREM INSERIDOS NO PEDIDO
    public Cliente criarCliente(){
        System.out.println("\n******** INSIRA O CLIENTE DO PEDIDO ********");
        Scanner teclado = new Scanner(System.in);
        Cliente novoCliente = new Cliente();
        
        System.out.print("Digite o nome do cliente: ");
        String nome = teclado.nextLine();
        novoCliente.setNome(nome);
        
        System.out.print("Digite o CPF do cliente: ");
        String cpf = teclado.nextLine();
        novoCliente.setCpf(cpf);
        
        System.out.print("Digite o endereço de entrega do pedido do cliente: ");
        String endereco = teclado.nextLine();
        novoCliente.setEndereco(endereco);
        
        return novoCliente;
    }
    
    // FUNCAO QUE CRIA OS DADOS DE ITENS PARA SEREM INSERIDOS NO PEDIDO
    public ItensPedido inserirItens(){
        System.out.println("\n******** INSIRA OS ITENS DO PEDIDO ********");
        Scanner teclado = new Scanner(System.in);
        ItensPedido novosItens = new ItensPedido();
        
        System.out.print("Digite o modelo da(s) bicicleta(s): ");
        String modelo = teclado.nextLine();
        novosItens.setModeloBicicleta(modelo);
        
        System.out.print("Digite a cor da(s) bicicleta(s): ");
        String cor = teclado.nextLine();
        novosItens.setCor(cor);
        
        System.out.print("Digite a quantidade de bicicletas: ");
        int quantidade = teclado.nextInt();
        novosItens.setQuantidadeBicicleta(quantidade);
        
        return novosItens;
    }
    
    // FUNCAO QUE CRIA O PEDIDO
    public Pedido criarPedido(){
        this.numeroPedido++;
        Pedido pedido = new Pedido(this.numeroPedido, this.criarCliente(), this.inserirItens(), this.financeiro);
        return pedido;
    }
    
    public ItensPedido passaItens(){
        ItensPedido itens= new ItensPedido();
        return itens;
    }

    public Pedido(int numeroPedido, Cliente cliente, ItensPedido itensPedido, Financeiro financeiro) {
        this.numeroPedido = numeroPedido;
        this.cliente = cliente;
        this.itensPedido = itensPedido;
        this.financeiro = financeiro;
    }

    
    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ItensPedido getItensPedido() {
        return itensPedido;
    }

    public void setItensPedido(ItensPedido itensPedido) {
        this.itensPedido = itensPedido;
    }
    
     public Financeiro getFinanceiro() {
        return financeiro;
    }

    public void setFinanceiro(Financeiro financeiro) {
        this.financeiro = financeiro;
    }
    
    @Override
    public String toString() {
        return "\n*   Pedido#" + this.numeroPedido + "   *\n"
            + this.cliente +"\n" + this.itensPedido ;
    }
    
}

package trabalhopraticobicicleta;

import java.util.Scanner;

public class TrabalhoPraticoBicicleta {

    /*
     o codigo tem um baixo acoplamento todas as funcoes sao chamadas pelo processo do termino de outra
     ou seja apenas criar o pedido comeca na main o resto termina com a ultima funcao chamada pela penultima
    */
    public static void main(String[] args) {

        System.out.println("\nINICIANDO SISTEMA");
        
        Vendas venda = new Vendas();
        Projeto projeto = new Projeto();
        Producao producao = new Producao();
        Financeiro financeiro = new Financeiro();
        Rh rh = new Rh();
        Cliente cliente = new Cliente();
        ItensPedido itens = new ItensPedido();
        Pedido pedido = new Pedido(0, cliente, itens, financeiro);
        int controle;
        
        do {
            System.out.println("\n(1) Para realizar vendas");
            System.out.println("(2) Para sair do sistema");
            System.out.print("Sua opção: ");
            Scanner teclado = new Scanner(System.in);
            controle = teclado.nextInt();
            switch (controle){
                case 1:
                    System.out.println("ABRINDO VENDA");
                    pedido = pedido.criarPedido();
                    projeto = projeto.recebePedido(pedido);
                    producao.contruir(projeto);
                    // rh.liberarFuncionarios(producao.contruir(rh.verificaFuncionario(producao.adicionaProjeto(projeto.recebePedido(venda.fazerVenda(pedido))))));
                    // aloca recursos no estoque e finaliza com a liberacao do financeiro
                    
                    // compara se ja existe um projeto existente
        
                    // chamada de estoque 

                    // Realiza o teste do projeto                   
                    int tentativa = 1;
                    while (!projeto.isTesteAprovado()) {
                        System.out.println("Tentativa "+ tentativa);
                        TesteProjeto teste = new TesteProjeto();
                        teste.testarProjeto(projeto);
                        if (!projeto.isTesteAprovado()) projeto = projeto.recebePedido(pedido);
                        tentativa++;
                    }
                    
                    pedido.getFinanceiro().verificarPagamento(pedido);
                    
                    System.out.println("************ ENCERRADA VENDA ************");
                    break;
                case 2:
                    System.out.println("Sistema Finalizado\n");
                    break;
                default:
                    System.out.println("Informe uma opção válida!");
                    break;
            }   
        } while (controle != 2);
    }
}

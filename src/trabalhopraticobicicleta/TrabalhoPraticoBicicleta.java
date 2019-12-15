package trabalhopraticobicicleta;

import java.util.Scanner;

public class TrabalhoPraticoBicicleta {
    public static void main(String[] args) {
        System.out.println("\nIniciando o Sistema...");

        Scanner teclado = new Scanner(System.in);
        int controle;
        
        do {
            System.out.println("\n(1) Para realizar vendas");
            System.out.println("(2) Para sair do sistema");
            System.out.print("Sua opção: ");
            controle = teclado.nextInt();
            switch (controle){
                case 1:
                    System.out.println("Abrindo venda...");
                    Pedido pedido = new Pedido();
                    Projeto projeto = new Projeto(pedido);

                    // Após a construção, realiza o teste dos produtos.
                    // While que deixa sempre testando e sai quando o produto é aprovado nos teste.  
                    int tentativa = 1;
                    while (!pedido.getItensPedido().isTesteAprovado()) {
                        System.out.println("Tentativa "+ tentativa);
                        TestePedido teste = new TestePedido();
                        teste.testarPedido(pedido);
                        if (!pedido.getItensPedido().isTesteAprovado()) projeto = new Projeto(pedido);
                        tentativa++;
                    }
                    
                    pedido.getFinanceiro().verificarPagamento(pedido);
                    
                    System.out.println("- Venda Encerrada -");
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

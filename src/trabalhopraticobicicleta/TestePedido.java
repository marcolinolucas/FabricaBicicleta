package trabalhopraticobicicleta;

import java.util.Random;

public class TestePedido {
    public void testarPedido(Pedido pedido) {
        boolean aprovado = testarRodas() && testarGuidao() && testarFreio();
        if (aprovado) {
            System.out.println("\nTeste status: APROVADO!");
            pedido.getFinanceiro().emitirNotaFiscal(pedido);
        } else {
            System.out.println("\nTeste status: REPROVADO!");
        }
        pedido.getItensPedido().setTesteAprovado(aprovado);
    }
    
    private boolean testarRodas () {
        Random random = new Random();
        return random.nextInt(2) == 0;
    }
    
    private boolean testarGuidao () {
        Random random = new Random();
        return random.nextInt(2) == 0;
    }
    
    private boolean testarFreio () {
        Random random = new Random();
        return random.nextInt(2) == 0;
    }
}

package trabalhopraticobicicleta;

public class Producao {
    // Abstraimos a ideia de lista de estoque ou qualquer outra complexibilidade.
    // Apenas simulamos a construção do projeto com tudo em perfeito estado.
    public Producao(Pedido pedido) {
        int timer = 10;
        System.out.println("\nConstruindo pedido!");
        while (timer > 0 ){
            System.out.println(timer + "...");
            timer--;
        }
    }
}

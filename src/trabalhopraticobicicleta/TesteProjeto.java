package trabalhopraticobicicleta;

import java.util.Random;

public class TesteProjeto {
    
    public void testarProjeto(Projeto projeto) {
        boolean aprovado = testarRodas() && testarGuidao() && testarFreio();
        if (aprovado) {
            System.out.println("\nTeste status: APROVADO!");
            Rh rh = new Rh();
            Financeiro financeiro = new Financeiro();
            financeiro.emitirNotaFiscal(projeto.getPedido());
            rh.liberarFuncionarios(projeto);
        } else {
            System.out.println("\nTeste status: REPROVADO!");
        }
        projeto.setTesteAprovado(aprovado);
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

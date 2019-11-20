package trabalhopraticobicicleta;

import java.util.HashMap;
import java.util.Map;

public class Producao {
    private Map<Integer, Projeto> listaProjeto = new HashMap<>();

    public Map<Integer, Projeto> getListaProjeto() {
        return listaProjeto;
    }

    public void setListaProjeto(Map<Integer, Projeto> listaProjeto) {
        this.listaProjeto = listaProjeto;
    }

    public Projeto adicionaProjeto(Projeto projeto){
        System.out.println(" ");
        System.out.println("************ O PROJETO ENVIADO PARA PRODUCAO ************");
        System.out.println(" ");
        
        Producao producao = new Producao();
        int entrada = projeto.getPedido().getNumeroPedido();
        
        //listaProjeto.put(projeto1.retornaNumeroPedido(),projeto);
        
        // O numero do pedido e usado como identificador chave do map
        listaProjeto.put(entrada,projeto);
        
        System.out.println("*********** PROEJTO ATUAL ***********\n" + listaProjeto.get(entrada));
        
        
        System.out.println("*********** LISTA DE PROJETOS ***********\n ");
        System.out.println(listaProjeto);
        
        // aloca recursos no estoque e finaliza com a liberacao do financeiro

        //compara se ja existe um projeto existente
        
        
        producao.alocaFuncionarios(listaProjeto,entrada);
        //chamadada estoque 
        
  
        // realizar o teste no setor de teste no projeto
        
        
        //return producao.alocaFuncionarios(listaProjeto,entrada);
        return listaProjeto.get(entrada);
    }
    
    public Projeto alocaFuncionarios(Map<Integer, Projeto> lista, int entrada){
        
        Producao producao = new Producao();
        //chamda do projeto expecifico criado pela chave entrada, com o projeto
        
        
        System.out.println("ATENCAO SAIDA ESPERADA"); 

        System.out.println("\n #####################");
        //System.out.println(getListaProjeto().get(entrada));
        
        return lista.get(entrada);
        //return producao.getListaProjeto().getOrDefault(entrada,projeto);
    }

    public Projeto contruir(Projeto projeto){
        int produzir = 10;
        System.out.println("\nConstruindo projeto!");
        while (produzir > 0 ){
            System.out.println(produzir + "...");
            produzir --;
        }
        return projeto;
    }

}

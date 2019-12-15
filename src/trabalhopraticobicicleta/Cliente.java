package trabalhopraticobicicleta;

import java.util.Scanner;

public class Cliente {
    private String nome;
    private String cpf;
    private String endereco;
    
    public Cliente(){
        System.out.println("\n - Informe os dados do cliente -");
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o nome do cliente: ");
        String nome = teclado.nextLine();
        this.setNome(nome);
        
        System.out.print("Digite o CPF do cliente: ");
        String cpf = teclado.nextLine();
        this.setCpf(cpf);
        
        System.out.print("Digite o endereço de entrega do pedido do cliente: ");
        String endereco = teclado.nextLine();
        this.setEndereco(endereco);
    }

    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "\n* Informações do Cliente: \nNome: "+ this.nome 
            + "\nCpf:" + this.cpf + "\nEndereco: " + this.endereco;
    }
}

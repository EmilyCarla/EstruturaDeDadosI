import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Queue<String> filaDeDecolagem = new LinkedList<>();
        int opcao = 0; 
        
        while(true){
        System.out.println("\t\n CONTROLE DA PISTA DE DECOLAGEM \t");
        System.out.println("\n1 - Listar número de aviões ");
        System.out.println("2 - Autorizar decolagem ");
        System.out.println("3 - Adicionar avião à fila de espera");
        System.out.println("4 - Listar aviões presentes na fila de espera");
        System.out.println("5 - Listar características do primeiro avião da fila");
        System.out.println("\nEscolha uma opção: ");
        opcao = input.nextInt();

        
            if(opcao == 1){
                int qntdAvioes = filaDeDecolagem.size();
                System.out.println("Número de aviões aguardando na fila de decolagem: " + qntdAvioes);
            }

            if(opcao==2){
                if(!filaDeDecolagem.isEmpty()){
                    String aviao = filaDeDecolagem.poll();
                    System.out.println("Decolagem do avião " + aviao + " autorizada");
                }else{
                    System.out.println("Não há aviões na fila de decolagem");
                }
            }

            if(opcao==3){
                System.out.println("Digite o nome do aviao para adicioná-lo a fila de espera: ");
                String nomeAviao = input.next();
                System.out.println("Digite o número do avião: ");
                int numeroAviao = input.nextInt();
                String aviao = nomeAviao + " " + numeroAviao;
                filaDeDecolagem.add(aviao);
                System.out.println("Avião " + aviao + " adicionado a lista de espera");
            }

            if(opcao==4){
                if(!filaDeDecolagem.isEmpty()){
                    System.out.println("Aviões na fila de espera: ");
                    for(String avioesFila : filaDeDecolagem){
                        System.out.println(avioesFila);
                    }
                }else{
                    System.out.println("Não há aviões na fila de espera");
                }
            }

            if(opcao==5){
                if(!filaDeDecolagem.isEmpty()){
                    String caracteristicasAviao = filaDeDecolagem.peek();
                    System.out.println("Características do primeiro avião da fila de espera: " + caracteristicasAviao);
                }else{
                    System.out.println("Não há aviões na fila de decolagem");
                }
            }
        }    
    }
}








        
   


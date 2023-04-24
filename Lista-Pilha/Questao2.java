import java.util.Scanner;
import java.util.Stack;

//push(empilhar) & pop(desempilhar)

public class Questao2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Stack<Integer> pilha = new Stack<>();
        pilha.push(1);
        pilha.push(2);
        pilha.push(3);
        pilha.push(4);
        pilha.push(5);

        System.out.println("Chave C: ");
        int c = input.nextInt();

        Stack<Integer> segundaPilha = new Stack<>();
       while(!pilha.empty()){
        int numero = pilha.pop();
        if(numero != c){
            segundaPilha.push(numero);
        }
       }
        
        while(!segundaPilha.empty()){
        pilha.push(segundaPilha.pop());
       }
        
        System.out.println("Pilha final: " + pilha);

        input.close();
    }
}

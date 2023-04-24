import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

public class Questao6 {
    public static void main(String[] args) {
        
    Stack<Integer> pilha = new Stack<>();
    Queue<Integer> fila = new LinkedList<>();

    for(int i=0; i<1000; i++){
        fila.add((int) (Math.random()*1000));
        fila.add(-(int) (Math.random()*1000));
    }

    while(!fila.isEmpty()){
        int numeroRetirado = fila.poll();
        
        if(numeroRetirado>0){
            pilha.push(numeroRetirado);
        }else{
            if(!pilha.isEmpty()){
                int numeroTopo = pilha.peek();
                System.out.println("Número obtido do topo da pilha: " + numeroTopo);
                pilha.pop();
            }
        }
    }
}
}

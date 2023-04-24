import java.util.Queue;
import java.util.LinkedList;
import java.util.Random; // gera numeros aleatorios

public class Questao4 {
    public static void main(String[] args) {
        Random numerossAleatorios = new Random();
        Queue<Integer> f1 = new LinkedList<>();

        for(int i =0; i<100; i++){
            f1.add(numerossAleatorios.nextInt());
        }

        Queue<Integer> f2 = inverterFila(f1);

        System.out.println("Fila 1: " + f1);
        System.out.println("Fila 2: " + f2);
    }

    private static Queue<Integer> inverterFila(Queue<Integer> f1){
        Queue<Integer> f2 = new LinkedList<>();

        while(!f1.isEmpty()){
            f2.add(f1.poll());
        }
        return f2;
    }
}
    

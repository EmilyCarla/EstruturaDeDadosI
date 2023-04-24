import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;

public class Questao5 {
    public static void main(String[] args) {

        Random numerosAleatorios = new Random();
        Queue<Integer> filaF = new LinkedList<>();
        Stack<Integer> pilhaP = new Stack<>();

        for(int i=0; i<1000; i++){
            int numerosSorteados = numerosAleatorios.nextInt();
            if(filaF.contains(numerosSorteados)){
                pilhaP.push(numerosSorteados);
            }else{
                filaF.add(numerosSorteados);
            }
        }

        System.out.println("Fila F: ");
        while(!filaF.isEmpty()){
            System.out.println(filaF.poll() + " ");
        }

        System.out.println("\nPilha P: ");
        while(!pilhaP.isEmpty()){
            System.out.println(pilhaP.pop() + " ");
        }
    }
}

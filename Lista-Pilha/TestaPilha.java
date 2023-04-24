//Questao8

import java.util.Stack;
import java.util.Random;

public class TestaPilha {
    public static void main(String[] args) {

        Stack<Integer> pilhaN = new Stack<>();
        Stack<Integer> pilhaP = new Stack<>(); 
        Random numeroAleatorio = new Random();

        for(int i=0; i<1000; i++){
            int numeroSorteado = numeroAleatorio.nextInt(201)-100;
            if(numeroSorteado>0){
                pilhaP.push(numeroSorteado);
            }
            if(numeroSorteado<0){
                pilhaN.push(numeroSorteado);
            }
            if(numeroSorteado==0){
                if(!pilhaP.isEmpty() && !pilhaN.isEmpty()){
                    System.out.println("P: " +  pilhaP.pop());
                    System.out.println("N:" + pilhaN.pop());
                } 
            }
        }  

        System.out.println("\nElementos da pilha N: " + pilhaN);
        System.out.println("\nElementos da pilha P: " + pilhaP);
    }
}

import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

public class SepararParImpar {

    public static void separarParImpar(Stack<Integer> pilha, Queue<Integer> fila) {
        // Lista para armazenar os pares
        Stack<Integer> pilhaPares = new Stack<>();

        // Lista para armazenar os ímpares
        Queue<Integer> filaImpares = new LinkedList<>();

        while (!pilha.isEmpty()) {
            int elemento = pilha.pop();
            if (elemento % 2 == 0) {
                pilhaPares.push(elemento);
            } else {
                filaImpares.add(elemento);
            }
        }

        while (!fila.isEmpty()) {
            int elemento = fila.poll();
            if (elemento % 2 == 0) {
                pilhaPares.push(elemento);
            } else {
                filaImpares.add(elemento);
            }
        }

        System.out.println("Pilha:");
        while (!pilhaPares.isEmpty()) {
            System.out.println(pilhaPares.pop());
        }

        System.out.println("\nFila:");
        while (!filaImpares.isEmpty()) {
            System.out.print(filaImpares.poll() + " ");
        }
    }

    public static void main(String[] args) {
        Stack<Integer> pilhaTeste = new Stack<>();
        pilhaTeste.push(35);
        pilhaTeste.push(25);
        pilhaTeste.push(20);
        pilhaTeste.push(30);

        Queue<Integer> filaTeste = new LinkedList<>();
        filaTeste.add(40);
        filaTeste.add(45);
        filaTeste.add(50);
        filaTeste.add(55);
        filaTeste.add(65);

        separarParImpar(pilhaTeste, filaTeste);
    }
}

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Exemplo de lista de números
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(5);
        numeros.add(36);
        numeros.add(4);
        numeros.add(8);
        numeros.add(6);
        numeros.add(7);

        System.out.println("Lista original: " + numeros);

        // Chamando o método para inverter a ordem
        inverterOrdem(numeros);

        System.out.println("Lista após inverter a ordem: " + numeros);
    }

    // Método para inverter a ordem dos elementos na lista
    public static void inverterOrdem(List<Integer> lista) {
        Collections.reverse(lista);
    }
}

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Exercicio2 {

    public static void main(String[] args) {
        // Exemplo de lista de números
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(11);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);

        System.out.println("Lista original: " + numeros);

        // Chamando o método para excluir ímpares
        excluirNumerosImpares(numeros);

        System.out.println("Lista após excluir ímpares: " + numeros);
    }

    // Método para excluir números ímpares da lista
    public static void excluirNumerosImpares(List<Integer> lista) {
        Iterator<Integer> iterator = lista.iterator();

        while (iterator.hasNext()) {
            int numero = iterator.next();
            if (numero % 2 != 0) {
                iterator.remove();
            }
        }
    }
}

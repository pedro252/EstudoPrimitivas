import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveRepeatedElements {

    public static List<Integer> elementosRepetidos(List<Integer> lst) {
        Set<Integer> seen = new HashSet<>();
        List<Integer> result = new ArrayList<>();

        for (Integer item : lst) {
            if (!seen.contains(item)) {
                seen.add(item);
                result.add(item);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> listaComRepeticao = new ArrayList<>();
        listaComRepeticao.add(1);
        listaComRepeticao.add(2);
        listaComRepeticao.add(3);
        listaComRepeticao.add(4);
        listaComRepeticao.add(2);
        listaComRepeticao.add(3);
        listaComRepeticao.add(5);
        listaComRepeticao.add(6);
        listaComRepeticao.add(6);
        listaComRepeticao.add(7);

        List<Integer> listaSemRepeticao = elementosRepetidos(listaComRepeticao);

        System.out.println("Lista original: " + listaComRepeticao);
        System.out.println("Lista sem elementos repetidos (ordem preservada): " + listaSemRepeticao);
    }
}

import java.util.Stack;

public class VerificadorParenteses {

    public static boolean verificaBalanceamento(String expressao) {
        // Cria uma pilha para armazenar os parênteses
        Stack<Character> pilha = new Stack<>();

        // Percorre cada caractere na expressão
        for (char caractere : expressao.toCharArray()) {
            // Se o caractere é um parêntese de abertura, empilha na pilha
            if (caractere == '(' || caractere == '[' || caractere == '{') {
                pilha.push(caractere);
            } else if (caractere == ')' || caractere == ']' || caractere == '}') {
                // Se o caractere é um parêntese de fechamento, verifica se a pilha não está vazia
                // e se o parêntese de abertura correspondente está no topo da pilha
                if (pilha.isEmpty() || !isParAbertura(pilha.pop(), caractere)) {
                    return false; // Parênteses desbalanceados
                }
            }
        }

        // A expressão está balanceada se a pilha estiver vazia no final
        return pilha.isEmpty();
    }

    private static boolean isParAbertura(char parAbertura, char parFechamento) {
        return (parAbertura == '(' && parFechamento == ')') ||
                (parAbertura == '[' && parFechamento == ']') ||
                (parAbertura == '{' && parFechamento == '}');
    }

    public static void main(String[] args) {
        // Exemplo de expressão com parênteses balanceados
        String expressaoBalanceada = "(a + b) * (c - d)";

        // Exemplo de expressão com parênteses desbalanceados
        String expressaoDesbalanceada = "((x + y) * (z - w)";

        // Verifica e imprime o resultado
        System.out.println("Expressão balanceada: " + verificaBalanceamento(expressaoBalanceada));
        System.out.println("Expressão desbalanceada: " + verificaBalanceamento(expressaoDesbalanceada));
    }
}

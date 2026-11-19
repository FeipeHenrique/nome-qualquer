
public class Main {

    public static void main(String[] args) {

        testarPilha();
        testarFila();

    }

    public static void testarPilha() {

        System.out.println("===== TESTE DA PILHA =====");

        Pilha pilha = new Pilha(3);

        // Empilhar 3 valores
        pilha.empilhar("A");
        pilha.empilhar("B");
        pilha.empilhar("C");

        System.out.println("Pilha: " + pilha);

        // Desempilhar 1 valor
        System.out.println("Removido: " + pilha.desempilhar());

        System.out.println("Pilha atual: " + pilha);
        System.out.println("Topo: " + pilha.espiar());
        System.out.println("Tamanho: " + pilha.tamanho());

        // Testar exceção
        System.out.println("\nTestando pilha vazia:");

        Pilha vazia = new Pilha(3);

        try {
            vazia.desempilhar();
        } catch (RuntimeException e) {
            System.out.println("Exceção tratada: " + e.getMessage());
        }
    }

    public static void testarFila() {

        System.out.println("\n===== TESTE DA FILA =====");

        FilaCircular fila = new FilaCircular(5);

        // Enfileirar 4 elementos
        fila.enfileirar("A");
        fila.enfileirar("B");
        fila.enfileirar("C");
        fila.enfileirar("D");

        System.out.println("Fila: " + fila);

        // Desenfileirar 2 elementos
        System.out.println("Removido: " + fila.desenfileirar());
        System.out.println("Removido: " + fila.desenfileirar());

        System.out.println("Fila atual: " + fila);

        // Enfileirar mais 3 elementos
        fila.enfileirar("E");
        System.out.println("Fila: " + fila);

        fila.enfileirar("F");
        System.out.println("Fila: " + fila);

        fila.enfileirar("G");
        System.out.println("Fila: " + fila);

        System.out.println("Fila cheia? " + fila.estaCheia());
        System.out.println("Quantidade: " + fila.tamanho());
    }
}

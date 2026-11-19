public class Pilha {
    String[] elementos;
    int topo;

    public Pilha(int tamanho) {
        elementos = new String[tamanho];
        topo = -1; 
        // A pilha começa vaiza, por isso o topo é -1, se ouver um elemento, o topo será 0 assim por diante
    }

    public void empilhar(String elemento) {
        if (topo == elementos.length - 1) {
            throw new RuntimeException("Pilha cheia");
            // Se o topo for igual ao tamanho do array - 1, significa que a pilha está cheia
        }
        elementos[++topo] = elemento;
        // Aumenta o topo e adiciona o elemento na posição do topo (overflow)
    }

    public String desempilhar() {
        if (topo == -1) {
            throw new RuntimeException("Pilha vazia");
            // Se o topo for -1, significa que a pilha está vazia
        }
        return elementos[topo--];
        // Retorna o elemento do topo e diminui o topo (underflow)
    }

    public String espiar() {
        if (topo == -1) {
            throw new RuntimeException("Pilha vazia");
            // Se o topo for -1, significa que a pilha está vazia
        }
        return elementos[topo];
        // Retorna o elemento do topo sem removê-lo
    }

    public boolean estaVazia() {
        return topo == -1;
        // Retorna true se o topo for -1, ou seja, a pilha está vazia
    }
    public boolean estaCheia() {
        return topo == elementos.length - 1;
        // Retorna true se o topo for igual ao tamanho do array - 1, ou seja, a pilha está cheia
    }

    public int tamanho() {
        return topo + 1;
        // Retorna o tamanho da pilha, que é o topo + 1, já que o topo começa em -1
    }

    public String toString() {
        // Se eu fizesse com a função desempilhar, eu estaria removendo os elementos da pilha 🤓
        String resultado = "[";
        for (int i = 0; i <= topo; i++) {
            resultado += elementos[i];
            // Percorre o array de elementos da pilha e adiciona cada elemento na string resultado
            if (i < topo) {
                resultado += ", ";
            }
        }
        resultado += "]";
        return resultado;
    }
}
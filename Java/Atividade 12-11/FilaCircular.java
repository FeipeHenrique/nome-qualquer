public class FilaCircular {
    String[] elementos;
    int inicio;
    int fim;
    int quantidade;

    public FilaCircular(int tamanho) {
        elementos = new String[tamanho];
        inicio = 0;
        fim = 0;
        quantidade = 0;
        // A fila começa vazia, por isso o início e o fim são 0 e a quantidade é 0
    }

    public void enfileirar(String elemento) {
        if (quantidade == elementos.length) {
            throw new RuntimeException("Fila cheia");
            // Se a quantidade for igual ao tamanho do array, significa que a fila está cheia
        }
        elementos[fim] = elemento;
        fim = (fim + 1) % elementos.length;
        // Volta ao início do array quando chega no final, usando o operador módulo
        quantidade++;
        // Adiciona o elemento na posição do fim, avança o fim e aumenta a quantidade
    }

    public String desenfileirar() {
        if (quantidade == 0) {
            throw new RuntimeException("Fila vazia");
            // Se a quantidade for 0, significa que a fila está vazia
        }
        String elemento = elementos[inicio];
        inicio = (inicio + 1) % elementos.length;
        // Volta ao início do array quando chega no final, usando o operador módulo
        quantidade--;
        // Remove o elemento da posição do início, avança o início e diminui a quantidade
        return elemento;
    }

    public String frente() {
        if (quantidade == 0) {
            throw new RuntimeException("Fila vazia");
            // Se a quantidade for 0, significa que a fila está vazia
        }
        return elementos[inicio];
        // Retorna o elemento da posição do início, sem removê-lo da fila
    }

    public boolean estaVazia() {
        return quantidade == 0;
        // Retorna true se a quantidade for 0, ou seja, se a fila estiver vazia
    }

    public boolean estaCheia() {
        return quantidade == elementos.length;
        // Retorna true se a quantidade for igual ao tamanho do array, ou seja, se a fila estiver cheia
    }

    public int tamanho() {
        return quantidade;
        // Retorna a quantidade de elementos na fila
    }

    @Override
    public String toString() {
        String resultado = "[";
        for (int i = 0; i < quantidade; i++) {
            resultado += elementos[(inicio + i) % elementos.length];
            // Percorre os elementos da fila a partir do início (com wrap-around)
            if (i < quantidade - 1) {
                resultado += ", ";
            }
        }
        resultado += "]";
        return resultado;
    }
}
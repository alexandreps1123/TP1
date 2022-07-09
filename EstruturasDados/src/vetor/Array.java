package vetor;

public class Array {

    private String[] elementos;
    private int tamanho;

    public Array(int tamanho) {
        this.elementos = new String[tamanho];
        this.tamanho = 0;
    }

    public void adiciona(String elemento) throws Exception {
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        } else {
            throw new Exception("Vetor cheio!");
        }
    }

    public int tamanho() {
        return this.tamanho;
    }

    public String busca(int posicao) {
        if (!(posicao >= 0 && posicao < this.tamanho)) {
            throw new IllegalArgumentException("Posição "+posicao+" fora do tamanho do vetor!");
        }
        return this.elementos[posicao];
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");
        for (int i = 0; i < this.tamanho-1; i++) {
            s.append(this.elementos[i]);
            s.append(", ");
        }

        if (this.tamanho > 0) {
            s.append(this.elementos[this.tamanho-1]);
            s.append("]");
        }

        return s.toString();
    }

}

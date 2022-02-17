package modulo2.aula24.P1;

public class Dados {
    private Object[] dados;
    private int posicao;

    public Dados() {
        this.dados = new Object[5];
    }

    public int numeroItens() {
        return posicao;
    }

    public void add(Object obj) {
        verificaArray();
        this.dados[posicao] = obj;
        posicao++;
    }

    public void remove(Object obj) {
        int indice = busca(obj);
        if (indice >= 0) {
            reorganizaArray(indice);
        }
    }

    public boolean existe(Object obj) {
        int indice = busca(obj);
        if (indice >= 0) {
            return true;
        }
        return false;
    }

    private int busca(Object obj) {
        for (int i = 0; i < dados.length; i++) {
            if (obj.equals(dados[i])) {
                return i;
            }
        }
        return -1;
    }

    private void reorganizaArray(int pos) {
        for (int i = pos; i < posicao; i++) {
            dados[i] = dados[i + 1];
        }
        posicao--;
    }

    public void verificaArray() {
        /*
         * Possibilidade 1 if(posicao < this.dados.length){ / this.dados[posicao] = obj;
         * posicao++; } else{ Object[] dados2 = new Object[this.dados.length + 5];
         * for(int i = 0; i < dados.length; i++){ dados2[i] = dados[1];//copiando os
         * dados } dados = dados2;//substituindo os arrays this.dados[posicao] = obj;
         * posicao++; }
         */
        // Possibilidade 2

        if (posicao >= this.dados.length) {
            int novoTamanho = this.dados.length + 5;
            Object[] dados2 = new Object[novoTamanho];
            for (int i = 0; i < dados.length; i++) {
                dados2[i] = dados[i];
            }
            dados = dados2;
        }
    }
}


package implementacaoarvores;

public class Arvore_AVL {
    private NoArvore raiz;
    private int comparacoes;

    public Arvore_AVL() {
        this.raiz = null;
        this.comparacoes = 0;
    }

      public void inserirElemento(int elemento) {
        if (this.raiz == null) {
            raiz = new NoArvore(elemento, null, null, null);
        }
        else if (this.raiz.getvalorNo() == elemento) {
            return; //ignora elemento igual
        }
        else {
            boolean loop = true;
            boolean insert_left = false;
            NoArvore apontador = null;

            if (elemento < raiz.getvalorNo()) {
                if (raiz.getfilhoE() != null) {
                    apontador = raiz.getfilhoE();
                }
                else {
                    apontador = raiz;
                    insert_left = true;
                    loop = false;
                }
            }
            else {
                if (raiz.getfilhoD() != null) {
                    apontador = raiz.getfilhoD();
                }
                else {
                    apontador = raiz;
                    loop = false;
                }
            }

            while (loop) {
                if (elemento == apontador.getvalorNo()) {
                    return; // ignora elemento igual
                }

                if (elemento < apontador.getvalorNo()) {
                    if (apontador.getfilhoE() != null) {
                        apontador = apontador.getfilhoE();
                    }
                    else {
                        insert_left = true;
                        break;
                    }
                }
                else {
                    if (apontador.getfilhoD() != null) {
                        apontador = apontador.getfilhoD();
                    }
                    else {
                        break;
                    }
                }
            }

            NoArvore novo = new NoArvore(elemento, apontador, null, null);

            if (insert_left) {
                apontador.setfilhoE(novo);
            }
            else {
                apontador.setfilhoD(novo);
            }
        }
    }

    public int buscarElemento(int elemento) {
        NoArvore apontador = this.raiz;
        comparacoes = 0;

        while (apontador != null) {
            comparacoes++;
            if (elemento == apontador.getvalorNo()) {
                return comparacoes; //achou
            }
            else if (elemento < apontador.getvalorNo()) {
                apontador = apontador.getfilhoE();
            }
            else {
                apontador = apontador.getfilhoD();
            }
        }

        return comparacoes; // nao achou
    }

    public int getComparacoes() {
        return comparacoes;
    }

    public void setComparacoes(int comparacoes) {
        this.comparacoes = comparacoes;
    }
    
    
}

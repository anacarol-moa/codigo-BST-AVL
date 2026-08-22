package implementacaoarvores;

public class Arvore_AVL {
    private NoArvore raiz;
    private int comparacoes;
    private int balanceamento;

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
            boolean loop = true; //controla se entra no loop ou nao
            boolean insert_left = false; //controla se insere na direita ou esquerda
            NoArvore apontador = null; //ponteiro pra descer a arvore
            if (elemento < raiz.getvalorNo()){
                if (raiz.getfilhoE() != null){
                    apontador = raiz.getfilhoE();
                }
                else{ //caso raiz nao tenha filhos
                    apontador = raiz;
                    insert_left = true;
                    loop = false;
                }
            }
            else if (elemento > raiz.getvalorNo()){
                if (raiz.getfilhoD() != null){
                    apontador = raiz.getfilhoD();
                }
                else{ //caso raiz nao tenha filhos
                    apontador = raiz;
                    loop = false;
                }
            }
            while(loop){//desce a arvore procurando o lugar para inserir
                if (elemento == apontador.getvalorNo()){ //ignora elemento igual
                    return;
                }
                if (elemento < apontador.getvalorNo()){
                    if (apontador.getfilhoE() != null){
                        apontador = apontador.getfilhoE();
                    }
                    else{ //filho null, achou o lugar de inserir
                        insert_left = true;
                        break;
                    }
                }
                else if (elemento > apontador.getvalorNo()){
                    if (apontador.getfilhoD() != null) {
                        apontador = apontador.getfilhoD();
                    }
                    else{ //filho null, achou o lugar de inserir
                        break;
                    }
                }
            }
            NoArvore f = new NoArvore(elemento, apontador, null, null); //cria o elemento para inserir
            if (insert_left){
                apontador.setfilhoE(f);
            }
            else{
                apontador.setfilhoD(f);
            }
            this.balanceamento = calcBalanceamento(this.raiz); // calcula o balancemento da arvore toda
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

        return comparacoes; //nn achou
    }

    public int getComparacoes() {
        return comparacoes;
    }

    private int calcBalanceamento(NoArvore apontador) {
       int balancLado1 = 0;
       int balancLado2 = 0;
       if (apontador.getfilhoE() != null){
           balancLado1 += BalanceamentoRecursivo(apontador.getfilhoE());
       }
       else{
           balancLado1 = 0;
       }
       if (apontador.getfilhoD() != null){
           balancLado2 += BalanceamentoRecursivo(apontador.getfilhoD());
       }
       else{
           balancLado2 = 0;
       }
       int balanceamento = balancLado1-balancLado2; //esquerda - direita
       return balanceamento;
    }
    private int BalanceamentoRecursivo(NoArvore apontador){
        if (apontador.getfilhoD() == null && apontador.getfilhoE() == null){ //no folha
            return 1;
        }
        int e = 0, d = 0;
        if (apontador.getfilhoE() != null) {
            e = BalanceamentoRecursivo(apontador.getfilhoE());
        }
        if (apontador.getfilhoD() != null){
            d = BalanceamentoRecursivo(apontador.getfilhoD());
        }
        if (e > d){ //tem que retornar o valor do maior dos lados
            return e+1;
        }
        else{
            return d+1;
        }
    }

    private void RES(NoArvore apontador){ //quando o no inserido ta mais a direita possivel da arvore
    }

    private void RDS(NoArvore apontador){ //quando o no inserido ta mais a esquerda possivel da arvore

    }

    private void RED(NoArvore apontador){

    }

    private void RDD(NoArvore apontador){

    }
}

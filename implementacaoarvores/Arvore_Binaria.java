package implementacaoarvores;

public class Arvore_Binaria {
    private NoArvore raiz;

    public Arvore_Binaria() {
        this.raiz = null;
    }
    
    public void inserirElemento(int elemento){
        if (this.raiz == null){
            raiz = new NoArvore(elemento, null, null, null);
        }
        else if (this.raiz.getvalorNo() == elemento){ //ignora elemento igual
            return;
        }
        else{
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
        }
    }
    
    public boolean buscarElemento(int elemento){
    NoArvore apontador = this.raiz;

    while (apontador != null){
        if (elemento == apontador.getvalorNo()){
            return true; //achou
        }
        else if (elemento < apontador.getvalorNo()){
            apontador = apontador.getfilhoE(); //vai pra esquerda
        }
        else{
            apontador = apontador.getfilhoD(); //vai pra direita
        }
    }

    return false; //nn achou
}
}


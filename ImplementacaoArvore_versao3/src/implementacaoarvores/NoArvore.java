package implementacaoarvores;

public class NoArvore {
    private int valorNo;
    private NoArvore pai;
    private NoArvore filhoD;
    private NoArvore filhoE;
    
    // Metodo construtor com parametros.
    public NoArvore(int No, NoArvore pai, NoArvore FilhoD, NoArvore FilhoE) {
        this.valorNo = No;
        this.pai = pai;
        this.filhoD = FilhoD;
        this.filhoE = FilhoE;
    }

    public int getvalorNo() {
        return this.valorNo;
    }

    public void setvalorNo(int No) {
        this.valorNo = No;
    }

    public NoArvore getPai() {
        return pai;
    }

    public void setPai(NoArvore pai) {
        this.pai = pai;
    }

    public NoArvore getfilhoD() {
        return this.filhoD;
    }

    public void setfilhoD(NoArvore FilhoD) {
        this.filhoD = FilhoD;
    }

    public NoArvore getfilhoE() {
        return this.filhoE;
    }

    public void setfilhoE(NoArvore FilhoE) {
        this.filhoE = FilhoE;
    }
}

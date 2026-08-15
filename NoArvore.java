package implementacaoarvores;

public class NoArvore {
    private int valorNo;
    private int filhoD;
    private int filhoE;

    // Metodo construtor vazio.
    public NoArvore() {
        this.valorNo = 0;
        this.filhoD = 0;
        this.filhoE = 0;
    }
    
    // Metodo construtor com parametros.
    public NoArvore(int No, int FilhoD, int FilhoE) {
        this.valorNo = No;
        this.filhoD = FilhoD;
        this.filhoE = FilhoE;
    }

    public int getvalorNo() {
        return valorNo;
    }

    public void setvalorNo(int No) {
        this.valorNo = No;
    }

    public int getfilhoD() {
        return filhoD;
    }

    public void setfilhoD(int FilhoD) {
        this.filhoD = FilhoD;
    }

    public int getfilhoE() {
        return filhoE;
    }

    public void setfilhoE(int FilhoE) {
        this.filhoE = FilhoE;
    }   
}

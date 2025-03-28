package model;

public class ItensCafe {

    private boolean poCafe;
    private boolean agua;
    private boolean fogo;
    private boolean coador;
    private boolean bule;

    public ItensCafe(Boolean poCafe, boolean agua, boolean fogo, boolean coador, boolean bule) {
        this.poCafe = poCafe;
        this.poCafe = agua;
        this.poCafe = fogo;
        this.poCafe = coador;
        this.poCafe = bule;
    }

    public boolean verificarItens() {
        return poCafe && agua && fogo && coador && bule;
        
    }

    
}
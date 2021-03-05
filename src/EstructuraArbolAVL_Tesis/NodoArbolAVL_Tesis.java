
package EstructuraArbolAVL_Tesis;

import Clases.Tesis;

public class NodoArbolAVL_Tesis {
     public Tesis tesis;
    public int fe;
    public NodoArbolAVL_Tesis hijoIzquierdo,hijoDerecho;

    public NodoArbolAVL_Tesis() {
    }

    public NodoArbolAVL_Tesis(Tesis tesis) {
        this.tesis = tesis;
        this.fe = 0;
        this.hijoIzquierdo = null;
        this.hijoDerecho = null;
    }

    public Tesis getTesis() {
        return tesis;
    }

    public void setTesis(Tesis tesis) {
        this.tesis = tesis;
    }

    public int getFe() {
        return fe;
    }

    public void setFe(int fe) {
        this.fe = fe;
    }

    public NodoArbolAVL_Tesis getHijoIzquierdo() {
        return hijoIzquierdo;
    }

    public void setHijoIzquierdo(NodoArbolAVL_Tesis hijoIzquierdo) {
        this.hijoIzquierdo = hijoIzquierdo;
    }

    public NodoArbolAVL_Tesis getHijoDerecho() {
        return hijoDerecho;
    }

    public void setHijoDerecho(NodoArbolAVL_Tesis hijoDerecho) {
        this.hijoDerecho = hijoDerecho;
    }
    
    
}

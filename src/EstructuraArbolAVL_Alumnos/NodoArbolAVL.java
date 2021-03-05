
package EstructuraArbolAVL_Alumnos;

import Clases.Alumno;


public class NodoArbolAVL {
    public Alumno alum;
    public int fe;
    public NodoArbolAVL hijoIzquierdo,hijoDerecho;

    public NodoArbolAVL(Alumno alum) {
        this.alum = alum;
        this.fe = 0;
        this.hijoIzquierdo = null;
        this.hijoDerecho = null;
    }

    public Alumno getAlum() {
        return alum;
    }

    public void setAlum(Alumno alum) {
        this.alum = alum;
    }

    public int getFe() {
        return fe;
    }

    public void setFe(int fe) {
        this.fe = fe;
    }

    public NodoArbolAVL getHijoIzquierdo() {
        return hijoIzquierdo;
    }

    public void setHijoIzquierdo(NodoArbolAVL hijoIzquierdo) {
        this.hijoIzquierdo = hijoIzquierdo;
    }

    public NodoArbolAVL getHijoDerecho() {
        return hijoDerecho;
    }

    public void setHijoDerecho(NodoArbolAVL hijoDerecho) {
        this.hijoDerecho = hijoDerecho;
    }
    
    
    
}

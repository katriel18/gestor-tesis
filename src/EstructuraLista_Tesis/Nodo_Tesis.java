
package EstructuraLista_Tesis;

import Clases.Tesis;

public class Nodo_Tesis {
  
    public Tesis t;
    public Nodo_Tesis sig;
    public Nodo_Tesis ant;
    

    public Nodo_Tesis(Tesis t) {
        this.t = t;
        sig=null;
        ant=null;
    }


}

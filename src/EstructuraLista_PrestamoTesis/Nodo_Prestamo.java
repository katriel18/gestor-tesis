
package EstructuraLista_PrestamoTesis;

import Clases.Prestamo;

public class Nodo_Prestamo {
    
    public Prestamo p;
    public Nodo_Prestamo sig;
    public Nodo_Prestamo(Prestamo p) {
        this.p = p;
        sig=null;
  
    }
}

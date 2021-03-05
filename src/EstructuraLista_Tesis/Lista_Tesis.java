
package EstructuraLista_Tesis;

import Clases.Tesis;



public class Lista_Tesis {
    public Nodo_Tesis cabecera;
   

    public Lista_Tesis() {
    }

    public Lista_Tesis(Nodo_Tesis cabecera) {
        this.cabecera = cabecera;
    }


    public void insertarAlInicio(Tesis nuevo) {
        Nodo_Tesis nuevoNodo = new Nodo_Tesis(nuevo);
        nuevoNodo.sig = cabecera;
        if (cabecera != null) {
            cabecera.ant = nuevoNodo;
        }
        cabecera = nuevoNodo;
    }
    //metodo de buscar secuncianlmente
    public Nodo_Tesis buscar(int valor){
        Nodo_Tesis nodo=null;
        if (cabecera != null){
            Nodo_Tesis aux = cabecera;
             
                 while (aux != null){
                    if (aux.t.codigoTesis == valor ){
                           
                         nodo= aux;  
                    }
                    aux = aux.sig;
                                  
                }                     
        }
        return nodo;
     }
    //modificar datos por estado de la lista
    public boolean modificarPorEstado(int cod) {
        Nodo_Tesis aux = buscar(cod);
        
        if(aux==null){
            
            return false;
            
        }else{
            
            aux.t.estado=0;
            return true;
        }
    }
    //modificar todos datos de la lista
    public boolean modificar(Tesis nuevo) {
        Nodo_Tesis aux = buscar(nuevo.codigoTesis);
        
        if(aux==null){
            
            return false;
            
        }else{
            aux.t.asesor=nuevo.asesor;
            aux.t.autor=nuevo.autor;
            aux.t.tipoTesis=nuevo.tipoTesis;
            aux.t.descripcion=nuevo.descripcion;
            
            aux.t.facultad=nuevo.facultad;
            aux.t.publicacion.dia=nuevo.publicacion.dia;
            aux.t.publicacion.mes=nuevo.publicacion.mes;
            aux.t.publicacion.año=nuevo.publicacion.año;
            aux.t.titulo=nuevo.titulo;
            return true;
        }
    }
    public boolean eliminar(int cod) {
        boolean band=false;
        Nodo_Tesis aux = cabecera;
        Nodo_Tesis ant=null;
        if (aux != null){
            
             
                 while (aux != null && band==false){
                     
                    if (aux.t.codigoTesis == cod ){
                           
                        
                         //esta en el icio de la lista
                         if(aux==cabecera)
                             aux=aux.sig;
                         //esta despues del inicio
                         else
                             ant.sig=aux.sig;
                         
                         band=true;
                    }
                    ant=aux;
                    aux = aux.sig;  
                }                     
        }
        return band;
     }
    @Override
    public String toString() {
        String cadena = "";
        Nodo_Tesis aux = cabecera;
        while (aux != null) {
            cadena += aux.t.codigoTesis + ", ";
            aux = aux.sig;
        }
        return cadena;
    }
   
    public void ordenarPorBurbuja(){
        for(Nodo_Tesis  i = cabecera; i != null; i = i.sig){
            for (Nodo_Tesis j = i;  j!= null; j = j.sig) {
                if(i.t.codigoTesis> j.t.codigoTesis){
                    //Intercambiar
                    intercambiar(i, j);
                }
            } 
        }
    }
    public void ordenarPorBurbujaTitulo(){
        for(Nodo_Tesis  i = cabecera; i != null; i = i.sig){
            for (Nodo_Tesis j = i;  j!= null; j = j.sig) {
                if(i.t.titulo.compareToIgnoreCase(j.t.titulo)>0){
                    //Intercambiar
                    intercambiar(i, j);
                }
            } 
        }
    }
    
    private void intercambiar (Nodo_Tesis i, Nodo_Tesis j){
        int aux = i.t.codigoTesis;
        String aux1=i.t.titulo;
        String aux2=i.t.autor.nombre;
        String aux3=i.t.autor.apellido;  
        
        String aux4=i.t.descripcion;
        String aux5=i.t.asesor.nombre;
        String aux6=i.t.asesor.apellido;
        String aux7=i.t.facultad;
        int aux8=i.t.publicacion.dia;
        int aux9=i.t.publicacion.mes;
        int aux10=i.t.publicacion.año;
        String aux11=i.t.tipoTesis;
        int aux12=i.t.estado;
        int aux13=i.t.cont;
        
        i.t.codigoTesis = j.t.codigoTesis;
        i.t.titulo=j.t.titulo;
        i.t.autor.nombre = j.t.autor.nombre;
        i.t.autor.apellido=j.t.autor.apellido;
        
        i.t.descripcion= j.t.descripcion;
        i.t.asesor.nombre= j.t.asesor.nombre;
        i.t.asesor.apellido= j.t.asesor.apellido;
        i.t.facultad= j.t.facultad;
        i.t.publicacion.dia= j.t.publicacion.dia;
        i.t.publicacion.mes= j.t.publicacion.mes;
        i.t.publicacion.año= j.t.publicacion.año;
        i.t.tipoTesis= j.t.tipoTesis;
        i.t.estado= j.t.estado;
        i.t.cont= j.t.cont;
        
        
        j.t.codigoTesis = aux;
        j.t.titulo=aux1;
        j.t.autor.nombre = aux2;
        j.t.autor.apellido=aux3;
        
         j.t.descripcion = aux4;
        j.t.asesor.nombre=aux5;
        j.t.asesor.apellido = aux6;
        j.t.facultad=aux7;
         j.t.publicacion.dia= aux8;
        j.t.publicacion.mes=aux9;
        j.t.publicacion.año = aux10;
        j.t.tipoTesis=aux11;
        j.t.estado = aux12;
        j.t.cont=aux13;
        
        
    }
    


}

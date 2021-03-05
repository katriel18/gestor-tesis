
package EstructuraLista_PrestamoTesis;

import Clases.Prestamo;

public class Lista_Prestamo {
    public Nodo_Prestamo cabecera;
   

    
    public Lista_Prestamo() {
        this.cabecera = null;
    }


    public void insertarAlInicio(Prestamo nuevo) {
        Nodo_Prestamo nuevoNodo = new Nodo_Prestamo(nuevo);
        
        if (cabecera == null) {
            cabecera = nuevoNodo;
        }else{
            nuevoNodo.sig = cabecera;
            cabecera = nuevoNodo;
        }
        
    }
    //metodo de buscar secuncianlmente por codigo de prestamo
    public Nodo_Prestamo buscarCodigoAlumno(int valor){
        Nodo_Prestamo nodo=null;
        if (cabecera != null){
            Nodo_Prestamo aux = cabecera;
             
                 while (aux != null){
                    if (aux.p.codigoAlumno == valor ){
                           
                         nodo= aux;  
                    }
                    aux = aux.sig;
                                  
                }                     
        }
        return nodo;
     }
     //---------ordena por codigo de tesis
    public void ordenarPorBurbujaCodigoTesis(){
        for(Nodo_Prestamo  i = cabecera; i != null; i = i.sig){
            for (Nodo_Prestamo j = i;  j!= null; j = j.sig) {
                if(i.p.codigoTesis> j.p.codigoTesis){
                    //Intercambiar
                    intercambiar(i, j);
                }
            } 
        }
    }
   //---------ordena por dia de prestamo
    public void ordenarPorBurbujaDia(){
        for(Nodo_Prestamo  i = cabecera; i != null; i = i.sig){
            for (Nodo_Prestamo j = i;  j!= null; j = j.sig) {
                if(i.p.fechaPrestamo.dia> j.p.fechaPrestamo.dia){
                    //Intercambiar
                    intercambiar(i, j);
                }
            } 
        }
    }
    //---------ordena por mes de prestamo
    public void ordenarPorBurbujaMes(){
        for(Nodo_Prestamo  i = cabecera; i != null; i = i.sig){
            for (Nodo_Prestamo j = i;  j!= null; j = j.sig) {
                if(i.p.fechaPrestamo.mes> j.p.fechaPrestamo.mes){
                    //Intercambiar
                    intercambiar(i, j);
                }
            } 
        }
    }
    //---------ordena por anio de prestamo
    public void ordenarPorBurbujaAnio(){
        for(Nodo_Prestamo  i = cabecera; i != null; i = i.sig){
            for (Nodo_Prestamo j = i;  j!= null; j = j.sig) {
                if(i.p.fechaPrestamo.año> j.p.fechaPrestamo.año){
                    //Intercambiar
                    intercambiar(i, j);
                }
            } 
        }
    }
    
    public void ordenarPorBurbujaTitulo(){
        for(Nodo_Prestamo  i = cabecera; i != null; i = i.sig){
            for (Nodo_Prestamo j = i;  j!= null; j = j.sig) {
                if(i.p.titulo.compareToIgnoreCase(j.p.titulo)>0){
                    //Intercambiar
                    intercambiar(i, j);
                }
            } 
        }
    }
   
    private void intercambiar (Nodo_Prestamo i, Nodo_Prestamo j){
     
        int aux2 = i.p.codigoAlumno;
        int aux3 = i.p.codigoTesis;
        String aux=i.p.titulo;
        int aux4 = i.p.fechaPrestamo.dia;
        int aux5 = i.p.fechaPrestamo.mes;
        int aux6 = i.p.fechaPrestamo.año;

         i.p.codigoAlumno=j.p.codigoAlumno;
        i.p.codigoTesis = j.p.codigoTesis;
         i.p.titulo = j.p.titulo;
       i.p.fechaPrestamo.dia=j.p.fechaPrestamo.dia;
        i.p.fechaPrestamo.mes=j.p.fechaPrestamo.mes;
         i.p.fechaPrestamo.año=j.p.fechaPrestamo.año;
                
      
       j.p.codigoAlumno=aux2;
        j.p.codigoTesis = aux3;
        j.p.titulo = aux;
        j.p.fechaPrestamo.dia=aux4;
        j.p.fechaPrestamo.mes=aux5;
        j.p.fechaPrestamo.año=aux6;
        
        
    }
}

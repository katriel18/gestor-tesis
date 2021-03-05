
package EstructuraArbolAVL_Tesis;

import Clases.Tesis;


public class ArbolAVL_Tesis {
     public NodoArbolAVL_Tesis raiz;
    public String inOrden;
    public int cant;
    public ArbolAVL_Tesis() {
        this.raiz = null;
    }

    public NodoArbolAVL_Tesis getRaiz() {
        return raiz;
    }

    public void setRaiz(NodoArbolAVL_Tesis raiz) {
        this.raiz = raiz;
    }

    public String getInOrden() {
        return inOrden;
    }

    public void setInOrden(String inOrden) {
        this.inOrden = inOrden;
    }
    
    //buscar por codigo de alumno iterativmente

    public NodoArbolAVL_Tesis buscarNodo(int d){
         NodoArbolAVL_Tesis aux=raiz;
         if(aux!=null){
            while(aux.tesis.codigoTesis!=d){
                if(d<aux.tesis.codigoTesis){
                    aux=aux.hijoIzquierdo;
                }else{
                    aux=aux.hijoDerecho;
                }
                if(aux==null){
                    return null;
                }

            }
        }else{
            aux=null;
        }
         return aux;
     }
     //--------------modificar nodo---------------------
    public boolean modificar(Tesis nuevo){
        
        NodoArbolAVL_Tesis aux=buscarNodo(nuevo.codigoTesis);
        if(aux==null){
            
            return false;
            
        }else{
            aux.tesis.asesor=nuevo.asesor;
            aux.tesis.autor=nuevo.autor;
            aux.tesis.tipoTesis=nuevo.tipoTesis;
            aux.tesis.descripcion=nuevo.descripcion;
          
            aux.tesis.facultad=nuevo.facultad;
            aux.tesis.publicacion.dia=nuevo.publicacion.dia;
            aux.tesis.publicacion.mes=nuevo.publicacion.mes;
            aux.tesis.publicacion.año=nuevo.publicacion.año;
            aux.tesis.titulo=nuevo.titulo;
            return true;
        }
    }
    //-----------modificar el estado de la tesis---------------
    public boolean modificarEstadoTesis(Tesis nuevo){
        
        NodoArbolAVL_Tesis aux=buscarNodo(nuevo.codigoTesis);
        if(aux==null){
            
            return false;
            
        }else{
            
            aux.tesis.estado=nuevo.estado;
            
            return true;
        }
    }
    
    
     //--------------eliminar nodo---------------------
    public void borrar(int llave) {
      raiz= eliminar(llave, raiz);
      
      
       //hallar la cantidad de tesis
        cant=0;
        cantidadTesis(raiz);
    }

    public NodoArbolAVL_Tesis eliminar(int llave, NodoArbolAVL_Tesis nodo) {
      if (nodo==null)
        return null;
      if (nodo.tesis.codigoTesis==llave)
        return unir(nodo.hijoIzquierdo, nodo.hijoDerecho);

      if (llave<nodo.tesis.codigoTesis)
       
        nodo.setHijoIzquierdo(eliminar(llave, nodo.hijoIzquierdo));
      else
          
        nodo.setHijoDerecho(eliminar(llave, nodo.hijoDerecho));
      
      return nodo;
    }
    public NodoArbolAVL_Tesis unir(NodoArbolAVL_Tesis izq, NodoArbolAVL_Tesis der) {
        if (izq==null)
          return der;
        if (der==null)
          return izq;
        
        NodoArbolAVL_Tesis centro= unir(izq.hijoDerecho, der.hijoIzquierdo);
        izq.setHijoDerecho(centro);
        der.setHijoIzquierdo(izq);
    return der;
    }
    //obtener factor de equilibrio
    public int obtenerFE(NodoArbolAVL_Tesis x){
        if(x==null){
            return -1;
        }else{
            return x.fe;
        }
    }
    //rotacion simple a la izquierda
    public NodoArbolAVL_Tesis rotacionIzquierda(NodoArbolAVL_Tesis c){
        NodoArbolAVL_Tesis auxiliar=c.hijoIzquierdo;
        c.hijoIzquierdo=auxiliar.hijoDerecho;
        auxiliar.hijoDerecho=c;
        c.fe=Math.max(obtenerFE(c.hijoIzquierdo), obtenerFE(c.hijoDerecho))+1;
        auxiliar.fe=Math.max(obtenerFE(auxiliar.hijoIzquierdo), obtenerFE(auxiliar.hijoDerecho))+1;
      return auxiliar;
    
    }
    
    public NodoArbolAVL_Tesis rotacionDerecha(NodoArbolAVL_Tesis c){
        NodoArbolAVL_Tesis auxiliar=c.hijoDerecho;
        c.hijoDerecho=auxiliar.hijoIzquierdo;
        auxiliar.hijoIzquierdo=c;
        c.fe=Math.max(obtenerFE(c.hijoIzquierdo), obtenerFE(c.hijoDerecho))+1;
        auxiliar.fe=Math.max(obtenerFE(auxiliar.hijoIzquierdo), obtenerFE(auxiliar.hijoDerecho))+1;
      return auxiliar;
    
    }
    //rotacion doble a la izquierda
    public NodoArbolAVL_Tesis rotacionDobleIzquierda(NodoArbolAVL_Tesis c){
        NodoArbolAVL_Tesis temporal;
        c.hijoIzquierdo=rotacionDerecha(c.hijoIzquierdo);
        temporal=rotacionIzquierda(c);
         return temporal;
    
    }
    //rotacion doble a la derecha
    public NodoArbolAVL_Tesis rotacionDobleDerecha(NodoArbolAVL_Tesis c){
        NodoArbolAVL_Tesis temporal;
        c.hijoDerecho=rotacionIzquierda(c.hijoDerecho);
        temporal=rotacionDerecha(c);
         return temporal;
    
    }
    private NodoArbolAVL_Tesis insertarAVL(NodoArbolAVL_Tesis nuevo ,NodoArbolAVL_Tesis subAr){
        
        NodoArbolAVL_Tesis nuevoPadre=subAr;
        if(nuevo.tesis.codigoTesis<subAr.tesis.codigoTesis){
            if(subAr.hijoIzquierdo==null){
                subAr.hijoIzquierdo=nuevo;
            }else{
                subAr.hijoIzquierdo=insertarAVL( nuevo , subAr.hijoIzquierdo);
                if(obtenerFE(subAr.hijoIzquierdo)-obtenerFE(subAr.hijoDerecho)==2){
                    if(nuevo.tesis.codigoTesis<subAr.hijoIzquierdo.tesis.codigoTesis){
                        nuevoPadre=rotacionIzquierda(subAr);
                    }else{
                        nuevoPadre=rotacionDobleIzquierda(subAr);
                    }
                }
            
        }
        
        
    }else if(nuevo.tesis.codigoTesis>subAr.tesis.codigoTesis){
        if(subAr.hijoDerecho==null){
                subAr.hijoDerecho=nuevo;
            }else{
                subAr.hijoDerecho=insertarAVL( nuevo , subAr.hijoDerecho);
                if(obtenerFE(subAr.hijoDerecho)-obtenerFE(subAr.hijoIzquierdo)==2){
                    if(nuevo.tesis.codigoTesis>subAr.hijoDerecho.tesis.codigoTesis){
                        nuevoPadre=rotacionDerecha(subAr);
                    }else{
                        nuevoPadre=rotacionDobleDerecha(subAr);
                    }
                }
            
        }
    }else if (nuevo.tesis.codigoTesis==subAr.tesis.codigoTesis){
            System.out.println("Tesis ya Registrado!");
    }
     if((subAr.hijoIzquierdo==null)&&(subAr.hijoDerecho!=null))   {
         subAr.fe=subAr.hijoDerecho.fe+1;
     }else if((subAr.hijoIzquierdo!=null)&&(subAr.hijoDerecho==null)){
         subAr.fe=subAr.hijoIzquierdo.fe+1;
     }else{
         subAr.fe=Math.max(obtenerFE(subAr.hijoIzquierdo), obtenerFE(subAr.hijoDerecho))+1;
     }
     return nuevoPadre;
     
}
    
    public void insertar(Tesis a){
        
        NodoArbolAVL_Tesis nuevo=new NodoArbolAVL_Tesis(a);
        if(raiz==null){
            raiz=nuevo;
        }else{
            raiz=insertarAVL(nuevo,raiz);
        }
        //hallar la cantidad de tesis
        cant=0;
        cantidadTesis(raiz);
    }
     public  void mostrarInOrden(NodoArbolAVL_Tesis r){
          if(r!=null){
            mostrarInOrden(r.hijoIzquierdo);
            
            inOrden=inOrden+"\n| "+r.tesis.codigoTesis+"\t| "+r.tesis.titulo
                    +"\t| "+r.tesis.autor;
            
            mostrarInOrden(r.hijoDerecho);
        }
     }
     //metodo para hallar la cantidad de tesis
          private  void cantidadTesis(NodoArbolAVL_Tesis r){
             
          if(r!=null){
            cantidadTesis(r.hijoIzquierdo);
            
            cant++;
            
            cantidadTesis(r.hijoDerecho);
        }
          
    }
     
     
   
}

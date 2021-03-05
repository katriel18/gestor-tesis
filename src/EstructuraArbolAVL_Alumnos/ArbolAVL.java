/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstructuraArbolAVL_Alumnos;

import Clases.Alumno;

/**
 *
 * @author ASUS
 */
public class ArbolAVL {
     public NodoArbolAVL raiz;
    public String inOrden;
    public int cant;
    public ArbolAVL() {
        this.raiz = null;
    }

    public NodoArbolAVL getRaiz() {
        return raiz;
    }

    public void setRaiz(NodoArbolAVL raiz) {
        this.raiz = raiz;
    }

    public String getInOrden() {
        return inOrden;
    }

    public void setInOrden(String inOrden) {
        this.inOrden = inOrden;
    }
    
    //buscar por codigo de alumno iterativmente

    public NodoArbolAVL buscarNodo(int d){
         NodoArbolAVL aux=raiz;
         if(aux!=null){
            while(aux.alum.codigoAlumno!=d){
                if(d<aux.alum.codigoAlumno){
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
    public boolean modificar(Alumno nuevo){
        
        NodoArbolAVL aux=buscarNodo(nuevo.codigoAlumno);
        if(aux==null){
            
            return false;
            
        }else{
            aux.alum.nombre=nuevo.nombre;
            aux.alum.apellido=nuevo.apellido;
            aux.alum.codigoAlumno=nuevo.codigoAlumno;
            aux.alum.facultad=nuevo.facultad;
            aux.alum.anioIngreso=nuevo.anioIngreso;
            return true;
        }
    }
    
    
    
     //--------------eliminar nodo---------------------
    public void borrar(int llave) {
      raiz= eliminar(llave, raiz);
      //hallar la cantidad de alumnos
        cant=0;
        cantAlumnos(raiz);
    }

    public NodoArbolAVL eliminar(int llave, NodoArbolAVL nodo) {
      if (nodo==null)
        return null;
      if (nodo.alum.codigoAlumno==llave)
        return unir(nodo.hijoIzquierdo, nodo.hijoDerecho);

      if (llave<nodo.alum.codigoAlumno)
       
        nodo.setHijoIzquierdo(eliminar(llave, nodo.hijoIzquierdo));
      else
          
        nodo.setHijoDerecho(eliminar(llave, nodo.hijoDerecho));
      
      return nodo;
    }
    public NodoArbolAVL unir(NodoArbolAVL izq, NodoArbolAVL der) {
        if (izq==null)
          return der;
        if (der==null)
          return izq;
        
        NodoArbolAVL centro= unir(izq.hijoDerecho, der.hijoIzquierdo);
        izq.setHijoDerecho(centro);
        der.setHijoIzquierdo(izq);
    return der;
    }
    //obtener factor de equilibrio
    public int obtenerFE(NodoArbolAVL x){
        if(x==null){
            return -1;
        }else{
            return x.fe;
        }
    }
    //rotacion simple a la izquierda
    public NodoArbolAVL rotacionIzquierda(NodoArbolAVL c){
        NodoArbolAVL auxiliar=c.hijoIzquierdo;
        c.hijoIzquierdo=auxiliar.hijoDerecho;
        auxiliar.hijoDerecho=c;
        c.fe=Math.max(obtenerFE(c.hijoIzquierdo), obtenerFE(c.hijoDerecho))+1;
        auxiliar.fe=Math.max(obtenerFE(auxiliar.hijoIzquierdo), obtenerFE(auxiliar.hijoDerecho))+1;
      return auxiliar;
    
    }
    
    public NodoArbolAVL rotacionDerecha(NodoArbolAVL c){
        NodoArbolAVL auxiliar=c.hijoDerecho;
        c.hijoDerecho=auxiliar.hijoIzquierdo;
        auxiliar.hijoIzquierdo=c;
        c.fe=Math.max(obtenerFE(c.hijoIzquierdo), obtenerFE(c.hijoDerecho))+1;
        auxiliar.fe=Math.max(obtenerFE(auxiliar.hijoIzquierdo), obtenerFE(auxiliar.hijoDerecho))+1;
      return auxiliar;
    
    }
    //rotacion doble a la izquierda
    public NodoArbolAVL rotacionDobleIzquierda(NodoArbolAVL c){
        NodoArbolAVL temporal;
        c.hijoIzquierdo=rotacionDerecha(c.hijoIzquierdo);
        temporal=rotacionIzquierda(c);
         return temporal;
    
    }
    //rotacion doble a la derecha
    public NodoArbolAVL rotacionDobleDerecha(NodoArbolAVL c){
        NodoArbolAVL temporal;
        c.hijoDerecho=rotacionIzquierda(c.hijoDerecho);
        temporal=rotacionDerecha(c);
         return temporal;
    
    }
      //--------------inserta segun su codigo----------------------------
    public void insertar(Alumno a){
        NodoArbolAVL nuevo=new NodoArbolAVL(a);
       
        if(raiz==null){
            raiz=nuevo;
        }else{
            raiz=insertarAVL(nuevo,raiz);
        }
        //hallar la cantidad de alumnos
        cant=0;
        cantAlumnos(raiz);
    }
    public NodoArbolAVL insertarAVL(NodoArbolAVL nuevo ,NodoArbolAVL subAr){
        
        NodoArbolAVL nuevoPadre=subAr;
        if(nuevo.alum.codigoAlumno<subAr.alum.codigoAlumno){
            if(subAr.hijoIzquierdo==null){
                subAr.hijoIzquierdo=nuevo;
            }else{
                subAr.hijoIzquierdo=insertarAVL( nuevo , subAr.hijoIzquierdo);
                if(obtenerFE(subAr.hijoIzquierdo)-obtenerFE(subAr.hijoDerecho)==2){
                    if(nuevo.alum.codigoAlumno<subAr.hijoIzquierdo.alum.codigoAlumno){
                        nuevoPadre=rotacionIzquierda(subAr);
                    }else{
                        nuevoPadre=rotacionDobleIzquierda(subAr);
                    }
                }
            
        }
        
        
    }else if(nuevo.alum.codigoAlumno>subAr.alum.codigoAlumno){
        if(subAr.hijoDerecho==null){
                subAr.hijoDerecho=nuevo;
            }else{
                subAr.hijoDerecho=insertarAVL( nuevo , subAr.hijoDerecho);
                if(obtenerFE(subAr.hijoDerecho)-obtenerFE(subAr.hijoIzquierdo)==2){
                    if(nuevo.alum.codigoAlumno>subAr.hijoDerecho.alum.codigoAlumno){
                        nuevoPadre=rotacionDerecha(subAr);
                    }else{
                        nuevoPadre=rotacionDobleDerecha(subAr);
                    }
                }
            
        }
    }else if (nuevo.alum.codigoAlumno==subAr.alum.codigoAlumno){
            System.out.println("Nodo Duplicado!");
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
  //-----------------------------------------------------------------------
   
    //-----------------------------------
     public void inOrden(NodoArbolAVL r){
         if(r!=null){
             inOrden(r.hijoIzquierdo);
             System.out.print(r.alum.codigoAlumno+",");
             inOrden(r.hijoDerecho);
         }
     }  
     public  void mostrarInOrden(NodoArbolAVL r){
          if(r!=null){
            mostrarInOrden(r.hijoIzquierdo);
            inOrden=inOrden+"\n| "+r.alum.codigoAlumno+"\t| "+r.alum.nombre
                    +"\t| "+r.alum.apellido;
            mostrarInOrden(r.hijoDerecho);
        }
    }
      private  void cantAlumnos(NodoArbolAVL r){
          if(r!=null){
            cantAlumnos(r.hijoIzquierdo);
            cant++;
            cantAlumnos(r.hijoDerecho);
        }
    }
     
     /*
     lista=lista+"\n| "+ rs.getString("codigoAlumno")+"\t| "+
                rs.getString("nombre")+"\t| "+
                rs.getString("apellido");
     */
}

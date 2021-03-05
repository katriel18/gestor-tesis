
package Conexion;

import Clases.Fecha;
import Clases.Persona;
import Clases.Tesis;
import EstructuraArbolAVL_Tesis.ArbolAVL_Tesis;
import EstructuraArbolAVL_Tesis.NodoArbolAVL_Tesis;
import EstructuraLista_Tesis.Lista_Tesis;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;


import javax.swing.JOptionPane;


public class MetodosConexionTesis {
    public static final String URL="jdbc:mysql://localhost:3306/gestordetesis?useSSL=false";
    public static final String USERNAME="root";
    public static final String PASSWORD="1234";
    
    static PreparedStatement ps;
    static ResultSet rs;
    
    
     public  static Connection getConection(){
        Connection c=null;
        try{
           
            Class.forName("com.mysql.jdbc.Driver");
           c= (Connection)DriverManager.getConnection(URL,USERNAME,PASSWORD);
          // JOptionPane.showMessageDialog(null, "conexcion existosa");
        }catch(Exception e){
          
            System.out.println("1 excepcion :"+e);
        }
        return c;
    }
     
//--------------------------------------------------------------------------------------
     //guardar todo el contenido del arbolAVL  a la base de datos
     //por el metodo de recursion
     //-----------------------------------------------------
      public static void  guardar(NodoArbolAVL_Tesis r){
         if(r!=null){
             guardar(r.hijoIzquierdo);
             guardarTodosTesisBaseDatos( r.tesis.codigoTesis,  r.tesis.titulo, 
                     r.tesis.autor.nombre,  r.tesis.autor.apellido,  r.tesis.descripcion,
            r.tesis.asesor.nombre, r.tesis.asesor.apellido,r.tesis.facultad,
            r.tesis.publicacion.dia,r.tesis.publicacion.mes,r.tesis.publicacion.año,
            r.tesis.tipoTesis,r.tesis.estado);
        
             guardar(r.hijoDerecho);
         }
     }

     private static void guardarTodosTesisBaseDatos(int cod,String tit,String nomAu,
             String apeAu,String des,String nomAs,String apeAs,String facu,
             int dia,int mes,int anio,String tipo,int est){
         
         try{
            Connection c;
            c=getConection();

            ps=c.prepareStatement("INSERT INTO tesis(codigoTesis,titulo,nombreAutor,"
                    + "apellidoAutor,descripcion,nombreAsesor,apellidoAsesor,"
                    + "facultad,diaPublicacion,mesPublicacion,anioPublicacion,"
                    + "tipoTesis,estado)VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)");

            
            ps.setInt(1,cod);
            ps.setString(2,tit);
            ps.setString(3, nomAu);
            ps.setString(4,apeAu);
             ps.setString(5, des);
             ps.setString(6,nomAs);
            ps.setString(7, apeAs);
            ps.setString(8,facu);
             ps.setInt(9, dia);
             ps.setInt(10,mes);
            ps.setInt(11, anio);
            ps.setString(12,tipo);
             ps.setInt(13, est);
            
            int  r=ps.executeUpdate();
         
         if(r<=0){
                JOptionPane.showMessageDialog(null,"Error en el guardado");
               
            }
            c.close();
        }catch(Exception e){
            System.out.println("2 excepcion :"+e);
        }
         
     }
     //---------------------------------------------------------------
     //extrae los datos de la base de datos a un arbolAVL ordenandolo y al 
     //finalizar la extraccion elimina los datos de la base de datos
     //------------------------------------------------------------------
     public static void  extraerDatosTesisBaseDatos(ArbolAVL_Tesis arbolA){
     
        try{
            Connection c;
            c=getConection();

            ps=c.prepareStatement("SELECT * FROM tesis");
            rs=ps.executeQuery();
        
                while (rs.next()) {
               Persona p1=new Persona(rs.getString("nombreAutor"),rs.getString("apellidoAutor"));
                Persona p2=new Persona(rs.getString("nombreAsesor"),rs.getString("apellidoAsesor"));
                Fecha f=new Fecha(rs.getInt("diaPublicacion"),
                 rs.getInt("mesPublicacion"),rs.getInt("anioPublicacion"));
                 Tesis t=new Tesis(rs.getInt("codigoTesis"),rs.getString("titulo"),p1,
                 rs.getString("descripcion"),p2,rs.getString("facultad"),f,
                 rs.getString("tipoTesis"),
                 rs.getInt("estado"));
               
                arbolA.insertar(t);
                
                
                }
                //este metodo va solo en el arbol y se pone despues del metodo de
                //extracion ala lista doble
                //eliminar datos del arbol despues de extraer para que no haya duplicados
                vaciarDatosTabla();
            c.close();
        }catch(Exception e){
             System.out.println("excepcion :"+e);
        }
        
     }
     //----------------------------------------------------------------------------------
     //extraer los datos ala lista doble y los elimina de la base de datos
     //-----------------------------------------------------------------
        public static void  extraerDatosTesisBaseDatosListaDoble(Lista_Tesis listaDoble2){
     
        try{
            Connection c;
            c=getConection();

            ps=c.prepareStatement("SELECT * FROM tesis");
            rs=ps.executeQuery();
        
                while (rs.next()) {
               Persona p1=new Persona(rs.getString("nombreAutor"),rs.getString("apellidoAutor"));
                Persona p2=new Persona(rs.getString("nombreAsesor"),rs.getString("apellidoAsesor"));
                Fecha f=new Fecha(rs.getInt("diaPublicacion"),
                 rs.getInt("mesPublicacion"),rs.getInt("anioPublicacion"));
                
           Tesis t=new Tesis(rs.getInt("codigoTesis"),rs.getString("titulo"),p1,
            rs.getString("descripcion"),p2,rs.getString("facultad"),f,
             rs.getString("tipoTesis"),
               rs.getInt("estado"));
               
                listaDoble2.insertarAlInicio(t);
                
                
                }
                vaciarDatosTabla();
            c.close();
        }catch(Exception e){
             System.out.println("excepcion :"+e);
        }
        
     }
        //--------------------------------------------------------------------------------------
     //guardar todo el contenido de la lista  a la base de datos
   
     //-----------------------------------------------------
      public static void  guardarTesisBaseDatosListaDoble(Lista_Tesis listaDoble2){
         while(listaDoble2.cabecera!=null){
           
             guardar( listaDoble2.cabecera.t.codigoTesis,listaDoble2.cabecera.t.titulo, 
                     listaDoble2.cabecera.t.autor.nombre,  listaDoble2.cabecera.t.autor.apellido,  listaDoble2.cabecera.t.descripcion,
            listaDoble2.cabecera.t.asesor.nombre, listaDoble2.cabecera.t.asesor.apellido,listaDoble2.cabecera.t.facultad,
            listaDoble2.cabecera.t.publicacion.dia,listaDoble2.cabecera.t.publicacion.mes,listaDoble2.cabecera.t.publicacion.año,
            listaDoble2.cabecera.t.tipoTesis,listaDoble2.cabecera.t.estado);
        
           listaDoble2.cabecera=listaDoble2.cabecera.sig;
         }
     }
        //---------------------------------------------------
        //-------guarda los datos de la lista doble a la base de datos---------
        //--------------------------------------------------------------
        private static void guardar(int cod,String tit,String nomAu,
             String apeAu,String des,String nomAs,String apeAs,String facu,
             int dia,int mes,int anio,String tipo,int est){
         
         
         try{
            Connection c;
            c=getConection();

            ps=c.prepareStatement("INSERT INTO tesis(codigoTesis,titulo,nombreAutor,"
                    + "apellidoAutor,descripcion,nombreAsesor,apellidoAsesor,"
                    + "facultad,diaPublicacion,mesPublicacion,anioPublicacion,"
                    + "tipoTesis,estado)VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)");

            
            ps.setInt(1,cod);
            ps.setString(2,tit);
            ps.setString(3, nomAu);
            ps.setString(4,apeAu);
             ps.setString(5, des);
             ps.setString(6,nomAs);
            ps.setString(7, apeAs);
            ps.setString(8,facu);
             ps.setInt(9, dia);
             ps.setInt(10,mes);
            ps.setInt(11, anio);
            ps.setString(12,tipo);
             ps.setInt(13, est);
            
            int  r=ps.executeUpdate();
         
         if(r<=0){
                JOptionPane.showMessageDialog(null,"Error en el guardado");
               
            }
            c.close();
        }catch(Exception e){
            System.out.println("2 excepcion :"+e);
        }
     }
        //------------------------------------------------------
        //metodo que elimina los datos de la base dedatos
        //------------------------------------------------------
    public static void vaciarDatosTabla(){
             
             //DROP TABLE IF EXISTS nombre_tabla
        try{
            Connection c;
            c=getConection();

            ps=c.prepareStatement("TRUNCATE TABLE  tesis");

            ps.executeUpdate();
          
            c.close();
        }catch(Exception e){
            System.out.println("2 excepcion :"+e);
        }

             
         }
    

      
}

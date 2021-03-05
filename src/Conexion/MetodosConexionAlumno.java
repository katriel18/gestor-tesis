
package Conexion;

import Clases.Alumno;
import EstructuraArbolAVL_Alumnos.ArbolAVL;
import EstructuraArbolAVL_Alumnos.NodoArbolAVL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
//import javax.swing.JOptionPane;

public class MetodosConexionAlumno {
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
     
     
  
     //------------guardar todo el contenido del arbol a la base de datos-------------
      public static void  guardar(NodoArbolAVL r){
         if(r!=null){
             guardar(r.hijoIzquierdo);
             guardarTodosAlumnosBaseDatos( r.alum.nombre,  r.alum.apellido, 
                     r.alum.codigoAlumno,  r.alum.facultad,  r.alum.anioIngreso,r.alum.actual);
        
             guardar(r.hijoDerecho);
         }
     }
     public static void guardarTodosAlumnosBaseDatos(String nom,String ape,int cod,String fac,int anio,int actual){
         
         try{
            Connection c;
            c=getConection();

            ps=c.prepareStatement("INSERT INTO alumno(nombre,apellido,codigoAlumno,facultad,anioIngreso,actual)VALUES(?,?,?,?,?,?)");

            
            ps.setString(1,nom);
            ps.setString(2,ape);
            ps.setInt(3, cod);
            ps.setString(4,fac);
             ps.setInt(5, anio);
            ps.setInt(6, actual);
            int  r=ps.executeUpdate();
       
         if(r<=0){
                JOptionPane.showMessageDialog(null,"Error en el registro");
               
            }
            c.close();
        }catch(Exception e){
            System.out.println("2 excepcion :"+e);
        }
         
     }
     //----------------------------------------------------------------------------
     //-------------------este codigo elimina los datos de la tabla despues de extrarlos----------
     public static String  extraerDatosAlumnoBaseDatos(ArbolAVL arbolA){
           
         //mostrar estudiantes(trae los datos de la base de datos)
        String lista="| CodAlumno\t| Nombre\t| Apellido";
        try{
            Connection c;
            c=getConection();

            ps=c.prepareStatement("SELECT * FROM alumno");
            rs=ps.executeQuery();
           // if(rs.next()){
                while (rs.next()) {
                    
                    
                /*lista=lista+"\n| "+ rs.getString("codigoAlumno")+"\t| "+
                rs.getString("nombre")+"\t| "+
                rs.getString("apellido");*/
                 Alumno alum=new Alumno(rs.getString("nombre"),rs.getString("apellido"),
                rs.getInt("codigoAlumno"),rs.getString("facultad"),
                 rs.getInt("anioIngreso"),rs.getInt("actual"));
               
                arbolA.insertar(alum);
                
                
                }
                //eliminar datos de la tabla despues de extraer para que no haya duplicados
                vaciarDatosTabla();
                
           
            c.close();
        }catch(Exception e){
             System.out.println("excepcion :"+e);
        }
        return lista;
     }
     
     //--------------------------------------------------------------------
    public static void vaciarDatosTabla(){
             
             //DROP TABLE IF EXISTS nombre_tabla
        try{
            Connection c;
            c=getConection();

            ps=c.prepareStatement("TRUNCATE TABLE  alumno");

            ps.executeUpdate();
          
            c.close();
        }catch(Exception e){
            System.out.println("2 excepcion :"+e);
        }

             
         }
    //---------------------esta opcion solo carga base de datos del alumno--------
    //----------------------sin eliminarla---------------
   public static void  cargarBaseDatosAlumnos(ArbolAVL arbolA){
           
        try{
            Connection c;
            c=getConection();

            ps=c.prepareStatement("SELECT * FROM alumno");
            rs=ps.executeQuery();
                while (rs.next()) {
                 Alumno alum=new Alumno(rs.getString("nombre"),rs.getString("apellido"),
                rs.getInt("codigoAlumno"),rs.getString("facultad"),
                 rs.getInt("anioIngreso"),rs.getInt("actual"));
               
                arbolA.insertar(alum);
                }
            c.close();
        }catch(Exception e){
             System.out.println("excepcion :"+e);
        }
       
     }
}

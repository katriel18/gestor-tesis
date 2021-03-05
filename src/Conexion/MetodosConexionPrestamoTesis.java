
package Conexion;


import Clases.Fecha;

import Clases.Prestamo;

import EstructuraLista_PrestamoTesis.Lista_Prestamo;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



import javax.swing.JOptionPane;


public class MetodosConexionPrestamoTesis {
    public static final String URL="jdbc:mysql://localhost:3306/gestordetesis?useSSL=false";
    public static final String USERNAME="root";
    public static final String PASSWORD="1234";
    
    static PreparedStatement ps;
    static ResultSet rs;
    
    
     private  static Connection getConection(){
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
     

  //----------------------------------------------------------------------------------
     //extraer los datos ala lista doble 
     //-----------------------------------------------------------------
        public static void  extraerDatosPrestamosBaseDatosLista(Lista_Prestamo lista){
     
        try{
            Connection c;
            c=getConection();

            ps=c.prepareStatement("SELECT * FROM prestamotesis");
            rs=ps.executeQuery();
        
                while (rs.next()) {
                    Fecha f=new Fecha(rs.getInt("diaPrestamo"),
                 rs.getInt("mesPrestamo"),rs.getInt("anioPrestamo"));
               Prestamo p=new Prestamo(rs.getInt("codigoAlumno"),rs.getInt("codigoTesis"),rs.getString("titulo"),f);
               
          
               
                lista.insertarAlInicio(p);
                
                
                }
              // vaciarDatosTabla();
            c.close();
        }catch(Exception e){
             System.out.println("excepcion :"+e);
        }
        
     }
        //--------------------------------------------------------------------------------------
     //guardar todo el contenido de la lista  a la base de datos
   
     //-----------------------------------------------------
      public static void  guardarPestamosBaseDatosLista(Lista_Prestamo lista){
         while(lista.cabecera!=null){
           
             guardar(lista.cabecera.p.codigoAlumno,
                     lista.cabecera.p.codigoTesis,lista.cabecera.p.titulo,
                     lista.cabecera.p.fechaPrestamo.dia,
                     lista.cabecera.p.fechaPrestamo.mes,
                     lista.cabecera.p.fechaPrestamo.año);
        
           lista.cabecera=lista.cabecera.sig;
         }
     }
        //---------------------------------------------------
        //-------guarda los datos de la lista doble a la base de datos---------
        //--------------------------------------------------------------
    
        private static void guardar(int codAlumno,int codTesis,String titulo,
             int diaP,int mesP,int anioP){
         
         
         try{
            Connection c;
            c=getConection();

            ps=c.prepareStatement("INSERT INTO prestamotesis(codigoAlumno,codigoTesis,titulo,"
                    + "diaPrestamo,mesPrestamo,anioPrestamo)VALUES(?,?,?,?,?,?)");

            
            ps.setInt(1,codAlumno);
            ps.setInt(2,codTesis);
            ps.setString(3, titulo);
          
             ps.setInt(4, diaP);
             ps.setInt(5,mesP);
            ps.setInt(6, anioP);
           
            
            int  r=ps.executeUpdate();
         
         if(r<=0){
                JOptionPane.showMessageDialog(null,"Error en el guardado");
               
            }
         
            c.close();
        }catch(Exception e){
            System.out.println("2 excepcion :"+e);
        }
     }
    private static void vaciarDatosTabla(){
             
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
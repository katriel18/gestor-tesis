
package Clases;

public class Prestamo {
    
    public int codigoAlumno;
    public int codigoTesis;
    public String titulo;
    public Fecha fechaPrestamo;
    public Prestamo() {
    }

    public Prestamo(int codigoAlumno, int codigoTesis, String titulo, Fecha fechaPrestamo) {
      
        this.codigoAlumno = codigoAlumno;
        this.codigoTesis = codigoTesis;
        this.titulo = titulo;
        this.fechaPrestamo = fechaPrestamo;
    }

   
  
    

    public int getCodigoAlumno() {
        return codigoAlumno;
    }

    public void setCodigoAlumno(int codigoAlumno) {
        this.codigoAlumno = codigoAlumno;
    }

    public int getCodigoTesis() {
        return codigoTesis;
    }

    public void setCodigoTesis(int codigoTesis) {
        this.codigoTesis = codigoTesis;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Fecha getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(Fecha fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }
    
}

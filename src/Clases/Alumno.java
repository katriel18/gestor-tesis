
package Clases;

public class Alumno extends Persona {
    public int codigoAlumno;
    public String facultad;
    public int anioIngreso;
    
    public int actual;//si es 1 es que esta seleccionado 
    public Alumno() {
    }
    //se crea un alumno de cero
    public Alumno(String nombre, String apellido,int codigoAlumno, String facultad, int anioIngreso ) {
        super(nombre, apellido);
        this.codigoAlumno = codigoAlumno;
        this.facultad = facultad;
        this.anioIngreso = anioIngreso;
        this.actual = 0;
    }

    public Alumno( String nombre, String apellido,int codigoAlumno, String facultad, int anioIngreso, int actual) {
        super(nombre, apellido);
        this.codigoAlumno = codigoAlumno;
        this.facultad = facultad;
        this.anioIngreso = anioIngreso;
        this.actual = actual;
    }

    public int getCodigoAlumno() {
        return codigoAlumno;
    }

    public void setCodigoAlumno(int codigoAlumno) {
        this.codigoAlumno = codigoAlumno;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public int getanioIngreso() {
        return anioIngreso;
    }

    public void setanioIngreso(int anioIngreso) {
        this.anioIngreso = anioIngreso;
    }

    public int getActual() {
        return actual;
    }

    public void setActual(int actual) {
        this.actual = actual;
    }

}
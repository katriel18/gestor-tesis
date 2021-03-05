
package Clases;

public class Tesis {
    public int codigoTesis;
    public String titulo;
    public Persona autor;
    public String descripcion;
    public Persona asesor;
    public String facultad;
    public Fecha publicacion;    // 8/11/2018
    public String tipoTesis;
    
    public int estado;
    public int  cont;

    
    public Tesis() {
    }

    public Tesis(int codigoTesis, String titulo, Persona autor, String descripcion, Persona asesor, String facultad, Fecha publicacion, String tipoTesis) {
        this.codigoTesis = codigoTesis;
        this.titulo = titulo;
        this.autor = autor;
        this.descripcion = descripcion;
        this.asesor = asesor;
        this.facultad = facultad;
        this.publicacion = publicacion;
        this.tipoTesis = tipoTesis;
        this.estado = 1;
        this.cont =0;
    }

    public Tesis(int codigoTesis, String titulo, Persona autor, String descripcion, Persona asesor, String facultad, Fecha publicacion, String tipoTesis, int estado) {
        this.codigoTesis = codigoTesis;
        this.titulo = titulo;
        this.autor = autor;
        this.descripcion = descripcion;
        this.asesor = asesor;
        this.facultad = facultad;
        this.publicacion = publicacion;
        this.tipoTesis = tipoTesis;
        this.estado = estado;
    }
//constructor para modificar el estado de la tesis
 
    public Tesis(int codigoTesis, int estado) {
        this.codigoTesis = codigoTesis;
        this.estado = estado;
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

    public Persona getAutor() {
        return autor;
    }

    public void setAutor(Persona autor) {
        this.autor = autor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Persona getAsesor() {
        return asesor;
    }

    public void setAsesor(Persona asesor) {
        this.asesor = asesor;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public Fecha getfPublicacion() {
        return publicacion;
    }

    public void setfPublicacion(Fecha fPublicacion) {
        this.publicacion = fPublicacion;
    }

    public String getTipoTesis() {
        return tipoTesis;
    }

    public void setTipoTesis(String tipoTesis) {
        this.tipoTesis = tipoTesis;
    }

    public int isEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

  
    
  
   
}

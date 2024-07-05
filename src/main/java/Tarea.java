import java.util.Date;
import java.util.Scanner;

public class Tarea {
    String titulo;
    String descripcion;
    Date fechaDeVencimiento;
    String estado; //pendiente, en progreso, completada

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaDeVencimiento() {
        return fechaDeVencimiento;
    }

    public void setFechaDeVencimiento(Date fechaDeVencimiento) {
        this.fechaDeVencimiento = fechaDeVencimiento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Tarea() {
    }

    public Tarea(String titulo, String descripcion, Date fechaDeVencimiento, String estado) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaDeVencimiento = fechaDeVencimiento;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Tarea{" +
                "titulo='" + titulo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", fechaDeVencimiento=" + fechaDeVencimiento +
                ", estado='" + estado + '\'' +
                '}';
    }
}

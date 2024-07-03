public class Tarea {
    String titulo;
    String descripcion;
    int fechaDeVencimiento;
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

    public int getFechaDeVencimiento() {
        return fechaDeVencimiento;
    }

    public void setFechaDeVencimiento(int fechaDeVencimiento) {
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

    public Tarea(String titulo, String descripcion, int fechaDeVencimiento, String estado) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaDeVencimiento = fechaDeVencimiento;
        this.estado = estado;
    }
}

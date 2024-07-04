import java.util.ArrayList;
import java.util.List;

public class Categoria {

    List<Tarea> tareas;
    String nombre;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Tarea> getTareas() {
        return tareas;
    }

    public void setTareas(List<Tarea> tareas) {
        this.tareas = tareas;
    }

    public Categoria(){};

    public Categoria(String nombre) {
        this.nombre = nombre;
        this.tareas = new ArrayList<Tarea>();
    }
}
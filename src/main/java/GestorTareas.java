import java.util.ArrayList;
import java.util.List;

public class GestorTareas {

    List<Tarea> tareas;

    public GestorTareas() {
        tareas = new ArrayList<>();
    }

    public void agregarUnaNuevaTarea(Tarea tarea) {
        tareas.add(tarea);
        System.out.println("Se ha agregado correctamente la tarea");
        //System.out.println(tareas);
    }

    public void eliminarUnaTareaExistente(String titulo) {
        if(tareas.removeIf(t -> t.getTitulo().equals(titulo)))
            System.out.println("Se ha eliminado correctamente la tarea");
        //System.out.println(tareas);
    }

    public Tarea buscarUnaTareaPorTitulo(String titulo) {
        for (Tarea tarea : tareas) {
            if (tarea.getTitulo().equals(titulo)) {
                //System.out.println(tarea);
                return tarea;
            }
        }
        return null;
    }

    public void cambiarElEstadoDeUnaTarea(String tituloTarea, String estado) {
        //buscarUnaTareaPorTitulo(tituloTarea).setEstado(estado);
        for (Tarea tarea : tareas) {
            if (tarea.getTitulo().equals(tituloTarea)) {
                tarea.setEstado(estado);
            }
        }
    }
}






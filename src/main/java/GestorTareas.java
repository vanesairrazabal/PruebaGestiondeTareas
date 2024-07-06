import java.util.ArrayList;
import java.util.List;

public class GestorTareas {

    List<Tarea> tareas;

    public GestorTareas() {
        tareas = new ArrayList<>();
    }

    public boolean agregarUnaNuevaTarea(Tarea tarea) {
        if(buscarUnaTareaPorTitulo(tarea.getTitulo()) == null){
            tareas.add(tarea);
            System.out.println("Se ha agregado correctamente la tarea");
            return true;
        }else{
            System.out.println("Ya existe la tarea");
            return false;
        }
    }

    public boolean eliminarUnaTareaExistente(String titulo) {
        if(tareas.removeIf(t -> t.getTitulo().equals(titulo)))
            System.out.println("Se ha eliminado correctamente la tarea");
        return false;
    }

    public Tarea buscarUnaTareaPorTitulo(String titulo) {
        for (Tarea tarea : tareas) {
            if (tarea.getTitulo().equals(titulo)) {
                return tarea;
            }
        }
        return null;
    }

    public boolean cambiarElEstadoDeUnaTarea(String tituloTarea, String estado) {
        //buscarUnaTareaPorTitulo(tituloTarea).setEstado(estado);
        for (Tarea tarea : tareas) {
            if (tarea.getTitulo().equals(tituloTarea)) {
                tarea.setEstado(estado);
                return true;
            }
        }
        return false;
    }
}






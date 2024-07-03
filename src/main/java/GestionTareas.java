import java.util.ArrayList;
import java.util.List;

public class GestionTareas {

    List<Tarea> tareas;

    public void GestiondeTareas(){
        tareas = new ArrayList<>();
    }

    public void agregarUnaNuevaTarea(Tarea tarea){
        tareas.add(tarea);
    }

    public void eliminarUnaTareaExistente(String titulo){
        tareas.removeIf(t -> t.getTitulo().equals(titulo));
    }
    public Tarea buscarUnaTareaPorTitulo(String titulo){
        for (Tarea tarea : tareas) {
            if (tarea.getTitulo().equals(titulo)){
                return tarea;
            }
        }
        
        return null;
    }
    public void cambiarElEstadoDeUnaTarea(){

    }



}

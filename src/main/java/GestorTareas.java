import java.util.ArrayList;
import java.util.List;

public class GestorTareas {

    List<Tarea> tareas;

    public GestorTareas() {
        tareas = new ArrayList<>();
    }

    public void agregarUnaNuevaTarea(Tarea tarea) {
        tareas.add(tarea);
    }

    public void eliminarUnaTareaExistente(String titulo) {
        tareas.removeIf(t -> t.getTitulo().equals(titulo));
    }

    public Tarea buscarUnaTareaPorTitulo(String titulo) {
        for (Tarea tarea : tareas) {
            if (tarea.getTitulo().equals(titulo)) {
                System.out.println(tarea);
                return tarea;
            }
        }

        return null;
    }

    public void cambiarElEstadoDeUnaTarea(String tituloTarea, String estado) {
        /*Tarea tareaEncontrada = buscarUnaTareaPorTitulo(tituloTarea);
        tareaEncontrada.setEstado(estado);*/
        buscarUnaTareaPorTitulo(tituloTarea).setEstado(estado);
    }
}






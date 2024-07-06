import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GestorTareasTest {
    GestorTareas gestorTareas = new GestorTareas();
    String tituloTarea = "caminar";
    Tarea tarea = new Tarea(tituloTarea);
    String estado = "pendiente";
    @BeforeEach
    void setUp() {
        gestorTareas = new GestorTareas();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void agregarUnaNuevaTarea() {
        assertTrue(gestorTareas.agregarUnaNuevaTarea(tarea));
        assertFalse(gestorTareas.agregarUnaNuevaTarea(tarea));
    }

    @Test
    void eliminarUnaTareaExistente() {
        assertFalse(gestorTareas.eliminarUnaTareaExistente(tituloTarea));
    }

    @Test
    void buscarUnaTareaPorTitulo() {
        agregarUnaNuevaTarea();
        assertTrue(gestorTareas.buscarUnaTareaPorTitulo(tituloTarea) != null);
        assertTrue(gestorTareas.buscarUnaTareaPorTitulo("hjhgvhgv") == null);
    }

    @Test
    void cambiarElEstadoDeUnaTarea() {
        gestorTareas.agregarUnaNuevaTarea(tarea);
        assertTrue(gestorTareas.cambiarElEstadoDeUnaTarea(tituloTarea, estado));
        assertFalse(gestorTareas.cambiarElEstadoDeUnaTarea("ihdijojook", estado));
    }
}
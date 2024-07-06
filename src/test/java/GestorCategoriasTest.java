import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

class GestorCategoriasTest {

    GestorCategorias gestorCategorias = new GestorCategorias();
    GestorTareas gestorTareas = new GestorTareas();
    String nombreCategoria = "Prueba";
    String tituloTarea ="Caminar";
    Categoria categoria = new Categoria(nombreCategoria);
    Tarea tarea = new Tarea(tituloTarea);

    @BeforeEach
    void setUp() {
        gestorCategorias = new GestorCategorias();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void agregarCategoriaTest() {
        assertTrue(gestorCategorias.agregarCategoria(categoria));
        assertFalse(gestorCategorias.agregarCategoria(categoria));
    }

    @Test
    void buscarCategoriaPorNombre() {
        agregarCategoriaTest();
        System.out.println(gestorCategorias.mostrarCategorias());
        assertTrue(gestorCategorias.buscarCategoriaPorNombre(nombreCategoria) != null);
        assertTrue(gestorCategorias.buscarCategoriaPorNombre("fallo") == null);
    }

    @Test
    void asignarTareaACategoria() {
        gestorTareas.agregarUnaNuevaTarea(tarea);
        gestorCategorias.agregarCategoria(categoria);
        assertTrue(gestorCategorias.asignarTareaACategoria(tituloTarea, nombreCategoria, gestorTareas));
        assertFalse(gestorCategorias.asignarTareaACategoria("Xyz", "abc", gestorTareas));
    }
}
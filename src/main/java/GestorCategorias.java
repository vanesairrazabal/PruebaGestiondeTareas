import java.util.ArrayList;
import java.util.List;

public class GestorCategorias {

    List<Categoria> categorias;

    public GestorCategorias() {
        categorias = new ArrayList<>();
    }

    public boolean agregarCategoria(Categoria categoria) {
        if(buscarCategoriaPorNombre(categoria.getNombre()) == null) {
            categorias.add(categoria);
            System.out.println("Se ha agregado correctamente la categoria");
            return true;
        }else {
            System.out.println("La categoria ya existe");
            return false;
        }

    }

    public Categoria buscarCategoriaPorNombre(String nombre) {
        for (Categoria categoria : categorias) {
            if (categoria.getNombre().equals(nombre)) {
                return categoria;
            }
        }
        return null;
    }

    public boolean asignarTareaACategoria(String titulo, String nombre, GestorTareas gestorTareas) {
        Tarea tareaEncontrada = gestorTareas.buscarUnaTareaPorTitulo(titulo);
        Categoria categoriaEncontrada = buscarCategoriaPorNombre(nombre);
        System.out.println();

        if (tareaEncontrada == null) {
            System.out.println("La tarea no existe");
            return false;
        }

        if(categoriaEncontrada == null) {
            System.out.println("La categoría no existe");
            return false;
        }

        if(categoriaEncontrada.getTareas().stream().noneMatch(t -> t.getTitulo().equals(titulo))) {
            categoriaEncontrada.getTareas().add(tareaEncontrada);
            System.out.println("Se ha completado con éxito la asignación");
            return true;
        }
        else {
            System.out.println("La tarea ya se encuentra asignada a esta categoría");
            return false;
        }
    }

    public List<Categoria> mostrarCategorias() {
        return this.categorias;
    }
}

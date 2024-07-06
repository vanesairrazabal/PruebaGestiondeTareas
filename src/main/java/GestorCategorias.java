import java.util.ArrayList;
import java.util.List;

public class GestorCategorias {

    List<Categoria> categorias;

    public GestorCategorias() {
        categorias = new ArrayList<>();
    }

    public void agregarCategoria(Categoria categoria) {
        categorias.add(categoria);
        System.out.println("Se ha agregado correctamente la categoria");
        //System.out.println(categorias);
    }

    public Categoria buscarCategoriaPorNombre(String nombre) {
        for (Categoria categoria : categorias) {
            if (categoria.getNombre().equals(nombre)) {
                //System.out.println(categoria);
                return categoria;
            }
        }
        return null;
    }

    public void asignarTareaACategoria(String titulo, String nombre, GestorTareas gestorTareas) {
        Tarea tareaEncontrada = gestorTareas.buscarUnaTareaPorTitulo(titulo);
        Categoria categoriaEncontrada = buscarCategoriaPorNombre(nombre);
        System.out.println();

        if (tareaEncontrada == null) {
            System.out.println("La tarea no existe");
            return;
        }

        if(categoriaEncontrada == null) {
            System.out.println("La categoría no existe");
            return;
        }

        if(categoriaEncontrada.getTareas().stream().noneMatch(t -> t.getTitulo().equals(titulo))) {
            categoriaEncontrada.getTareas().add(tareaEncontrada);
            System.out.println("Se ha completado con éxito la asignación");
        }
        else {
            System.out.println("La tarea ya se encuentra asignada a esta categoría");
        }
    }
}

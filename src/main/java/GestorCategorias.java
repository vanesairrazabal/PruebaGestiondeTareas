import java.util.ArrayList;
import java.util.List;

public class GestorCategorias {

    List<Categoria> categorias;

    public GestorCategorias() {

        categorias = new ArrayList<>();
    }

    public void agregarCategoria(Categoria categoria) {
        categorias.add(categoria);
        System.out.println("Se ha agregado correctamente");
    }

    public Categoria buscarCategoriaPorNombre(String nombre) {
        for (Categoria categoria : categorias) {
            if (categoria.getNombre().equals(nombre)) {
                System.out.println(categoria);
                return categoria;
            }
        }
        return null;
    }

    public void asignarTareaACategoria(String titulo, String nombre) {
        GestorTareas gestorTareas = new GestorTareas();
        Tarea tareaEncontrada = gestorTareas.buscarUnaTareaPorTitulo(titulo); // puede ser null
        Categoria categoriaEncontrada = buscarCategoriaPorNombre(nombre); // puede ser null
        System.out.println();

        if (tareaEncontrada != null)
            System.out.println("La tarea no existe");

        if(categoriaEncontrada != null)
            System.out.println("La categoria no existe");

        if(categoriaEncontrada.getTareas().stream().noneMatch(t -> t.getTitulo().equals(titulo))) {
            categoriaEncontrada.getTareas().add(tareaEncontrada);
            System.out.println("Se ha completado con exito la asignacion");
        } else {
            System.out.println("La tarea ya se encuentra asignada a esta categoria");
        }
    }
}

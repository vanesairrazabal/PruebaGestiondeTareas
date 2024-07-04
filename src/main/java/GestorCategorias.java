import java.util.List;

public class GestorCategorias {

    List<Categoria> categorias;

    public void agregarCategoria(Categoria categoria) {
        categorias.add(categoria);
    }

    public Categoria buscarCategoriaPorNombre(String nombre) {
        for (Categoria categoria : categorias) {
            if (categoria.getNombre().equals(nombre)) {
                return categoria;
            }
        }
        return null;
    }

    public void asignarTareaACategoria(String titulo, String nombre){
        GestorTareas gestorTareas = new GestorTareas();
        Tarea tareaEncontrada = gestorTareas.buscarUnaTareaPorTitulo(titulo);
        Categoria categoriaEncontrada = buscarCategoriaPorNombre(nombre);

        if(categoriaEncontrada.getTareas().stream().noneMatch(t -> t.getTitulo().equals(titulo))) {
            categoriaEncontrada.getTareas().add(tareaEncontrada);
        }
    }
}

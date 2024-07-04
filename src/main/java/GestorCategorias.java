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
}

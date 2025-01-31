import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    static GestorTareas gestorTareas = new GestorTareas();
    static GestorCategorias gestorCategorias = new GestorCategorias();
    static Scanner scanner = new Scanner(System.in);

    public static void mostrarMenu() {
        System.out.println("1- Agregar una nueva tarea");
        System.out.println("2- Eliminar una tarea");
        System.out.println("3- Buscar tarea");
        System.out.println("4- Cambiar estado de tarea");
        System.out.println("5- Buscar una categoria");
        System.out.println("6- Agregar una categoria");
        System.out.println("7- Asignar una tarea a categoria");
        System.out.println("8- Obtener todas las tareas de una categoria");
        System.out.println("0- Salir");
        System.out.println("----------------");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("BIENVENIDO A GESTION DE TAREAS");
        System.out.println("Ingrese la gestion a realizar");
        int opcionUsuario = -2;


        while (opcionUsuario != -1) {
            mostrarMenu();
            opcionUsuario = scanner.nextInt();
            switch (opcionUsuario) {
                case 1:
                    gestorTareas.agregarUnaNuevaTarea(crearTarea());
                    break;
                case 2:
                    gestorTareas.eliminarUnaTareaExistente(pedirTituloTarea());
                    break;
                case 3:
                    System.out.println(gestorTareas.buscarUnaTareaPorTitulo(pedirTituloTarea()).toString());
                    break;
                case 4:
                    gestorTareas.cambiarElEstadoDeUnaTarea(pedirTituloTarea(), pedirEstadoTarea());
                    break;
                case 5:
                    System.out.println(gestorCategorias.buscarCategoriaPorNombre(pedirNombreCategoria()).toString());
                    break;
                case 6:
                    gestorCategorias.agregarCategoria(crearCategoria());
                    break;
                case 7:
                    gestorCategorias.asignarTareaACategoria(pedirTituloTarea(), pedirNombreCategoria(), gestorTareas);
                    break;
                case 8:
                    System.out.println(gestorCategorias.buscarCategoriaPorNombre(pedirNombreCategoria()).getTareas().toString());
                    break;
                case 0:
                    System.out.println("ADIOS");
                    break;
            }
        }
    }

    public static Tarea crearTarea() {
        System.out.println("INGRESE EL TITULO");
        String titulo = scanner.next();
        System.out.println("INGRESE LA DESCRIPCION");
        String descripcion = scanner.next();
        System.out.println("INGRESE LA FECHA DE VENCIMIENTO (DD/MM/AAAA)");
        String fechaTexto = scanner.next();
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaDeVencimiento = format.parse(fechaTexto, new ParsePosition(0));
        System.out.println("INGRESE EL ESTADO EN EL QUE SE ENCUENTRA LA TAREA (1-Pendiente, 2-En Proceso, 3-Completada)");
        int estado = scanner.nextInt();
        return new Tarea(titulo, descripcion, fechaDeVencimiento, estado == 1 ? "Pendiente" : estado == 2 ? "En Proceso" : "Completada");
    }

    public static Categoria crearCategoria() {
        System.out.println("INGRESE EL NOMBRE DE LA CATEGORIA");
        String nombre = scanner.next();
        return new Categoria(nombre);
    }

    public static String pedirTituloTarea() {
        System.out.println("INGRESE EL TITULO");
        return scanner.next();
    }

    public static String pedirNombreCategoria() {
        System.out.println("INGRESE EL NOMBRE DE LA CATEGORIA");
        return scanner.next();
    }

    public static String pedirEstadoTarea() {
        System.out.println("INGRESE EL ESTADO EN EL QUE SE ENCUENTRA LA TAREA (1-Pendiente, 2-En Proceso, 3-Completada)");
        int estado = scanner.nextInt();
        return estado == 1 ? "Pendiente" : estado == 2 ? "En Proceso" : "Completada";
    }
}

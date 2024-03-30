import java.sql.Array;
import java.util.ArrayList;

public class ArbolHabilidadesSecuencial <T>{

    private T[] tree;


    public ArbolHabilidadesSecuencial(T raiz, int size) {

    }

    // Método para agregar habilidades en el árbol. Este es un ejemplo básico y debe ser expandido.
    // Aquí deberías implementar la lógica para encontrar al padre y agregar las habilidades hijas.
    // Padre de i: (i div 2) (excepto para i=1)
    // Hijo izquierdo de i: 2*
    // Hijo derecho de i: (2*i) + 1
    public void agregarHabilidad(T padre, T habilidadIzquierda, T habilidadDerecha) {

    }

    // Método para buscar una habilidad por nombre.
    public T buscarHabilidad(String nombre) {
        return null; // Modificar para retornar la habilidad encontrada.
    }

    // Método para visualizar el árbol de habilidades.
    public void imprimirArbol() {
        // Implementar un método para imprimir el árbol, mostrando la estructura y niveles de habilidad.
    }

}

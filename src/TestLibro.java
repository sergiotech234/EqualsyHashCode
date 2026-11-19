
import java.util.HashSet;
import java.util.HashMap;

public class TestLibro {

    public static void main(String[] args) {

        // Creamos dos libros con los mismos datos.
        Libro libro1 = new Libro("El lazarillo de tormes", "Anonimo", 1605);
        Libro libro2 = new Libro("El lazarillo de tormes", "Anonimo", 1605);

        // COMPARACIÓN == Y equals()

        // == compara si son el mismo objeto en memoria.
        // Devuelve false porque son dos objetos diferentes.
        System.out.println("Comparación con ==: " + (libro1 == libro2));

        // equals() compara el contenido de los objetos.
        // Devuelve true porque tienen los mismos atributos.
        System.out.println("Comparación con equals(): " + libro1.equals(libro2));


        // COMPROBACIONES DE EQUALS()

        // Un objeto no puede ser igual a null.
        System.out.println("equals(null): " + libro1.equals(null));

        // Un libro no es igual a un String.
        System.out.println("equals(String): " + libro1.equals("Don Quijote"));

        // Un objeto siempre es igual a sí mismo.
        System.out.println("equals consigo mismo: " + libro1.equals(libro1));
    }
}

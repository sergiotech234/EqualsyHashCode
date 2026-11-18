
import java.util.HashSet;
import java.util.HashMap;

public class TestLibro {

    public static void main(String[] args) {

        // Creamos dos libros con los mismos datos.
        Libro libro1 = new Libro("Don Quijote", "Cervantes", 1605);
        Libro libro2 = new Libro("Don Quijote", "Cervantes", 1605);

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


        // HASHSET

        // HashSet no permite elementos duplicados.
        HashSet<Libro> conjunto = new HashSet<>();

        conjunto.add(libro1);
        conjunto.add(libro2);

        // El resultado debe ser 1 porque los libros son iguales.
        System.out.println("Tamaño del HashSet: " + conjunto.size());


        // HASHMAP

        // El valor Integer representa los ejemplares disponibles.
        HashMap<Libro, Integer> mapa = new HashMap<>();

        // Guardamos el libro1 con 10 ejemplares disponibles.
        mapa.put(libro1, 10);

        // Recuperamos el valor utilizando libro2.
        // Devuelve 10 porque libro1 y libro2 son iguales.
        System.out.println("Ejemplares disponibles: " + mapa.get(libro2));


        // PRUEBA SIN HASHCODE()

        /*
         * Si comentamos o eliminamos el método hashCode()
         * de la clase Libro, Java utilizará el hashCode()
         * heredado de Object.
         *
         * Aunque equals() indique que los libros son iguales,
         * pueden tener códigos hash diferentes.
         *
         * Por tanto, normalmente:
         *
         * HashSet tendrá tamaño 2.
         * HashMap devolverá null al buscar libro2.
         *
         * Esto demuestra que debemos sobrescribir equals()
         * y hashCode() conjuntamente.
         */
    }
}

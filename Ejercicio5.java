class Libro {
    String titulo;
    String autor;
    boolean disponible;

    Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true;
    }
}

class Socio {
    String nombre;
    int librosPrestados;

    Socio(String nombre) {
        this.nombre = nombre;
        this.librosPrestados = 0;
    }
}

public class Ejercicio5 {
    public static void main(String[] args) {
        Libro[] libros = {
            new Libro("Cien anos de soledad", "Gabriel Garcia Marquez"),
            new Libro("Don Quijote", "Miguel de Cervantes"),
            new Libro("El principito", "Antoine de Saint-Exupery"),
            new Libro("1984", "George Orwell")
        };
        Socio[] socios = { new Socio("Juan"), new Socio("Maria") };

        // El primer socio presta 2 libros
        libros[0].disponible = false;
        socios[0].librosPrestados++;
        libros[1].disponible = false;
        socios[0].librosPrestados++;

        // El segundo socio presta 1 libro
        libros[2].disponible = false;
        socios[1].librosPrestados++;

        int disponibles = 0;
        for (Libro l : libros) {
            System.out.println(l.titulo + " : " + (l.disponible ? "Disponible" : "Prestado"));
            if (l.disponible) disponibles++;
        }
        for (Socio s : socios) {
            System.out.println(s.nombre + " : " + s.librosPrestados);
        }
        System.out.println("Libros disponibles: " + disponibles);
    }
}
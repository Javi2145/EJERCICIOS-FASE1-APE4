class Mascota {
    String nombre;
    String especie;
    int edad;
    double peso;

    Mascota(String nombre, String especie, int edad, double peso) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.peso = peso;
    }
}

public class Ejercicio3 {
    public static void main(String[] args) {
        Mascota m1 = new Mascota("Firulais", "Perro", 3, 25.0);
        Mascota m2 = new Mascota("Michi", "Gato", 2, 4.5);
        Mascota m3 = new Mascota("Rocky", "Perro", 5, 18.0);

        Mascota[] mascotas = {m1, m2, m3};
        for (Mascota m : mascotas) {
            String aviso = (m.peso > 20) ? " Revisar peso" : "";
            System.out.println(m.nombre + " : " + m.especie + " : " + m.peso + aviso);
        }

        Mascota m4 = m1;
        m4.edad += 1;
        System.out.println("m1.edad = " + m1.edad);

    
    }
}
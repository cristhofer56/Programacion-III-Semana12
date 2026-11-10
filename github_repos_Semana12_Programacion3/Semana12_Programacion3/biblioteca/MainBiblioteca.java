public class MainBiblioteca {
    public static void main(String[] args) {
        Material[] fondo = { new Libro("Java Basico"), new Revista("Byte"), new EBook("POO Moderna"), new Mapa("El Salvador") };
        System.out.println("--- Catalogo ---");
        for (Material m : fondo) { System.out.println(m.describir() + " - " + m.diasPrestamo() + " dias"); }
    }
}
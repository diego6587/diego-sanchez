public class Ejercicio3 {
    public static void main(String[] args) {
        // Arreglo de palabras en inglés y español
        String[][] palabras = {
            {"computer", "ordenador"},
            {"student", "alumno/a"},
            {"cat", "gato"},
            {"penguin", "pingüino"},
            {"machine", "máquina"},
            {"nature", "naturaleza"},
            {"light", "luz"},
            {"green", "verde"},
            {"book", "libro"},
            {"pyramid", "pirámide"}
        };

        // Imprimir cabecera
        System.out.printf("%-10s %-15s\n", "Inglés", "Español");
        System.out.println("------------------------------");

        // Imprimir palabras alineadas
        for (int i = 0; i < palabras.length; i++) {
            System.out.printf("%-10s %-15s\n", palabras[i][0], palabras[i][1]);
        }
    }
}
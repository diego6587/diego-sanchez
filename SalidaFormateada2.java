public class SalidaFormateada2 {
    public static void main(String[] args) {
        System.out.println("Articulo\tPrecio\tN° Cajas");
        System.out.println("--------\t------\t--------");
        System.out.printf("%-10s\t%8.2f\t%6d\n", "manzana",4.5,10);
        System.out.printf("%-10s\t%8.2f\t%6d\n", "platano",2.5,10);
        System.out.printf("%-10s\t%8.2f\t%6d\n", "uva",5.5,10);
        System.out.printf("%-10s\t%8.2f\t%6d\n", "naranja",3.5,10);
        System.out.printf("%-10s\t%8.2f\t%6d\n", "mandarina",6.5,10);
        System.out.printf("%-10s\t%8.2f\t%6d\n", "papaya",4.7,10);
    }
        
}
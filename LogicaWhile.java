import java.util.Scanner;

public class LogicaWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int suma = 0;

        System.out.print("Ingrese el numero que desea calcular: ");
        int numeroASumar = scanner.nextInt();

        while (numeroASumar >= i) {
            System.out.println("El valor de i es: " + i);
            suma += i; 
            i++;
        }

        System.out.println("La suma de los primeros "+ numeroASumar + " es: " + suma);

        scanner.close(); 
    }
}

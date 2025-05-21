import java.util.Scanner;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String x = JOptionPane.showInputDialog("Dame el primer numero");
        String y = JOptionPane.showInputDialog("Dame el segundo numero");
        String z = JOptionPane.showInputDialog("Dame el tercer numero");

        int numero1 = Integer.parseInt(x);
        int numero2 = Integer.parseInt(y);
        int numero3 = Integer.parseInt(z);
        int suma = numero1 + numero2 + numero3;
        double promedio = suma / 3;
        
        System.out.println("La suma de " + numero1 + " y " + numero2 + " y " + numero3 + " es " + suma);
        System.out.println(" El promedio de los 3 numeros es :" + promedio);
    }
}

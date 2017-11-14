package ua.com.prologistic;
import java.util.Scanner;

public class AreaTriangleDemo {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введите объём топливного бака V = ");
        double V = scanner.nextDouble();
        
         // Расчет МТ
         double MT = (V* 0.7* 0.9);
         System.out.println("Масса топлива равна MT = " + MT);
         
         System.out.print("Введите массу М = ");
         double M = scanner.nextDouble();
        
         // Расчет CM
         double CM = (M + MT + 75);
         System.out.println("CM = " + CM);
         
         System.out.print("Введите PMM = ");
         double PMM = scanner.nextDouble();
        
         // Расчет МТ
         double Грузоподъемность = (PMM - CM);
         System.out.println("Грузоподъемность = " + Грузоподъемность);
         System.exit(0);
    }
}

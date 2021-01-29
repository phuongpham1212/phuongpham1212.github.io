// Viet phuong trinh giai phuong trinh bac 2 (ax^2 + bx + c = 0 voi a != 0)
import java.util.Scanner;

public class practice2 {

    public static void main(String[] args) throws Exception{
        double a;
        double b;
        double c;

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Nhap he so bac 2, a = ");
        a = scanner.nextDouble();
        System.out.println("Nhap he so bac 1, b = ");
        b = scanner.nextDouble();
        System.out.println("Nhap he so tu do, c = ");
        c = scanner.nextDouble();

        if (a == 0) {
            System.out.println("Vui long nhap lai a, voi a khac 0");
        } else {
                double delta = b*b - 4*a*c;
                double x1;
                double x2;

                if (delta < 0) {
                    System.out.println("Phuong trinh vo nghiem");    
                } else if (delta == 0){
                    x1 = x2 = -b/(2*a);
                    System.out.println("Phuong trinh co nghiem kep: ");
                } else {
                    x1 = (-b + Math.sqrt(delta))/(2*a);
                    x2 = (-b - Math.sqrt(delta))/(2*a);
                    System.out.println("Phuong trinh co 2 nghiem: " +"x1 = " +x1 +"\t x2 =" +x2 );
                }
            }
   
        scanner.close();
    }
}

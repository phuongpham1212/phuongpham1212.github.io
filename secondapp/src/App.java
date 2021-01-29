// Viet phuong trinh bac nhat 1 an (ax + b = 0)
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double a;
        double b;
        double x;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap a: ");
        a = scanner.nextDouble();
        System.out.println("Nhap b: ");
        b = scanner.nextDouble();

        // if (a == 0 && b == 0) {
        //     System.out.println("Phuong trinh co vo so nghiem");
        // } else if (a == 0 && b != 0) {
        //     System.out.println("Phuong trinh vo nghiem");
        // } else if (a != 0) {
        //     x = -b / a;
        //     System.out.println("Nghiem cua phuong trinh la: " +x);
        // }

        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh co vo so nghiem");
            } else {
                System.out.println("Phuong trinh vo nghiem");
            }
        } else {
            x = -b / a;
            System.out.println("Nghiem cua phuong trinh la: " +x);
        }

        scanner.close();

    }
}

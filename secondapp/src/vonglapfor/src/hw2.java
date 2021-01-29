import java.util.Scanner;

public class hw2 {
    public static void main(String[] args) throws Exception {

        // 2 Viết chương trình cho phép nhập vào một số nguyên dương n, liệt kê n số Fibonacci đầu tiên.
        System.out.println("\n-----------------");
        int n;
        int f0 = 0;
        int f1 = 1;
        int fn = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap n: ");
        n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Vui long nhap lai so n, voi n la so nguyen duong");
        } else {
            for (int i = 0; i < n; i++) {
                f0 = f1;
                f1 = fn;
                fn = f0 + f1;
                System.out.println(fn);
            }
        }
        scanner.close();
    }
}

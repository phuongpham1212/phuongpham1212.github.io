import java.util.Scanner;

public class hw3 {
    // 3 Viết chương trình nhập từ bàn phím số nguyên dương n và hiển thị ra màn
    // hình n!
    // Ví dụ: nhập n = 5 thì kết quả 5! = 120 (1*2*3*4*5 = 120)
    public static void main(String[] args) throws Exception {
        System.out.println("\n-----------------");
        int n;
        int answer;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap n = ");
        n = scanner.nextInt();
        answer = 1;

        if (n <= 0) {
            System.out.println("Vui long nhap lai so n, voi n la so nguyen duong");
        } else {
            for (int i = 1; i <= n; i++) {
                answer *= i;
            }
            System.out.println(n + "! = " + answer);
        }
        scanner.close();
    }

}

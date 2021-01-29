import java.util.Scanner;

public class hw1 {
    public static void main(String[] args) throws Exception {
        // 1 Viết chương trình nhập vào 3 số. Kiểm tra xem 3 số này có phải cạnh của một
        // tam giác
        // (Điều kiện tổng 2 cạnh phải lớn hơn cạnh còn lại)
        int a, b, c;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap a = ");
        a = scanner.nextInt();
        System.out.println("Nhap b = ");
        b = scanner.nextInt();
        System.out.println("Nhap c = ");
        c = scanner.nextInt();

        if (a + b > c || a + c > b || b + c > a) {
            System.out.println("3 so la canh cua 1 tam giac");
        } else {
            System.out.println("3 so khong phai canh cua 1 tam giac");
        }

        scanner.close();
    }
}

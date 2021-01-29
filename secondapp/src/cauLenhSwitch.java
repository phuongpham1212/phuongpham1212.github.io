// Nhập vào một tháng bất kỳ và in ra màn hình thông tin tháng đó có bao nhiêu ngày.
// Biết:
// Tháng 1, 3, 5, 7, 8, 10, 12 có 31 ngày
// Tháng 2 có 28 hoặc 29 ngày
// Tháng 4, 6, 9, 11 có 30 ngày
import java.util.Scanner;
public class cauLenhSwitch {
    public static void main(String[] args) throws Exception {
        int month;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so thang: ");
        month = scanner.nextInt();

        switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println("31 ngay");
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("30 ngay");
                    break;
                case 2:
                    System.out.println("28 hoac 29 ngay");
                    break;
                default:
                    System.out.println("Khong hop le");
                    break;
        }

        scanner.close();
    }
}

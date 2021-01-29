public class App {
    public static void main(String[] args) throws Exception {
        // Vong lap for:
        int i;
        for (i = 0; i <= 5; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        // Vong lap while:
        System.out.println("\n-----------------");
        int j = 1;
        while (j <= 5) {
            if (j % 2 == 0) {
                System.out.println(j + "\t");
                j++;
            }
        }

        // Vong lap do-while:
        System.out.println("\n-----------------");
        

    }
}

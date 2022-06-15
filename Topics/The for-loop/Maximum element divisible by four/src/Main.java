import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int num = scanner.nextInt(); // sequence of natural numbers input
        int sum = 0;

        for (int i = 0; i < num; i++) {
            int a = scanner.nextInt();
            if  (a % 4 == 0 && a > sum) {
                sum = a;
            }
        }

        System.out.println(sum);

    }
}
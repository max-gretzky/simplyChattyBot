import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int max = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i < max; i++) {

            int num = scanner.nextInt();
            if (num % 6 == 0) {
                sum += num;
            }
        }

        System.out.println(sum);
    }
}
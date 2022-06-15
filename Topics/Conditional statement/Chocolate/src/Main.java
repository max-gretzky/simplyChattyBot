import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int n = scanner.nextInt(); // length
        int m = scanner.nextInt(); // width
        int k = scanner.nextInt(); // number of bits

        if (k % n == 0 && k / n < m) {
            System.out.println("YES");
        } else if (k % m == 0 && k / m < n) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }

    }
}
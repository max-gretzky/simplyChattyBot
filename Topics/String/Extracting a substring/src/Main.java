import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here

        String a = scanner.nextLine();

        System.out.println(a.substring(scanner.nextInt(), scanner.nextInt() + 1));
    }
}
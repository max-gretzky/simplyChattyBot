import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here

        int startInt = scanner.nextInt();
        int endInt = scanner.nextInt();

        /* for (int i = startInt; i <= endInt; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        } */

        for (int i = startInt; i <= endInt; i++) {
            System.out.println(i % 3 == 0 && i % 5 == 0 ? "FizzBuzz" :
                    i % 3 == 0 ? "Fizz" :
                    i % 5 == 0 ? "Buzz" :
                    i);
        }
    }
}
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int numOfCups = scanner.nextInt();
        boolean isWeekend = scanner.nextBoolean();

        if (numOfCups >= 10 && numOfCups <= 20 && !isWeekend) {
            System.out.println(true);
        }

        else if (numOfCups >= 15 && numOfCups <= 25 && isWeekend) {
            System.out.println(true);
        }

        else {
            System.out.println(false);
        }
    }
}
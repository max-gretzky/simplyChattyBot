import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int hoursV1 = scanner.nextInt();
        int minutesV1 = scanner.nextInt();
        int secondsV1 = scanner.nextInt();
        int times1 = (hoursV1 * 60 + minutesV1) * 60 + secondsV1;

        int hoursV2 = scanner.nextInt();
        int minutesV2 = scanner.nextInt();
        int secondsV2 = scanner.nextInt();
        int times2 = (hoursV2 * 60 + minutesV2) * 60 + secondsV2;

        System.out.println(times2 - times1);
    }
}
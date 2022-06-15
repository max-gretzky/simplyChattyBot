import java.util.Objects;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here

        String inputV1 = scanner.nextLine();
        String inputV2 = scanner.nextLine();

        System.out.println(Objects.equals(inputV2.replaceAll(" ", "").trim(),
                inputV1.replaceAll(" ", "").trim()));
    }
}
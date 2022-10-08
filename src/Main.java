import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter USD:");
        int USD = scanner.nextInt();
        int VND = USD * 23000;
        System.out.println("VND is:");
        System.out.println(VND + "VND");
    }
}
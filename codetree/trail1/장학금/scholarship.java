import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int mi = sc.nextInt(), fi = sc.nextInt();

        System.out.print(mi >= 90 && (fi >= 95) ? 100000: mi >= 90 && (fi >= 90) ? 50000:0);
    }
}
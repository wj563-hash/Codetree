import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();

        System.out.print((M == 12 || M == 1 || M == 2) ? "Winter":
                         (M == 3 || M == 4 || M == 5) ? "Spring":
                         (M == 6 || M == 7 || M == 8) ? "Summer":"Fall");
    }
}
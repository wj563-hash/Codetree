import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a < 0) {
            System.out.printf("%d\nminus", a);
        }
        else {
            System.out.printf("%d", a);
        }
    }
}
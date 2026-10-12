import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(), B = sc.nextInt(), C = sc.nextInt(), D = sc.nextInt(), E = sc.nextInt();
        System.out.printf("%d\n%d\n%d\n%d", A>B?1:0, A>C?1:0, A>D?1:0, A>E?1:0);
    }
}
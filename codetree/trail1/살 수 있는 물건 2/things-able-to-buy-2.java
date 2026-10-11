import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(N>=3000?"book":N>=1000?"mask":N>=500?"pen":"no");
    }
}
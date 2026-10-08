import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] sA = s.split("-");
        System.out.printf("%s-%s-%s", sA[0], sA[2], sA[1]);
    }
}
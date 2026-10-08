import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] sArr = s.split("-");
        System.out.printf("%s.%s.%s", sArr[2], sArr[0], sArr[1]);
    }
}
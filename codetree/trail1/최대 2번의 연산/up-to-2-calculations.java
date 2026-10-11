import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        a = a % 2==0?a/2:a;
        System.out.println(a % 2 ==1?(a+1)/2:a);
    }
}
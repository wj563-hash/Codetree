import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char s = sc.next().charAt(0);
        System.out.println(s=='S'?"Superior":s=='A'?"Excellent":s=='B'?"Good":s=='C'?"Usually":s=='D'?"Effort":"Failure");
    }
}
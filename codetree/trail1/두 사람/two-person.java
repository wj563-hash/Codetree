import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A_age = sc.nextInt(); char A_sex = sc.next().charAt(0);
        int B_age = sc.nextInt(); char B_sex = sc.next().charAt(0);


        System.out.print((A_age >= 19 && A_sex == 'M') || (B_age >= 19 && B_sex == 'M') ? 1:0);
    }
}
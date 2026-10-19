import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sex = sc.nextInt();
        int age = sc.nextInt();

        System.out.print(sex == 0 && age < 19 ? "BOY":
                         sex == 0 && age >= 19 ? "MAN":
                         sex == 1 && age < 19 ? "GIRL":"WOMAN");
    }
}
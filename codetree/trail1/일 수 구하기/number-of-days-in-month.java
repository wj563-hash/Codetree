import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.print(n == 1? 31: 
                         n == 2? 28:
                         n == 3? 31:
                         n == 4? 30:
                         n == 5? 31:
                         n == 6? 30:
                         n == 7? 31:
                         n == 8? 31:
                         n == 9? 30:
                         n == 10? 31:
                         n == 11? 30:31);
    }
}
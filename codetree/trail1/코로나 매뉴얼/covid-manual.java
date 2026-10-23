import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int count = 0;

        for (int i = 0; i < 3; i++) {
            char dis = sc.next().charAt(0);
            int deg = sc.nextInt();

            if (dis == 'Y' && deg >= 37) {
                count += 1;
            }
        }

        System.out.print(count >= 2? "E":"N");


    }
} 
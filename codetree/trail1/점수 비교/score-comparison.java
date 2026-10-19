import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException { 

        Scanner sc = new Scanner(System.in); 

        int A_math = sc.nextInt(), A_eng = sc.nextInt(); 
        int B_math = sc.nextInt(), B_eng = sc.nextInt(); 
        
            System.out.print(A_math > B_math && A_eng > B_eng? 1:0); 

    }
}
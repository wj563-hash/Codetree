public class Main {
    public static void main(String[] args) {
        int a = 5, b = 6, c = 7;
        int temp = a; a = c; 
        int temp2 = b; b = temp; c = temp2;
        System.out.printf("%d\n%d\n%d", a, b, c);
    }
}
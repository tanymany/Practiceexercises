import java.util.Scanner;

public class Repeat {
    public static void main(String[] args) {
        int i=0;
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        n = sc.nextInt();

        for(i=1;i<=n;i++) {
            for (int j = 1; j <=i; j++){
                System.out.print(i);
            }
        }
    }
}

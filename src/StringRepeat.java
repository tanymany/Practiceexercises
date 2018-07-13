import java.util.Scanner;

public class StringRepeat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringRepeat fr = new StringRepeat();

        String input;
        int number;

        System.out.println("Enter a string: ");
        input = scanner.nextLine();
        System.out.println("Enter a number: ");
        number = scanner.nextInt();

        fr.stringRepeat(input, number);
    }

    public void stringRepeat(String in, int n) {
        System.out.print(in);
        for (int j = 0; j < n; j++) {
            for (int i = in.length() - n; i < in.length(); i++) {
                System.out.print(in.charAt(i));
            }
        }
    }
}


import java.util.Scanner;

public class Palindrome {
    private long number;

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public void checkPalindrome() {
        long oldnum = this.number;
        long pal = 0;
        long num = this.number;
        while (num != 0) {
            long rem = num % 10;
            pal = rem + (pal * 10);
            num = num / 10;
        }
        if (pal == oldnum) {
            System.out.println("Number is a palindrome");
            checkEven();
        } else {
            System.out.println("Not a palindrome");
        }
    }

    public void checkEven() {
        long temp = this.number;
        int count = 0;
        long sum = 0;
        while (temp != 0) {
            long rem = temp % 10;
            if (rem % 2 == 0) {
                sum += rem;
            }
            temp = temp / 10;
            count++;

        }
        if (sum > 25) {
            System.out.println("sum of the even numbers is more than 25");
        } else {
            System.out.println("sum of the even numbers is less than 25");
        }

    }

    public static void main(String[] args) {

        Palindrome palin = new Palindrome();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number:");
        final long l = sc.nextLong();
        palin.setNumber(l);
        palin.checkPalindrome();

    }
}

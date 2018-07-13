import java.util.Scanner;

public class stringSum {
    public void sum(String str){
        String[] array=str.split("\\s");
        int sum=0;
        for (String num: array){
            int n = 0;
            try {
                n = Integer.parseInt(num);
            } catch (NumberFormatException e) {
                System.out.println("Enter a valid integer");
            }
            sum+=n;
        }
        if(sum!=0){
            System.out.println("Sum is of the string of integers is: "+sum);
    }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string of integers");
        String st = sc.nextLine();
        stringSum s=new stringSum();
        s.sum(st);
    }
}

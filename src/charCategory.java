import java.util.Scanner;

public class charCategory {
    public void checker(char ch){
        if(ch>='0' && ch<='9'){
            System.out.println("Input is a digit");
        }
        else if(ch>='a' && ch<='z'){
            System.out.println("Input is a small alphabet");
        }

        else if(ch>='A' && ch<='B'){
            System.out.println("Input is a capital alphabet");
        }
        else{
            System.out.println("Input is a special character");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a charecter: ");
        char chr=sc.next().charAt(0);
        charCategory cs=new charCategory();
        cs.checker(chr);
    }
}

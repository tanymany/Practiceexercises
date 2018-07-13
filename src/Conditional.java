import java.util.Scanner;

public class Conditional {
    private int num;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void printTJ(){
        int n=this.num;
        if(n>20 && n<30){
            if(n%2==0){
                System.out.println("JERRY");
            }
            else {
                System.out.println("TOM");
            }
        }
        else{
            System.out.println("Number is not between 20 & 30");
        }
    }

    public static void main(String[] args) {
        Conditional con= new Conditional();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        con.setNum(n);
        con.printTJ();
    }
}

import java.util.Scanner;

public class NumberSum {
    public void sumFinder(long num){
        long rem;
        int i=0;
        int sum=0;
        int l=Long.toString(num).length();
        long[] arr=new long[l];
        while(num!=0) {
            rem = num % 10;
            arr[i]=rem;
            if (num % 2 == 0) {
                sum += rem;
            }
            num = num / 10;
            i++;
        }
        for(int k=0;k<l;k++) {
            for(int m=k+1;m<l;m++) {
                if(arr[k]<arr[m]) {
                    long temp =arr[k];
                    arr[k]=arr[m];
                    arr[m]=temp;
                }
            }
        }
        System.out.println("Descending Order: ");
        for(int k=0;k<l-1;k++) {
            System.out.print(arr[k]);
        }
        System.out.println(arr[l-1]);
        if(sum>15) {
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }

    public static void main(String[] args) {
        NumberSum sm= new NumberSum();
        System.out.println("Enter a number: ");
        Scanner sc=new Scanner(System.in);
        long num=sc.nextLong();
        sm.sumFinder(num);
    }
}

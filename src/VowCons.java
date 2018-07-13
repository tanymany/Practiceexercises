import java.util.Scanner;

public class VowCons {

    public void consVow(String input) {

        char[] array = input.toCharArray();
         {
            for (int i = 0; i < array.length; i++) {
                if(array[i]>='a' && array[i]<='z' || array[i]>='A' && array[i]>='z') if (array[i] == 'a' || array[i] == 'A' || array[i] == 'e' || array[i] == 'E' || array[i] == 'i' || array[i] == 'I' || array[i] == 'o' || array[i] == 'O' || array[i] == 'u' || array[i] == 'U') {
                    System.out.println(array[i] + "- is a vowel");
                } else {
                    System.out.println(array[i] + "- is a consonant");
                }
                else {
                    System.out.println(array[i]+"- Is a non-alphabet.");
                }
            }

        }
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VowCons vc = new VowCons();
        System.out.println("Enter a word");
        String st = sc.nextLine();
        vc.consVow(st);
    }
}

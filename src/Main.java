import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Fibonacci serisini giriniz");
        int fi=input.nextInt();
        int i=0, j=1, top;
        System.out.println(i);
        System.out.println(j);
        for (int k=1;k<=fi;k++){
            top=i+j;
            System.out.println(top);
            i=j;
            j=top;

        }
    }
}
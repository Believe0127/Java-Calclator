import java.util.Scanner;

public class Calculator {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("数値1: ");
        int value1 = sc.nextInt();
        System.out.print("数値2: ");
        int value2 = sc.nextInt();

        System.out.print(value1 + value2);
    }

}

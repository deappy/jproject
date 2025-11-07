import java.util.Scanner;

public class Units {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n =sc.nextInt();
        System.out.println("The units place is: "+(n%10));
        sc.close();
    }
}

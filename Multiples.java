import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of test cases:");
        int t = sc.nextInt();
        while(t-->0){
            System.out.println("Enter multiples of :");
            int n = sc.nextInt();
            System.out.println("Enter the number of multiples:");
            int m = sc.nextInt();

            for(int i =1;i<=m;i++){
                System.out.println(n+"*"+i+"="+(n*i));
            }
        }
        sc.close();
    }
}

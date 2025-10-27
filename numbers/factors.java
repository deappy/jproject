import java.util.Scanner;

public class factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of test case:");
        int t = sc.nextInt();

        while(t-->0){
            System.out.println("Enter factors of :");
            int n = sc.nextInt();

            for(int i = 1; i<=n; i++){
                if(n%i == 0){
                    System.out.print(i+" ");
                }
            }
        }
        sc.close();
    }
}


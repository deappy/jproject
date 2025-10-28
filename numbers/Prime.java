import java.util.Scanner;

public class Prime {
    public static boolean checkPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner scan  = new Scanner(System.in);
        System.out.println("Enter the number of test cases");
        int t = scan.nextInt();
        
        while(t-->0){
            System.out.println("Enter the number to check if it is prime or not :");
            int n = scan.nextInt();
        
            if(checkPrime(n)){
                System.out.println("Prime number");
            }
            else{
                System.out.println("Not Prime");
            }
        }
        scan.close();
    }
}

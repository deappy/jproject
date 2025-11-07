import java.util.Scanner;

public class Units {
    public static void getUnitsPlace(double n){
        System.out.println("The units place is: "+(n%10));
    }
    public static void getTensPlace(double n ){
        System.out.println("The tens place is: "+((n/10)%10));
    }
    public static void getHundredsPlace(double n){
        System.out.println("The hundreds place is: "+((n/100)%10));
    }
    public static void getThousandsPlace(double n){
        System.out.println("The thosands place is: "+((n/1000)%10));
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 4 digit number with 3 digit decimal: ");
        double n =sc.nextDouble();
        
        getUnitsPlace(n);
        getTensPlace(n);
        getHundredsPlace(n);
        getThousandsPlace(n);
        sc.close();
    }
}

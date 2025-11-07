import java.util.Scanner;

public class Units {
    public static void getUnitsPlace(double n){
        System.out.println("The units place is: "+((int)n%10));
    }
    public static void getTensPlace(double n ){
        System.out.println("The tens place is: "+(((int)n/10)%10));
    }
    public static void getHundredsPlace(double n){
        System.out.println("The hundreds place is: "+(((int)n/100)%10));
    }
    public static void getThousandsPlace(double n){
        System.out.println("The thosands place is: "+(((int)n/1000)%10));
    }
    public static void getTenthsPlace(double n){
        System.out.println("The tenths place: "+((int)(Math.abs(n)*10))%10);
    }
    public static void getHundredthsPlace(double n){
        System.out.println("The hundredth place: "+((int)(Math.abs(n)*100))%10);
    }
    public static void getThousandthsPlace(double n){
        System.out.println("The thousandths place: "+((int)(Math.abs(n)*1000))%10);
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 4 digit number with 3 digit decimal: ");
        double n =sc.nextDouble();
        
        getUnitsPlace(n);
        getTensPlace(n);
        getHundredsPlace(n);
        getThousandsPlace(n);
        System.out.println("");
        getTenthsPlace(n);
        getHundredthsPlace(n);
        getThousandthsPlace(n);
        sc.close();
    }
}

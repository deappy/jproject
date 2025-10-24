package arrays;
import java.util.Scanner;

public class student {
    public static void printgrades(int n, int[] arr){
        for(int grade: arr){
            System.out.print(grade+" ");
        }
        System.out.println();
    }
    public static void highestScore(int[] arr){
        for(int i =0;i<arr.length-1;i++){
            for(int j =0;j<arr.length-i-1;j++){
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }
        System.out.println("---------------------------------------");
        System.out.println("\nThe highest score is : "+arr[0]);
        System.out.println("---------------------------------------");
    }
    public static void lowestScore(int[] arr){
        for(int i =0;i<arr.length-1;i++){
            for(int j =0;j<arr.length-i-1;j++){
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }
        System.out.println("---------------------------------------");
        System.out.println("\nThe lowest score is :"+arr[arr.length-1]);
        System.out.println("---------------------------------------");
    }
    public static void averageScore(int[] arr){
        int sum=0;
        for(int grade : arr){
            sum+=grade;
        }
        System.out.println("---------------------------------------");
        System.out.println("The total avergae score : "+(sum/arr.length));
        System.out.println("---------------------------------------");
    }
    public static void targetStudent(int[] arr, int target){
        boolean found = false;
        for(int grade : arr){
            if(grade==target){
                found=true;
            }
        }
        System.out.println((found)?"Grade found":"Grade not found");
        System.out.println("---------------------------------------");
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("---------------------------------------");
        System.out.println("Enter the number of students: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the scores of "+n+" students");
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        boolean running=true;

        System.out.println();
        while(running==true){
            System.out.println("---------------------------------------");
            System.out.println("Welcome to student's marklist!");
            System.out.println("1.Show grades of students.");
            System.out.println("2.The student with highest score.");
            System.out.println("3.The student with lowest score.");
            System.out.println("4.The average score the class.");
            System.out.println("5.Find a specific student's grade.");
            System.out.println("6.Exit.");
            System.out.println("Choose an option!");
            int option = sc.nextInt();

            switch (option){
                case 1:
                    printgrades(n,arr);
                    break;
                case 2:
                    highestScore(arr);
                    break;
                case 3:
                    lowestScore(arr);
                    break;
                case 4:
                    averageScore(arr);
                    break;
                case 5:
                    System.out.println("---------------------------------------");
                    System.out.println("Enter the grade needed to find");
                    int target = sc.nextInt();
                    targetStudent(arr,target);
                    break;
                case 6:
                    running=false;
                    break;
                default:
                    System.out.println("Enter a valid choice!(1 to 6)");
            }
        }
        sc.close();
    }
}

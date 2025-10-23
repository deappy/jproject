package arrays;
import java.util.Scanner;

public class student {
    public static void printgrades(int n, int[] arr){
        for(int grade: arr){
            System.out.print(grade+" ");
        }
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
        System.out.println("\nThe highest score is : "+arr[0]);
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
        System.out.println("\nThe lowest score is :"+arr[arr.length-1]);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of students: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        boolean running=true;

        while(running=true){
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
                    targetStudent(arr);
                    break;
                case 6:
                    running=false;
                    break;
                default:
                    System.out.println("Enter a valid choice!(1 to 6)");
            }

        }
    }
    
}

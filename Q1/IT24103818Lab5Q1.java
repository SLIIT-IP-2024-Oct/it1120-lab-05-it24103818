import java.util.Scanner;
public class IT24103818Lab5Q1 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int first = input.nextInt();

        System.out.print("Enter the second integer: ");
        int second = input.nextInt();

        System.out.print("Enter the third integer: ");
        int third = input.nextInt();

        System.out.println("User entered numbers are: "+ first +" "+ second +" "+ third);

        int smallest = first;
        int largest = first;

        if(second < first && second < third){
            smallest = second;

        }
        if(third < first && third < second){
            smallest = third; 
        }
        if(second > first && second > third){
            largest = second;
        }
        if(third>first && third > second){
            largest = third;
        }
        System.out.println("The largest number is: " + largest);
        System.out.println("The smallest number is: " + smallest);

        

    }

    
}

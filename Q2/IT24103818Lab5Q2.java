import java.util.Scanner;
public class IT24103818Lab5Q2 {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of new members introduced: ");
        int members = input.nextInt();

        if(members < 0){
            System.out.print("Input must be a zero or a number greater than zero ");
            return;
        }
        String Price;
        switch(members){
            case 0:
            Price = "no prize";
            
            break;

            case 1:
            Price = "a Pen" ;

            break;

            case 2:
            Price = " an Umbrella";

            break;

            case 3:
            Price = "a Bag";

            break;

            case 4:
            Price = "a Travelling chair";

            break;

            default:

            Price = "Headphones";
            
            break;

        }
        System.out.print("You have won " + Price);
        input.close();

    }
    
}

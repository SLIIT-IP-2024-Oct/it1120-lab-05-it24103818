import java.util.Scanner;

public class IT24103818Lab5Q3 {
    
    public static final double ROOM_CHARGE_PER_DAY = 48000.0;
    public static final int DISCOUNT_3_4_DAYS = 10; 
    public static final int DISCOUNT_5_OR_MORE = 20;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter Start Date (1-31): ");
        int startDate = input.nextInt();
        System.out.print("Enter End Date (1-31): ");
        int endDate = input.nextInt();

        
        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("Error: Days must be between 1 and 31");
            return; 
        }

        
        if (startDate >= endDate) {
            System.out.println("Error: Start date must be less than End Date");
            return;
        }

        
        int numberOfDays = endDate - startDate;

        
        int discountRate = 0;
        if (numberOfDays >= 3 && numberOfDays <= 4) {
            discountRate = DISCOUNT_3_4_DAYS;
        } else if (numberOfDays >= 5) {
            discountRate = DISCOUNT_5_OR_MORE;
        }

        
        double totalAmount = ROOM_CHARGE_PER_DAY * numberOfDays;
        double discount = (totalAmount * discountRate) / 100;
        totalAmount -= discount;

        
        System.out.println("Room Charge Per Day: Rs. " + ROOM_CHARGE_PER_DAY + "/=");
        System.out.println("Number of Days Reserved: " + numberOfDays);
        System.out.println("Total Amount to be Paid: " + totalAmount);
    }
}
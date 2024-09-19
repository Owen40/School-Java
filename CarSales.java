import java.util.Scanner;

public class CarSales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the model of the car: ");
        String modelName = scanner.nextLine();

        System.out.print("Enter the plate number of the car: ");
        String plateNumber = scanner.nextLine();
    
        System.out.print("Enter the buying price of the car: ");
        double buyingPrice = scanner.nextDouble();
    
        double sellingPrice = buyingPrice * 1.5045;
        double profit = sellingPrice - buyingPrice;

        System.out.println(modelName + " of the plate number " + plateNumber + ":");
        System.out.println("Buying price = Ksh. " + String.format("%.2f", buyingPrice));
        System.out.println("Selling price = Ksh. " + String.format("%.2f", sellingPrice));
        System.out.println("Profit made = Ksh. " + String.format("%.2f", profit));
    }
}
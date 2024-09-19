import java.util.*;

class Hello {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        String model, plate;
        double bp,sp,p;

        System.out.printf("\tEnter car details:\n\tModel:\t");
        model = obj.nextLine();

        System.out.printf("\tPlate No:\t");
        plate = obj.nextLine();
        
        System.out.printf("\tBuying Price:\t");
        bp = obj.nextDouble();

        sp = (150.45/100)*bp;
        p = sp-bp;

        System.out.printf("\n\tModel:\t%S\n\tPlate No:\t%S\n\tBuying Price:\tKsh.%.2f\n\tSelling Price:\tKsh.%.2f\n\tProfit:\tKsh.%.2f",model,plate,bp,sp,p);
       
    }   
}
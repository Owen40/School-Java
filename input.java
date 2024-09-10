import java.util.*;

class inputClass {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String name,favcolor;
        System.out.println("Enter your name");
        name=input.nextLine();
        System.out.println("Enter your favourite color");;
        favcolor=input.nextLine();
        System.out.println("Your name is "+name+" and your favourite color is "+favcolor);
    }
}
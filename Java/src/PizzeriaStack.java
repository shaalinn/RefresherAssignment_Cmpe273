import java.util.Scanner;

/**
 * Created by shalin on 9/1/2016.
 */
public class PizzeriaStack {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Stack stack = new Stack(20);
        System.out.println("Pizza machine");
        System.out.println("Please enter the toppings you want for pizza from given below");

        System.out.println("Choose From:");
        System.out.println("1. Tomatoes");
        System.out.println("2. Onions");
        System.out.println("3. Jalapenos");
        int ch = sc2.nextInt();

        switch (ch){
            case 1:
                stack.push("Tomatoes");
                break;
            case 2:
                stack.push("Onions");
                break;
            case 3:
                stack.push("Jalapenos");
                break;
            default:
                stack.push("Tomatoes");
                stack.push("Onions");
                stack.push("Jalapenos");
        }
        System.out.println("Choose From:");
        System.out.println("1. Chicken");
        System.out.println("2. Pork");
        System.out.println("3. Pepperoni");
        System.out.println("4. Veggie");
        int ch1 = sc2.nextInt();

        switch (ch1){
            case 1:
                stack.push("Chicken");
                break;
            case 2:
                stack.push("Pork");
                break;
            case 3:
                stack.push("Pepperoni");
                break;
            case 4:
                stack.push("Veggie");
        }

        System.out.println("Choose From:");
        System.out.println("1. Mozzarella");
        System.out.println("2. Cheddar");
        System.out.println("3. Provolone");

        int ch3 = sc2.nextInt();

        switch (ch3){
            case 1:
                stack.push("Mozzarella");
                break;
            case 2:
                stack.push("Cheddar");
                break;
            case 3:
                stack.push("Provolone");
                break;
            case 4:
                stack.push("Mozzarella");
        }

        System.out.println("Choose From:");
        System.out.println("1. Thin Crust");
        System.out.println("2. Thick Crust");
        System.out.println("3. PAN pizza");

        int ch4 = sc2.nextInt();

        switch (ch4){
            case 1:
                stack.push("Thin Crust");
                break;
            case 2:
                stack.push("Thick Crust");
                break;
            case 3:
                stack.push("PAN Pizza");
                break;
            case 4:
                stack.push("Thin Crust");
        }

        System.out.println("Your Pizza is ready: "+stack);


    }
}

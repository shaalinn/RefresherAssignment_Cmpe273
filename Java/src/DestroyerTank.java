import java.util.Scanner;

/**
 * Created by shalin on 9/6/2016.
 */
public class DestroyerTank implements Tanks{

    int damage;
    @Override
    public String damage() {
        return "Destroyer tank did "+damage+" damage";
    }

    @Override
    public void setDamage(int damage) {
                this.damage = damage;
    }

    @Override
    public String move() {
        return "Destroyer moved 15 spaces";
    }

    @Override
    public String setDriver(String name) {
        return name+" is now driving destroyer tank";
    }

    @Override
    public String turnRight() {
        return "Tank turned right";
    }

    @Override
    public String turnLeft() {
        return "Tank turned left";
    }

    public static void main(String[] args){
        DestroyerTank dt = new DestroyerTank();
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);
        do{
            System.out.println("Choose Action");
            System.out.println("1. Set Damage");
            System.out.println("2. Do Damage");
            System.out.println("3. Set Driver");
            System.out.println("4. Turn Right");
            System.out.println("5. Turn Left");
            System.out.println("6. Move");
            System.out.println("7 exit");
            int action = sc1.nextInt();
            switch (action){
                case 1:
                    int damage = sc2.nextInt();
                    dt.setDamage(damage);
                    break;
                case 2:
                    System.out.println(dt.damage());
                    break;
                case 3:
                    String drivetr = sc3.nextLine();
                    System.out.println(dt.setDriver(drivetr));
                    break;
                case 4:
                    System.out.println(dt.turnRight());
                    break;
                case 5:
                    System.out.println(dt.turnLeft());
                    break;
                case 6:
                    System.out.println(dt.move());
                    break;
                case 7:
                    break;
                default:
                    System.out.println("wrong choice");
            }
            if(action==7){
                break;
            }

        }while(true);
    }
}

import java.util.*;

/**
 * Created by shalin on 9/6/2016.
 */
public class Collections {

    public static HashMap<String, Integer> hmap = new HashMap<String, Integer>();

    public void addStudents(String classNo, Integer quant){
        hmap.put(classNo, quant);
    }

    public void updateList(String classNo){
        Integer count = hmap.get(classNo);
        if(count>0) {
            count = count - 1;
            hmap.put(classNo, count);
        }
        else{
            System.out.println("class is empty");
        }
    }

    public static void main(String[] args){
        Collections c = new Collections();
        String classNo, actions;
        int quant;
        Scanner sc1 =  new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);
        do{

            System.out.println("Choose the actions");
            System.out.println("1. Add New Class");
            System.out.println("2. Update Student Count");
            System.out.println("3. View Every Classes' student count");
            System.out.println("4. Exit");
            actions = sc3.nextLine();

            switch (actions) {
                case "1":
                    System.out.println("enter class number and number of students you want to add");
                    classNo = sc1.nextLine();
                    quant = sc2.nextInt();
                    c.addStudents(classNo, quant);
                    break;
                case "2":
                    System.out.println("enter class number to reduce student count by one");
                    classNo = sc1.nextLine();
                    c.updateList(classNo);
                    break;
                case "3":
                    Set hset = Collections.hmap.entrySet();
                    Iterator iterator = hset.iterator();
                    while (iterator.hasNext()) {
                        Map.Entry map = (Map.Entry) iterator.next();
                        System.out.println("Class Number -> Number of Students");
                        System.out.print("" + map.getKey() + "\t->\t");
                        System.out.print(map.getValue());
                        System.out.println();
                    }
                    break;
                case "4":
                    System.out.println("exiting");
                    break;
                default:
                    System.out.println("Wrong choice");
                    break;
            }
            if (actions.equals("4")){
                break;
            }
        }while(true);

        sc1.close();

    }


}

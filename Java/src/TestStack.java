/**
 * Created by shalin on 9/1/2016.
 */
public class TestStack {
    public static void main(String[] args){
        Stack s = new Stack(10);
        s.push("hello");
        System.out.println(s.isEmpty());
        System.out.println(s.pop());
    }
}

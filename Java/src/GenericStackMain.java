import javax.sound.midi.SysexMessage;

/**
 * Created by shalin on 9/1/2016.
 */
public class GenericStackMain {

    public static void main(String[] args){
        GenericStack<String> s = new GenericStack<String>();
        s.push("hello");
        s.push("amazing");
        s.push("world!");
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.isEmpty());

    }
}

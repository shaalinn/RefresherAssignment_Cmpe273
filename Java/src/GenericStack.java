import java.util.ArrayList;

/**
 * Created by shalin on 9/1/2016.
 */
public class GenericStack<T> {

    private int CAP;
    private int CAPACITY = 10;
    private ArrayList<T> stack;
    private int top = -1;

    public GenericStack(){
        CAP = CAPACITY;
        stack = new ArrayList<T>();
    }

    public GenericStack(int capacity){
        CAP = capacity;
        stack = new ArrayList<T>();
    }

    public int size(){
        return stack.size();
    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }

    public void push(T data){
        if(stack.size() == 10){
            System.out.println("Stack is full");
            return;
        }
        top++;
        stack.add(data);
    }
    public boolean isFull(){
        return (size() == 10);
    }

    public T pop(){
        T data;
        if(isEmpty()){
            System.out.println("stack is empty");
            return null;
        }
        data = stack.get(top);
        top--;
        if(top == -1){
            stack.clear();
        }
        return data;
    }

    public T top(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return null;
        }
        return stack.get(top);
    }

    public String toString(){
        String a;
        a ="[";
        /*if(size()>0) {
            a += stack[0];
        }
        if(size()>1){
            for(int i = 1; i<=size()-1;i++){
                a += "," + stack[i];
            }
        }*/
        for(int i=top;top!=-1;i--){
            a +=pop()+"->";
        }
        return a + "]";
    }


}

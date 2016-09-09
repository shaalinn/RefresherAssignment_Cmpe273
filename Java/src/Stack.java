/**
 * Created by shalin on 9/1/2016.
 */
public class Stack {

    private int CAP;
    private int CAPACITY = 10;
    private String[] stack;
    private int top = -1;

    public Stack(){
        CAP = CAPACITY;
        stack = new String[CAP];
    }

    public Stack(int capacity){
        CAP = capacity;
        stack = new String[CAP];
    }

    public int size(){
        return (top+1);
    }

    public boolean isEmpty(){
        return (top==-1);
    }

    public void push(String data){
        if(size() == CAP){
            System.out.println("Stack is full");
            return;
        }
        stack[++top] = data;
    }
    public boolean isFull(){
        return (size() == CAP);
    }
    public String pop(){
        String data;
        if(isEmpty()){
            System.out.println("stack is empty");
            return null;
        }
        data = stack[top];
        stack[top--] = null;
        return data;
    }

    public String top(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return null;
        }
        return stack[top];
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

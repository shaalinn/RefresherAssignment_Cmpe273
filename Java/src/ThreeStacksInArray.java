/**
 * Created by shalin on 9/6/2016.
 */
public class ThreeStacksInArray {

    private int numberOfSTacks = 3;
    private int stackCapacity;
    private int[] values;
    private int[] sizes;

    public ThreeStacksInArray(int stackSize){

        stackCapacity = stackSize;
        values = new int[stackSize * numberOfSTacks];
        sizes = new int[numberOfSTacks];

    }

    public void push(int stackNum, int value) {

        if(isFull(stackNum)){
            System.out.println("stack is full");
        }
        sizes[stackNum]++;
        values[indexOfTop(stackNum)] = value;

    }

    public int pop(int stackNum){

        if(isEmpty(stackNum)){
            System.out.println("stack is empty");
        }

        int topIndex = indexOfTop(stackNum);
        int value = values[topIndex];
        values[topIndex] = 0;
        sizes[stackNum]--;
        return value;

    }

    public int peek(int stackNum){

        if(isEmpty(stackNum)){
            System.out.println("stack is empty");
        }
        return values[indexOfTop(stackNum)];

    }

    public boolean isEmpty(int stackNum){

        return sizes[stackNum] == 0;

    }

    public boolean isFull(int stackNum){

        return sizes[stackNum] == stackCapacity;

    }

    public int indexOfTop(int stackNum){

        int offset = stackNum*stackCapacity;
        int size = sizes[stackNum];
        return offset + size - 1;

    }

}

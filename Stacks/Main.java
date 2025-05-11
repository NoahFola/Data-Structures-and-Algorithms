package Stacks;

public class Main{
    public static void main(String[] args){
        Stack newStack = new Stack(4);
        System.out.println(newStack.isFull());
        newStack.push(1);
        newStack.push(2);
        newStack.push(3);
        newStack.push(4);
        newStack.deleteStack();
    }
}
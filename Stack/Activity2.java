package Stack;

import java.util.Scanner;

//reversing a string
public class Activity2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a string to reverse: ");
        String s = sc.next();

        Stack stack = new Stack(s.length());
        for(char c: s.toCharArray() ){
            stack.push(c);
        }

        System.out.println("reversed string:" + stack.reverse());


        sc.close();


    }
}


class Stack {

    private char[] stack;
    int top = 0, size = 0;
    public Stack(int size) {
        this.size = size;
        stack = new char[size];

    }

    public void push(char c) {
        stack[top] = c;
        top++;
    }

    public char pop(){
        return stack[--top];
    }

    public String reverse(){
        String s = "";

        for(int i = 0; i < size; i++){
            s += pop();
        }
        return s;

    }
}

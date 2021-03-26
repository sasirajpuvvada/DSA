package Stack;

import java.util.*;

public class Q0Stack {
    
    static int MAX = 1000;
    static int TOP = -1;
    static int stack[] = new int[MAX];

    public static int pop() {

        if(TOP==-1) {
            System.out.println("No elements present");
        } else  {
            System.out.println(stack[TOP]);
        }
        return -1;

    }

    public static void push(int element) {

        if(TOP==MAX-1) {
            System.out.println("OverFlow");
        } else {
            stack[++TOP] = element;
        }

    }



    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int choice = 1, value = 0;
        do {

            System.out.println("1. PUSH");
            System.out.println("2. POP");
            System.out.println("3. PEEK");
            System.out.println("4. QUIT");

            System.out.println("Enter choice");
            choice = sc.nextInt();

            switch(choice) {
                case 1: System.out.println("Enter Value to push");
                        value = sc.nextInt();
                        push(value);
                        break;

                case 2: pop();
                        break;

                case 3: System.out.println("PEEK value"+ stack[TOP]);
                        break;

                case 4: System.out.println("See You Again");
                        break;
                
                default: System.out.println("Invalid Choice!!");
            }

        }while(choice>0 && choice<5);
        sc.close();
    }

}
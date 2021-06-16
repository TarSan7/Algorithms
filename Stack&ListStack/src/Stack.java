public class Stack {
    int size;
    int stack[];
    int top, minim, maxim;

    public Stack(int s){
        size = s;
        stack = new int[size];
        top = 0;
    }

    public void add(int element){
        if(top == size){
            System.out.println("Stack is full");
        } else {
            stack[top] = element;
            top++;
        }
    }

    public int readTop(){
        return stack[top - 1];
    }

    public int pop(){
        if(top == 0){
            System.out.println("Stack is empty");
            return -1;
        }
        top--;
        return stack[top];
    }

    public double avGeom(){
        minim = stack[top - 1];
        maxim = stack[top - 1];
        minmax(top - 1);
        if(minim * maxim < 0){
            System.out.println(new Exception("error"));
            return -1;
        }
        return Math.sqrt(minim * maxim);
    }

    public void minmax(int t){
        if(t == -1){
            return;
        }
        minim =  Math.min(minim, stack[t]);
        maxim = Math.max(maxim, stack[t]);
        minmax(t - 1);
    }

    public static void main(String[] args) {
        Stack obj = new Stack(10);
        obj.add(2);
        obj.add(1);
        obj.add(6);
        obj.add(8);
        obj.add(3);
        System.out.println(obj.avGeom());
        obj.pop();
        System.out.println("Top of stack : " + obj.readTop());
        obj.pop();
        obj.pop();
    }
}

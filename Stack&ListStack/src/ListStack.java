public class ListStack {
    Node top = null;

    static class Node {
        int value;
        Node next;

        Node(int v) {
            value = v;
            next = null;
        }

        public static ListStack add(int element, ListStack stack) {
            Node curNode = new Node(element);  //новий вузел
            curNode.next = null;

            if (stack.top == null) {
                stack.top = curNode;
            } else {
                curNode.next = stack.top;
                stack.top = curNode;
            }
            return stack;
        }

        public static void pop(ListStack stack){
            if(stack.top == null){
                System.out.println("Stack is empty");
                return;
            }
            stack.top = stack.top.next;
        }

        public static int readTop(ListStack stack){
            return stack.top.value;
        }

        public static double avGeom(ListStack stack){
            int minim = stack.top.value, maxim = stack.top.value;
            Node n = stack.top;

            while (n != null){
                minim = Math.min(minim, n.value);
                maxim = Math.max(maxim, n.value);
                n = n.next;
            }
            if(minim * maxim < 0){
                System.out.println(new Exception("Negative elements."));
                return -1;
            }
            return Math.sqrt(minim * maxim);
        }

        public static void main(String[] args) {
            ListStack obj = new ListStack();

            add(2, obj);
            add(1, obj);
            System.out.println(avGeom(obj));
            pop(obj);
            System.out.println("Top of stack : " + readTop(obj));
            pop(obj);
            pop(obj);
        }
    }

}

package dsa.stack;

public class Stack2 {
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static class stack{
        static Node Head=null;
        public static boolean isEmpty(){
            return Head==null;
        }

        public static void push(int data){
            Node newNode = new Node(data);
            if(Head==null){
                Head=newNode;
                return;
            }
            newNode.next=Head;
            Head = newNode;
        
        }

       public static int pop(){
        if(isEmpty()){
            return -1;
        }
        int top= Head.data;
        Head.next=Head;
        return top;
        }
        
        public static int peak(){
            if(isEmpty()){
                return -1;
            }
            return Head.data;
        }
        
    }
    public static void main(String[] args) {
        stack s= new stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()){
            System.out.println(s.peak());
            s.pop();
        }
    }
}

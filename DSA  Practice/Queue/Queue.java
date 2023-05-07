package dsa.Queue;

import java.util.Stack;

public class Queue {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static class Que{
        public static Node Head=null;
        public static Node Tail=null;

        public static boolean isEmpty(){
            return Head==null && Tail==null;
        }

        public static void add(int data){
            Node newNode=new Node(data);
            if(Head==null){
                Head=Tail=newNode;
                return;
            }
            Tail.next=newNode;
            Tail=newNode;
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int Front=Head.data;
            if(Head==Tail){
                Head=Tail=null;
            }
            else{
                    Head=Head.next;
                }
                return Front;
            }
        
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return Head.data;
        }
        public static void reverse(int data){
            Stack<Integer> s = new Stack<>();
        }
    

    public static void main(String[] args) {
        Que q=new Que();
      
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
}


package dsa;

public class Solution {
    public static Node Head; 
    public static class Node{
        int data;
        Node next;
        
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    
    public static void insert(int data){
        Node newNode = new Node(data);
        while(Head==null){
            Head=newNode;
            return;
        }
        
        newNode.next = Head;
        Head = newNode;
    }
    
    public static void print(){
        Node temp = Head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
            System.out.print("null");
        }
    

    public static void main(String[] args) {
        Solution list = new Solution();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        //list.insert();
        list.print();
        
    }
}


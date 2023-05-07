package dsa.LinkedList;

public class LinkedList {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node Head;
    public static Node Tail;
    public static int size;

    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(Head==null){
            Head=Tail=newNode;
            return;
        }

        newNode.next=Head;
        Head=newNode;
    }

    public void addlast(int data){
        Node newNode = new Node(data);
        size++;
        if(Head==null){
            Head=Tail=null;
            return;
        }
        Tail.next = newNode;
        Tail=newNode;
    }

    public void add(int indx,int data){
        if(indx==0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp =Head;
        int i = 0;

        while(i<indx-1){
            temp=temp.next;
            i++;
        }
        
        newNode.next=temp.next;
        temp.next=newNode;
    }

    public int removeFirst(){
        if(size==0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val = Head.data;
            Head=Tail=null;
            size--;
            return val;

        }
        int val = Head.data;
        Head=Head.next;
        size--;
        return val;
    }

    public int removeLast(){
        if(size==0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;

        }else if(size==1){
            int val = Head.data;
            Head=Tail=null;
            size--;
            return val;

        }
        Node prev=Head;
        for(int i =0;i<size-2;i++){
            prev=prev.next;
        }
        int val=prev.next.data;
        prev.next=null;
        Tail=prev;
        size--;
        return val;

    }
    public int itrSearch(int key){
        Node temp=Head;
        int i=0;

        while(temp!=null){
            if(temp.data==key){
                return i;
            }
            temp=temp.next;
            i++;

        }
        return -1;
    }

    public int helper(Node Head, int key){
        if(Head == null){
            return -1;
        }
        if(Head.data==key){
            return 0;
        }
        int indx=helper(Head.next,key);

        if(indx==-1){
        return -1;
        }
        return indx+1;


    }
    public int recSearch(int key){
        return helper(Head,key);
    }

    public void print(){
        Node temp = Head;
        if(Head==null){
            System.out.println("ll does not exit");
        }
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList ll =new LinkedList();
        ll.addFirst(5);
        ll.addFirst(50);
        ll.addFirst(60);
        ll.addlast(12);
        ll.addlast(30);
        ll.add(3, 80);
        ll.print();
        System.out.println(ll.itrSearch(12));
        System.out.println(ll.recSearch(30));
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll.size);
        
        
    }
}

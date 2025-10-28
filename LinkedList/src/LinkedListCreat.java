import java.util.Scanner;
class Node{
    int data;
    Node next;

    Node(int d){
        data=d;
        next=null;
    }
}

class LinkedList{
   int count=0;
    Node head;

    void insertatstart(int d){
        count++;
        Node newNode=new Node(d);
        if(head==null){
            head=newNode;
        }else{
            newNode.next=head;
            head=newNode;
        }
    }

    void insertatend(int d){
        count++;
        Node newNode=new Node(d);
        if(head==null){
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }

    void deleteNodeathefront(){
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        head=head.next;
        count--;
    }

    void deleteNodeatheend(){
        if (head == null || head.next == null) {
            head = null;
            return;
        }
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
        count--;
    }

    int countnum(){
        return count;
    }

    void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println("null");
    }
}

public class LinkedListCreat{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        LinkedList list=new LinkedList();
        System.out.println("Enter the number of elements in the list:- ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Enter the "+(i+1)+"element in the list");
            list.insertatend(sc.nextInt());
        }
        list.print();
    }
}
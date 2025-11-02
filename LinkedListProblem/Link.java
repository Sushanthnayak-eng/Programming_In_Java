import java.util.*;

 class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        next=null;
    }
 }

 public class Link{
    Node head;
    Node temp;
    void addlast(int data){
        Node newnode=new Node(data);
        if(head==null){
        head=newnode;
        }
        temp=head;
        while(temp.next!=null){
           temp=temp.next;
        }
        temp.next=newnode;
    }

    void add1st(int data){
        Node newnode=new Node(data){
            if(head==null){
            head=newnode;
            }
            newnode.next=head;
            head=newnode;
        }
    }
    
 }
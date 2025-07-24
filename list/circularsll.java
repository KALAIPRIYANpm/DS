// package list;

class node{
    int data;
    node next;
}

class cll{
    node head;
    node tail;
    void insertFirst(int val){
        node newNode = new node();
        newNode.data = val;
        if(head==null){
            head=tail=newNode;
            tail.next=head;
        }
        else{
            tail.next = newNode;
            tail = newNode;
            tail.next=head;
        }
       
    }

    void display(){
        node temp = head;
        do{
            System.out.println(temp.data);
            temp = temp.next;
        }while(temp!=head);

    }
}

public class circularsll {
    public static void main(String[] args) {
       cll obj = new cll();
       obj.insertFirst(5);
       obj.insertFirst(10);
       obj.insertFirst(50);
       obj.display();
    }  
}

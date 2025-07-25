class node{
    node next;
    node prev;
    int data;
}

class cll{
    node head;
    node tail;
    void insertFirst(int val){
        node newnode = new node();
        newnode.data = val;
        if(head==null){
            head=tail=newnode;
            newnode.next = head;
            newnode.prev = tail;
        }
        newnode.prev = tail;
        newnode.next = head;
        tail.next = newnode;
        head.prev = newnode;
        head = newnode;
    }

    void insertLast(int val){
        node newnode = new node();
        newnode.data = val;
        if(head == null){
            head=tail=newnode;
            newnode.next = head;
            newnode.prev = tail;
        }else{
            newnode.next = head;
            newnode.prev = tail;
            tail.next = newnode;
            head.prev = newnode;
            tail = newnode;
        }
    }

    void deleteFirst(){
        if(head==null){
            System.out.println("Empty");
            return;
        }
        if(head==tail){
            head=tail=null;

        }else{
            head = head.next;
            head.prev = tail;
            tail.next = head;
        }
    }

    void deleteLast(){
        if(head==null){
            System.out.println("Empty list");
            return;
        }
        if(head==tail){
            head=tail=null;
            return;
        }
        tail.prev.next = head;
        tail=tail.prev;
        head.prev = tail;
    }

    void display(){
        if(head==null){
            // System.out.println();
            return;
        }
        node temp = head;
       do{
        System.out.println(temp.data);
        temp = temp.next;
       }while(temp!=head);
    }
}

public class circularDoubly {
    public static void main(String[] args) {
        cll obj = new cll();
        obj.insertFirst(2);
        obj.insertFirst(20);
        obj.insertFirst(30);
        // obj.deleteFirst();
        obj.deleteLast();
        obj.display();
    }
}

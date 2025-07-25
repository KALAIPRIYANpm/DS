class node{
    node next;
    int data;
}

class cll{
    node head;
    node tail;
    void insertFirst(int val){
        node NewNode = new node();
        NewNode.data = val;
        if(head==null){
            head=tail=NewNode;
            NewNode.next = head;
        }
        NewNode.next = head;
        head = NewNode;
        tail.next = NewNode;
    }

    void insertLast(int val){
        node NewNode = new node();
        NewNode.data = val;
         if(head==null){
            head=tail=NewNode;
        NewNode.next = head;
    }else{
        tail.next = NewNode;
        NewNode.next = head;
        tail = NewNode;
    }

    }

    void deleteFirst(){
        if(head==null){
            System.out.println("Empty");
            return;
        }else if(head==tail){
            head=tail=null;
        }else{
            head=head.next;
            tail.next = head;
        }
    }

    void deleteLast(){
        if(head==null){
            System.out.println("Empty");
            return;
        }
        else if(tail==head){
            head=tail=null;
            return;
        }
        else{
            node temp = head;
            while(temp.next!=tail){
                temp = temp.next;
            }
            temp.next = head;
            tail = temp;
            
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

public class circularLinkedList {
    public static void main(String[] args) {
        cll obj = new cll();
        obj.insertFirst(4);
        obj.insertFirst(5);
        obj.insertFirst(100);
        // obj.insertLast(100);
        obj.deleteLast();
        obj.display();
    
    }
}

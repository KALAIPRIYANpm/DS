// package list;
class node{
    int data;
    node next;
}

class ssl{
    node head = null;
    void InsertFirst(int val){
        node newNode = new node();
        newNode.data = val;
        newNode.next = head;
        head = newNode;
    }

    void InsertLast(int val){
        node Newnode = new node();
        Newnode.data = val;
        Newnode.next = null;     
        node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = Newnode;
    }

     void deleteFirst(){
        if(head==null){
            System.out.println("No list found");
            return;
        }
        if(head.next==null){
            head = null;
            return;
        }
        head = head.next;
    }

    void deleteLast(){
        node temp = head;
        while(temp.next.next!=null){
            temp = temp.next;
        }
        temp.next = null;
    }

    void insertPos(int val , int pos){
        node Newnode = new node();
        Newnode.data = val;
        if(pos==1){
            InsertFirst(val);
            return;
        }
        node temp = head;
        for(int i =1 ;i<pos-1;i++){
            temp = temp.next;
        } 
        Newnode.next = temp.next;
        temp.next = Newnode;
    }

    void deletePosition(int pos){
        if(pos==1){
           deleteFirst();
            return;
        }
        node temp = head;
        for(int i = 1;temp!=null && i<pos-1;i++){
            temp = temp.next;
        }
        if(temp==null){
            System.out.println("Maximum no.of size reached");
        }else
        {
            temp.next= temp.next.next;
        }

    }

    void display(){
        node temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}

public class linkedList {
    public static void main(String[] args) {
        ssl s = new ssl();
        s.InsertFirst(5);
        s.InsertFirst(50);
        s.InsertFirst(10);
        s.InsertLast(100);
        s.insertPos(10, 5);
        // s.deleteFirst();
        s.deletePosition(20);
        //  s.deleteFirst();
        //  s.deleteLast();
        s.display();
       
    }
}

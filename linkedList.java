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
        head = head.next;
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
         s.deleteFirst();
        s.display();
       
    }
}

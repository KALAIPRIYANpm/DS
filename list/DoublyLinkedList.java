// package list;

class node {
    int data;
    node next;
    node prev;
}

class Dll {
    node head = null;

    void insertFirst(int val) {
        node nn = new node();
        nn.data = val;
        nn.prev = null;
        if (head != null) {
            head.prev = nn;
        }
        nn.next = head;
        head = nn;
    }
    void insertLast(int val){
        if(head==null){
            insertFirst(val);
            return;
        }
        node nn = new node();
        nn.data = val;
        nn.next = null;
        node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = nn;
        nn.prev = temp;
    }
    

    void display() {
        node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}

public class DoublyLinkedList {
    public static void main(String[] args) {
        Dll obj = new Dll();
        obj.insertFirst(5);
        obj.insertFirst(10);
        obj.insertFirst(15);
        obj.insertLast(20);
        obj.display();
    }
}

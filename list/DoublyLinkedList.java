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
    
    void insertPos(int val , int pos){
        if(pos<1){
            System.out.println("enter a valid position");
            return;
        }
        node nn = new node();
        nn.data = val;
        if(pos==1){
            insertFirst(val);
            return;
        }
        node temp = head;
        for(int i = 1 ;temp!=null && i<pos-1; i++){
            temp=temp.next;
        }
        if(temp == null){
            System.out.println("You are out of Range.");
        }
            nn.next = temp.next;
            nn.prev = temp;
            if(temp.next!=null){
                temp.next.prev = nn;
            }
            
            temp.next = nn;
    }

    void deleteAtFirst(){
        if(head==null){
            System.out.println("List is Empty");
            return;
        }
        head = head.next;
        if(head!=null){
            head.prev = null;
        }
 }

 void deleteAtLast(){
    if(head==null){
        System.out.println("List is Empty");
        return;
    }
    if(head.next==null){
        head=null;
        return;
    }
    node temp = head;

    while(temp.next!=null){
        temp=temp.next;
    }
    temp.prev.next = null;
    temp.prev = null;
 }

 void deletePos(int pos){
    if(pos<1){
        System.out.println("Invalid");
        return;
    }
    if(pos==1){
        deleteAtFirst();
        return;
    }
    node temp = head;
    for(int i =1;temp!=null&&i<pos;i++){
        temp = temp.next;
    }
    if(temp==null){
        System.out.println("Out of Range");
        return;
    }
    temp.prev.next = temp.next;
    if(temp.next!=null){
         temp.next.prev = temp.prev;
    }
 }
    void display() {
        node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    void  desplay_rev(){
        node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        System.out.println("Reverse check");
        while(temp!=null){
            System.out.println(temp.data+" ");
            temp = temp.prev;
        }
    }
}

public class DoublyLinkedList {
    public static void main(String[] args){
        Dll obj = new Dll();
        obj.insertFirst(5);
        // obj.deleteAtFirst();
        obj.insertFirst(10);
        obj.insertLast(20);
        obj.insertPos(40, 3);
        obj.deletePos(1);
        obj.display();
        obj.desplay_rev();
    }
}

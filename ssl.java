class node{
    int data;
    node next;
}

class lnkedlist{
    node head;
    void insertFirst(int val){
        node NewNode = new node();
        NewNode.data = val;
        NewNode.next = head;
        head = NewNode;

    }

    void insertLast(int val){
        node NewNode = new node();
        NewNode.data = val;
        NewNode.next = null;
        node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = NewNode;
    }

    void deleteFirst(){
        if(head==null){
            System.out.println("Empty");
            return;
        }
        if(head.next==null){
            head=null;
        }
        head= head.next;

    }

    void deleteLast(){
        node temp = head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
    }

    void insertPos(int val,int pos){
        node NewNode = new node();
        NewNode.data = val;
        node temp =head;
        if(pos==1){
            insertFirst(val);
            return;
        }
        for(int i = 1;i<pos-1;i++){
            temp=temp.next;
        }
        NewNode.next = temp.next;
        temp.next = NewNode;
    }
    
    void deletePos(int pos){
        if(pos==1){
            deleteFirst();
            return;
        }
        node temp = head;
        for(int i = 1 ;temp!=null && i<pos-1;i++){
            temp = temp.next;
        }
        if(temp==null){
            System.out.println("Not determined");
        }
        else{
            temp.next = temp.next.next;
        }
    }

    void display(){
        node temp = head;
        while(temp!=null){
            System.out.println(temp.data+" ");
            temp=temp.next;
        }
    }
}

public class ssl {
    public static void main(String[] args) {
        lnkedlist l = new lnkedlist();
        l.insertFirst(2);
        l.insertLast(5);
        l.insertPos(50, 3);
        // l.deleteFirst();
        // l.deleteLast();
        l.deletePos(2);
        l.display();
        
    }
}

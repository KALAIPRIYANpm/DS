class node{
    node next;
    int data;
}

class queueOp{
    node front;
    node rear;
    void enqueue(int val){
        node newnode = new node();
    newnode.data = val;
    if(rear==null){
        front=rear=newnode;
        newnode.next=null;
        return;
    }
    newnode.next=null;
    rear.next=newnode;
    rear = newnode;
    }

    void dequeue(){
        if(front==null){
            System.out.println("No data");
            return;
        }
        front=front.next;
    }

    void peek(){
        if(front==null){
            System.out.println("Queue is Empty");
        }else{
            System.out.println("peek value is : "+front.data);
        }
    }

    void display(){
        node temp = front;
        while (temp!=null) {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}

public class queue {
    public static void main(String[] args) {
        queueOp obj = new queueOp();
        obj.enqueue(45);
        obj.enqueue(100);
        obj.peek();
        obj.display();

    }
    
}

class queue{
    int rear = -1;
    int front = 0;
    int[] arr = new int[5];

    void enqueue(int val){
        if(rear==4){
            System.out.println("Queue is Overflow");
        }else{
            arr[++rear] = val;
        }
    }

    void dequeue(){
        if(front>rear){
            System.out.println("Queue underflow");
            return;
        }
        front++;
    }

    void peek(){
        if(front>rear){
            System.out.println("Queue is Empty");
            return;
        }
        System.out.println("My peek value is"+arr[front]);

    }

    void display(){
        for(int i = front ; i<=rear;i++){
            System.out.println(arr[i]);
        }
    }
}


public class queuearr {
    public static void main(String[] args) {33
        queue obj = new queue();
        obj.enqueue(5);
        obj.enqueue(3);
        obj.enqueue(5);
        obj.dequeue();
        obj.peek();
        obj.display();
    }
}
  
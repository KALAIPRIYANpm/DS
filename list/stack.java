class node{
    int data;
    node next;
}

class stackop{
    node top;
    void insertFirst(int val){
        node Newnode = new node();
        Newnode.data = val;
        Newnode.next = top;
        top = Newnode;
    }

    void pop(){
        if(top==null){
            System.out.println("Stack underflow");
            return;
        }
        top = top.next;
    }
    void peek(){
        if(top==null){
            System.out.println("Stack is Empty");

        }else{
            System.out.println("Your top value is : "+top.data);
        }
    }

    void display(){
        node temp = top;
        // if(temp==null){
        //     System.out.println("Empty Stack");
        // }
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}

public class stack {
    public static void main(String[] args) {
        stackop obj = new stackop();
        obj.insertFirst(2);
        obj.insertFirst(3);
        obj.insertFirst(4);
        obj.peek();
        obj.pop();
        obj.display();
    }
}

class stack{
    int top = -1;
    int[] arr = new int[5];
    void push(int val){
        if(top==4){
            System.out.println("Stack Overflow");
        }
        else{
           arr[++top] = val;
        }
    }

    void pop(){
        if(top==-1){
            System.out.println("Stack overflow");
            return;

        }else{
            top--;
        }
    }

    void peek(){
        if(top==-1){
            System.out.println("Stack is empty");
            return;
        }System.out.println("Your top element is "+arr[top]);
    }
    void display(){
        for(int i = 0;i<=top;i++){
            System.out.println(arr[i]);
        }
    }
}

public class stackarr {
    public static void main(String[] args) {
        stack obj = new stack();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.peek();
        obj.display();
    }
}


class poly{
    void polyDisplay(int a , int b){
        System.out.println(a+b);
    }void polyDisplay(String name){
        System.out.println(name);
    } void polyDisplay(double a1 , double a2){
        System.out.println(a1+a2);
    }
//overloading
}
public class polymorphism {
    public static void main(String[] args) {
        poly obj = new poly();
        obj.polyDisplay(5,2);
        obj.polyDisplay("Kalaipriyan");
        obj.polyDisplay(10.12,11.11);
    }
}

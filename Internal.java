public class Internal {

    class External {
        class InnerInternal {
            void display() {
                System.out.println("Kalaipriyan");
            }
        }
    }
    
    public static void main(String[] args) {
        Internal outer = new Internal(); 
        Internal.External mid = outer.new External(); 
        External.InnerInternal inner = mid.new InnerInternal();
        inner.display();
    }
}




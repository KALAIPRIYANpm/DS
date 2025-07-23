public class Person {
    private String name;

    public void setName(String newName) {
        name = newName;
    }
    public String getName() {
        return name;
    }
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Kalaipriyan");
        System.out.println("Name is:" + p.getName());
    }
}
/*overloading and overriding consisit of differst */
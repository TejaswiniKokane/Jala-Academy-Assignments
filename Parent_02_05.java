class Parent_02_05 {
    String name = "Tejaswini";

    Parent_02_05() {
        System.out.println("This is parent class constructor");
    }
}


class Child_02_05 extends Parent_02_05 {
    String name = "Jala";

    Child_02_05() {
        
        super();
        System.out.println("This is child class constructor");
    }

    void myMethod() {
       
        System.out.println("My name is " + super.name);
    }
}

class CallUsingSuper {
    public static void main(String[] args) {
        Child_02_05 c = new Child_02_05();
        c.myMethod();
    }
}
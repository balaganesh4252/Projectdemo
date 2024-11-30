class Grandfather{
     void show(){
        System.out.println("Grandfather show");
     }
}

class Father extends Grandfather{
    void sound(){
        System.out.println("Father sound");
    }
}

class Child extends Father{
    void base(){
        System.out.println("Child base");
    }
}

public class Multilevelinheritance {
    public static void main(String[] args) {
        Child obj=new Child();
        obj.base();
        obj.sound();
        obj.show();  // all the three methods 
    }
}

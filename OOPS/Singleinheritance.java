class A{
    void show(){
        System.out.println("A show");
    }
}

class B extends A{
    void sound(){
        System.out.println("B sound");
    }
}

class C extends A{
    void show(){
        System.out.println("C show");
    }
}
public class Singleinheritance {
    public static void main(String[] args) {
        B obj =new B();
        obj.show(); //prints A show
        obj.sound(); //prints B sound

        C obj1=new C();
        
        //overrides the parent class method by child class if they have same name method
        obj1.show(); //prints C show 


    }
}

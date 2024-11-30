class A{
    void show1(){
        System.out.println("A");
    }
}
class B extends A{
    void show2(){
        System.out.println("B");
    }
}
class C extends A{
    void show3(){
        System.out.println("C");
    }
}
class D extends B{
    void show4(){
        System.out.println("D");
    }
}

public class Hybridinheritance {
    public static void main(String[] args) {
        
        D obj=new D();
        obj.show1();
        obj.show2();
        obj.show4(); // Hybrid inheritance
    }
}

abstract class Abstractex{// both abstract and non abstract methods
    void show(){
        System.out.println("Abstract defined method"); //defined method
    }
    abstract void sound();   //abstract method which is only declared and defined in future and used
    abstract String name(); //abstract method that is having the return types it is used to store in case of obj
}
class B extends Abstractex{
    void sound(){
        System.out.println("Abstract declared method");  // here if we inherited the above parent class 
                                                           // that abstract method should be defined now otherwise 
                                                           // it shows error in java 7 but not in Java 8
    }
    String name(){
        return "Bala";   // in storing of objects  then it directly stores the value in it
    }
}
public class Abstract { 
    public static void main(String[] args) {
        B obj=new B();
        obj.show();
        obj.sound();
    }
}

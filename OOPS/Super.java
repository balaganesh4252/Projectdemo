class A{
      public A(){
        System.out.println("This is A Default Constructor");
      }
      public A(int n){
        System.out.println("This is A "+"Parametrised Constructor");
      }
}
class B extends A{  // for default constructor calling using indirect super keyword
    public B(){
        System.out.println("This is B Default Constructor");
    }
    public B(int n){
        System.out.println("This is B "+"Parametrised Constructor");
    }
}

class C extends A{  // for Parameter constructor calling using super keyword with parameter
    public C(){
        System.out.println("This is C Default Constructor");
    }
    public C(int n){
        super(n);
        System.out.println("This is C "+"Parametrised Constructor");
    }
}

public class Super {
    public static void main(String[] args) {
        B obj=new B();  // prints both This is A Default Constructor, This is B Default Constructor

        //Here it calls the super class constructor indirectly of default constructor
        B obj1=new B(25); // prints This is A Default Constructor, This is B Parameterised Constructor


        C obj2=new C();  // prints both This is A Default Constructor, This is C Default Constructor

        //Here it calls the super class constructor of parameter constructor
        C obj3=new C(25); // prints This is A Parameterised Constructor, This is C Parameterised Constructor
    }
}

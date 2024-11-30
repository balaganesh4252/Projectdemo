//JAVA 7

interface A{
   void show();   // inbuilt they are in public abstract function
}
interface B{
    void show();  // interface variable are like final,static, private
}

class check implements A,B{
    public void show(){
        System.out.println("show");
    }  
}


public class Multipleinheritance{
    public static void main(String[] args) {
        check obj=new check();
        obj.show(); //prints show it overirdes the data in child class because interfaces dont have body
        // but for class it having the different body so not possible in clases and cause diamond problem as they say
        //there is no perfect reason why it doesnt happens as for we can us the abstarct classes and do the same why it doesnt happens
        //multiple inheritance.  check for example of AbstractMultipleinheritance
    }
}

class X{
    void show1(){
        System.out.println("X");
    }
}
class Y{
    void show1(){
        System.out.println("Y");
    }
}

// class Z extends X,Y{   // here righting syntax also it causes error for multiple inheritance
                          // not designed solution for classes
//      void show1(){
//         System.out.println("child");
//      }
// }


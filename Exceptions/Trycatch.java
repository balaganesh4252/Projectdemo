import java.util.*;


class Exceptiontypes{
   void CheckedExceptions(){ // at Compile time it occurs  and Handling Required
    //1.I/O Exception
    //2.SQL Exception
    //3.ClassNotFoundException
   }
   void UnCheckedExceptions(){ // at Runtime it occurs  and Handling Optional
    //1.ArithmeticException
    //2.NullPointerException
    //3.ArrayIndexOutOfBoundsException
    //4.RuntimeException
    //5.ClassCastException
   }
}

public class Trycatch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        try{       // we can use must one of catch or finally follwed by the try
                   // try -> raises the Exceptions only
               System.out.println(m/n);
        }
        catch(ArithmeticException e){    // it is used to dispaly the type of message or like hint or warning
                System.out.println(e.getMessage());
        }
        catch(Exception e1){            // if it is not included no error in code that we cant check where the mistake
            System.out.println(e1.getMessage());
        }
        finally{       // just give an msg if exception raises or not raised.
            System.out.println("finally it is works with or without exception");
        }

        // for multiple try-catch blocks it should be in sequential only like 
        //try-catch try-catch..


        sc.close();
    }
}

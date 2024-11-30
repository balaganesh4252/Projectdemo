public class Throw {
    public static void main(String[] args) {
        try{
            divide(10,0); // it is used for customised conditioned exception and message handling
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static  void divide(int n1,int n2){
       if(n2==0){ //it is used to have customised exception that we write own message
                  // we should declare which type of exception here it is belongs to
        throw new ArithmeticException("It is an Arithmetic Exception");
       }
       System.out.println(n1/n2);;

    }
}

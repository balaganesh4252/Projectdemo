public class Throws {

    public static void checks(int arr[])throws ArrayIndexOutOfBoundsException{
     if(arr.length!=2){
        throw new ArrayIndexOutOfBoundsException("It is ArrayIndexexception ");
     }
     System.out.println(arr[1]);
    }
    public static void main(String[] args) {
        try{
            int arr[]={0,2,3};
            checks(arr);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}

class Constructorex{
    public Constructorex(){
        System.out.println("Non Parameterised Constructor");
    }
    public Constructorex(String name){
        System.out.println("This is "+name+" Constructor");
    }
}
class Constructor {
    public static void main(String[] args) {
        Constructorex obj=new Constructorex(); //prints -> Non Parameterised Constructor
        Constructorex obj1=new Constructorex("Parameter"); //prints -> This is Parameter Constructor
    }
}
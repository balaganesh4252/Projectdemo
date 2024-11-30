import java.util.*;
public class Ex2{
    public static void main(String args[]){
     List<Person>ls=Arrays.asList(
        new Person(12,"Bala"),new Person(34,"Gopal"),new Person(32, "Prasanna")
     );
      Collections.sort(ls);//asc
                          //desc sort(ls,Collection.reverseOrder())
     ls.forEach(n->System.out.println(n.getAge()+" "+n.getName()));

     System.out.println();
     List<Bank>bls=Arrays.asList(
        new Bank(22,"Prasanna"), new Bank(12,"Bala"),new Bank(34,"Gopal"),new Bank(32, "Prasanna")
     );
     Collections.sort(bls,new Accorder1());
     bls.forEach(n->System.err.println(n.getAcc()+" "+n.getName()));
    }
}
class Person implements Comparable<Person>{  //internally in a class with a single field sorting
    int age;
    String name;
    public Person(int age,String name){
        this.age=age;
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    @Override
    public int compareTo(Person other){
        // if(age>other.age)return 1;
        // if(age<other.age)return -1;
        // return 0;
        return Integer.compare(age,other.age);
    }
}

class Bank{
    int acc;
    String name;
    public Bank(int acc,String name){
        this.acc=acc;
        this.name=name;
    }

    public int getAcc(){
        return acc;
    }
    public String getName(){
        return name;
    }
}

class Accorder implements Comparator<Bank>{
    @Override
    public int compare(Bank b1,Bank b2){
    // if(b1.getAcc()>b2.getAcc()) return 1;
    // if(b1.getAcc()<b2.getAcc()) return -1;
    // return 0;
    int c=Integer.compare(b1.getAcc(), b2.getAcc());
    return c;
}
}

class Accorder1 implements Comparator<Bank>{
    @Override
    public int compare(Bank b1,Bank b2){
    // if(b1.getAcc()>b2.getAcc()) return 1;
    // if(b1.getAcc()<b2.getAcc()) return -1;
    // return 0;
    int c=Integer.compare(b1.getAcc(), b2.getAcc());
    return c==0?b1.getName().compareTo(b2.getName()):c;
}
}
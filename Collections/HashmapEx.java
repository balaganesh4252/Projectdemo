import java.util.*;
public class HashmapEx {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //input datatype can be Integer,Long,Float,Double,String,any arraylist of class obj,Arraylist of list..
        HashMap<String,Integer> map=new HashMap<>(); 

        //mainly used for frequencies, key value pair,.
        //adding key value pair as
        //for counting frequncies
        for(int i=1;i<5;i++){
          String str=sc.nextLine();
          if(!map.containsKey(str)){    //return boolean for checking the condition as using containskey() as key is unique
                                        // we can check value also as containsValue()
            map.put(str,1); //put the key value pair as key(str) and value as frequncy 1
          }else{
              map.put(str,map.get(str)+1);  //get(Key)  used to retrieve the key mapped value, 
                                            //inthis way it increases frequency

          }

        }

        //size() for no of unique key value pairs
        System.out.println(map.size());

        // for printing hashmap key pairs easily by order can be different 
        System.out.println(map);
        
        //separate key values
        for(String i:map.keySet()){
            System.out.println(i);
        }

        //separate values 
        for(Integer i:map.values()){
            System.out.println(i);
        }

        //for traversing full hashmap with both key and valuepair
        //<Datatypes as mentioned above> 
        //e is variable name to used and it stores the one key value pair in each iteration of map
        for(Map.Entry<String,Integer> e:map.entrySet()){
              //getKey() ->key, getValue()->value
              System.out.println(e.getKey()+" : "+e.getValue()); 
        }
        
        HashMap<String,Integer>map1=(HashMap<String,Integer>)map.clone();
        map.clear(); //to clear
     
        //remove(key)  returns integer like a pop that returns key's value otherwise null if not present
        int s=map1.remove("Bg");
        System.out.println("removed key value "+s);
        //remove(key,value)  return boolean for checking that is present(removes and true) or not (false)
        boolean s1=map1.remove("Bala",2);
        System.out.println("removed "+ s1);

        
        //easy frequency by getOrDefault method
        for(int h=0;h<5;h++){
            String t=sc.nextLine();
            map.put(t,map.getOrDefault(t,0)+1);
        }
       
        //for replacing a key's value
        map.replace("Bala",3);
        System.out.println(map);
    }
}

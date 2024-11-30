import java.util.*;
public class ArrayListEx{
    public static void main(String[] args) {
        ArrayList<Integer>ls=new ArrayList<>(); //no fixed size and for size ->ls.size()

        //for adding the elements in to the arraylist we use add
        // add with add(element)->adds the element at end of arraylist
        //add with add(index,element)->adds at particular index
        //for replacing the value we use set->set(index,element) in the arraylist
        // for adding all the elements of another list into this arraylist1 for storing using list1.addAll(list2)
        ls.add(81);
        ls.add(37);
        ls.add(1,22);
        ls.set(2,24);
        ls.addAll(ls);

        //for printing arraylist w ecan directly print the arraylist by ls 
        System.out.println(ls);

        // or we can use forEach case using below syntax
        for(Integer i: ls) {  // syntax as (Arraylist Datatype variablename : arraylist)
            System.out.println(i);
        }

        //for removing an element using the index and element value also
        //1. if data is in string ->ls.remove(index) or ls.remove(string value) -->no confusion
        //2. if data is in integer -> ls.remove(any integer) first it checks for index value then remove it 
        //otherwise for value of list should pass as an object of that datatype Integer.valueOf().
       

        ls.remove(1); //directly removes the index place 1 value as 2 
        ls.remove(Integer.valueOf(81)); // no index matches with 4 so, it removes the value of 4 
       
        System.out.println(ls);

        //for getting that values using the index only by using get(index)
        System.out.println(ls.get(0));

        // checks for the element contains or not using ls.contains() ->return boolean
        // checks for all the elements are same or not using equals return boolean
        if(ls.contains(24)){
            System.out.println("Success");
        }
        
        // for getting index of given element using ls.indexOf()
        int d=ls.indexOf(24);
        System.out.println("value "+d);

        //clons the list into another but we should typecast with below syntax
        ArrayList<Integer>ls1=(ArrayList<Integer>)ls.clone();

        ls.clear();//clears all the data in the list
        if(ls.isEmpty()){
            System.out.println("it is cleared");
        }
        System.out.println(ls1);

        //for sorting these data with these integer using three ways for ascending order
        ls1.sort((p1,p2)->Integer.compare(p1, p2));  //java 8+ lambda +functional programming
                                                     // for descending Integer.compare(p2,p1)
        ls1.sort(Comparator.naturalOrder());         // for descending Comparator.reverseOrder()
        ls1.sort(Comparator.comparingInt(Integer::intValue)); // for reverse .reversed()
                                                     // for string String::toString
        //or
        Collections.sort(ls1); 
    }
}
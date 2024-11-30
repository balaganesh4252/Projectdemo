import java.util.*;
import java.util.stream.*;
public class Ex1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer>ls=new ArrayList<>(Arrays.asList(1,5,4,7,67,9));

        Stream<Integer>st=ls.stream(); //it doesnt stores the data , it just refernce the data 
        int maxvalue=st.mapToInt(n->n).max().orElse(Integer.MAX_VALUE); //process the data only when terminal op is invoked
        System.out.println("max value : "+maxvalue);    //it start execution when it has the terminal operation and flow start from 
                                         //backwards only to data source

        //it causes error due to stream reused                                
        //int minvalue=st.mapToInt(Integer::intValue).min().orElse(Integer.MIN_VALUE); 
        
        //mapToInt is used to convert the integer objects to the primitive types datatypeStream(intStream)
        //then only those have the some aggregate fun like min(),max(),sum(),average() -> makes faster exn.
        int minvalue=ls.stream().mapToInt(Integer::intValue).min().orElse(Integer.MIN_VALUE);
        //orElse is like an solving the nullpointer exception it used the Optional type is null is the value 
        // so we define the default mesage if doesnt contain any value

        System.out.println("min value : "+minvalue);

        int sumof=ls.stream().mapToInt(n->n).sum();
        System.out.println("sum using mapToInt and sum : "+sumof);

        //or we can use map & reduce operations
        int sum1=ls.stream().map(n->n).reduce(0,(prev,present)->prev+present);
        System.out.println("using map and reduce : "+sum1);

        //count the elements
        long count=ls.stream().count();
        System.out.println("count : "+count);

        //avg using above 
        System.out.println("avg using above values : "+ (double)sumof/count);


        //using map and reduce ->return double 
        double avg=ls.stream().map(n->(double)n/(ls.size())).reduce((double)0,(p,pr)->p+pr);
        System.out.println(avg);

        //using mapToInt and average
        double avg1=ls.stream().mapToInt(n->n).average().orElse(0);
        System.out.println(avg1);
        
        //using mapToDouble and average
        double avg2=ls.stream().mapToDouble(Integer::doubleValue).average().orElse(0); //mapToDouble(n->(double)n)
        System.out.println(avg2);

        
        //using forEach as it is terminal op for printing
        ls.stream().forEach(System.out::println); //consumer FI
        
        //printing second or n maximum value
        System.out.println("enter which max value : ");
        int user=sc.nextInt();
        int nmax=ls.stream().map(n->n).sorted(Comparator.reverseOrder()).skip(user-1).findFirst().orElse(Integer.MAX_VALUE);
        System.out.println(user+"th maximum is : "+nmax);

        //find the maximum even number using filter
        int maxeven=ls.stream().filter(n->n%2==0).sorted(Comparator.reverseOrder()).findFirst().orElseThrow(()-> new ArrayIndexOutOfBoundsException("no even elements"));
        System.out.println(maxeven);

        //storing all the odd numbers in an list
        List<Integer> oddlsit=ls.stream().filter(n->n%2==1).collect(Collectors.toList());
        System.out.println(oddlsit);


        // map creates a stream of streams.
        // flatMap creates a single stream from multiple streams. used for collection of collections
        //Stream.of() is used to create a streams by taking the input or we can do using list.stream() also
        List<Integer>ls1=Stream.of(Arrays.asList(1,4,5),Arrays.asList(5,2,1),Arrays.asList(9,3,23,4))
                        .flatMap(list->list.stream()).distinct().collect(Collectors.toList());
                         //or Collection::stream
        System.out.println(ls1);
    }
}
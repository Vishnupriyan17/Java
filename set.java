import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class set {
    public static void main(String[] args) {
        //Hashset will not allow duplicate elements and also does not print the values in sorted format
        //syntax:
          Set<Integer> nums = new HashSet<Integer>();
          nums.add(45);
          nums.add(55);
          nums.add(65);
          nums.add(25);

        System.out.println(nums);

        //      o/p:  [65, 55, 25, 45]

          //if we want to sort the input we can use TreeSet
          Set<Integer> num = new TreeSet<Integer>();
          num.add(33);
          num.add(12);
          num.add(2);
          num.add(89);

        System.out.println(num);

        //      o/p: [2, 12, 33, 89]

        //if want the o/p in line by line we want use for loop also we can use iterator which is in the interface iterable(in the top of the collection)
        Iterator<Integer> values = num.iterator();

        //now we cant use for loop coz we dont know how namy times the lop should run,so we use while loop
        while (values.hasNext()) //hashnext is the fun which identify there is next element or not
        {
                System.out.println(values.next());  //in this if there is next value it print the next value
        }
        /*    o/p:  2
                    12
                    33
                    89   */
        
    }
}

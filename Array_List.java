import java.util.ArrayList;
import java.util.Collection;  //these are the package we want to use when we are with collections
import java.util.List;

public class Array_List {
    public static void main(String[] args) {
          
        //collection API is an interface which containts the more concepts like set,linkedlist,map,arraylist

        //if we want to print the elements in the array by using their index we are recommended to use list
        //if we are just print the values in the arraylist without using their index we can use collections

        Collection <Integer> nums = new ArrayList<Integer> ();
        nums.add(14);
        nums.add(45);
        nums.add(56);

        //if we want to print the value we can print it in sout
        System.out.println(nums);
        //o/p:[14, 45, 56]

        //if we want to print it in line by line we use enhanced for loop,normal loop doesn't work becoz collections dont have index
        for(int n:nums)
        {
            System.out.println(n);
        }
        /*   o/p"
        14
        45
        56 */

        //suppose we want to use the index value wecan use list
        List<Integer> num = new ArrayList<Integer>();
        num.add(23);
        num.add(90);
        num.add(76);
        num.add(56);

        //print the values using their index
        System.out.println(num.get(3));  //get is the method used for access the value using index

        //   o/p:56-(value of index 3)
        System.out.println(num.indexOf(90));   //this method is used to show the index by using values
        //    o/p:1-(index of value 90)
    }
}

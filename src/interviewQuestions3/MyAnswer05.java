package interviewQuestions3;
// Part1:
// Create an arraylist of Strings
// add - "Red", "Green", "Blue", "Yellow" and "Black" inside
// print out all the elements, each element on new line

// Part2:
// Create a method that accepts a String arraylist and a String as parameters
// method should add the element at the first index of arraylist

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Part3:
// Create a method that accepts a String arraylist and a String as parameters
// it should add element before last element
// ex:  [1, 2, 3]  -> [1, 2, 4, 3]
public class MyAnswer05 {
    public static void main(String[] args) {
        List<String> arr=new ArrayList<>(Arrays.asList("Red","Green","Blue","Yellow","Black"));
        for (String w:arr){
            System.out.println(w);
        }
       // addElement(arr,"white");
        addBeforeLastElement(arr,"brown");
    }
    public static void addElement(List<String> arr,String str){
        arr.add(0,str);
        System.out.println(arr);
    }
    public static void addBeforeLastElement(List<String> arr,String str){
        arr.add(arr.size()-1,str);
        System.out.println(arr);

    }
}

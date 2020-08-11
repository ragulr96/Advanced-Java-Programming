package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericMethods {

    static Character[] charArray = {'A', 'B', 'C'};
    static Integer[] intArray = {1, 5, 8, 10};
    static Boolean[] boolArray = {true, false, false};

    //Iterates through all the objects of an array and adds toa list
    //This is possible because in Java object is a parent type of any other object type
    //Downside is that this can evade type checks while compiling
    public static List arrayToList(Object[] array, List<Object> list) {
        for(Object object: array) {
            list.add(object);
        }
        return list;
    }


    public static <T> List<T> improvedArrayToList(T[] array, List<T> list) {
        for(T object: array) {
            list.add(object);
        }
        return list;
    }

    public static void main(String[] args) {

        List<Character> charList = arrayToList(charArray, new ArrayList<>());
        List<Integer> intList = arrayToList(intArray, new ArrayList<>());
        List<Boolean> boolList = arrayToList(boolArray, new ArrayList<>());
        List<Boolean> uncheckedList = arrayToList(intArray, new ArrayList<>()); //Doesn't get type checked

        System.out.println(charList);
        System.out.println(intList);
        System.out.println(boolList);

        //List<Boolean> checkedList = improvedArrayToList(intArray, new ArrayList<>()); //Compilation error shows up. Better coz gets type checked

    }

}

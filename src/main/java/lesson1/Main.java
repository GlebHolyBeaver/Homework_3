package lesson1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        swap(5, 1, 3);
        arrayToString(5);
        Box<Apple> box1 = new Box<>();
        Box<Orange> box2 = new Box<>();
        Box<Orange> box3 = new Box<>();
        box1.add(new Apple());
        box1.add(new Apple());
        box1.add(new Apple());
        box2.add(new Orange());
        box2.add(new Orange());
        box3.add(new Orange());
        System.out.println(box1.getWeightFruit());
        System.out.println(box2.getWeightFruit());
        System.out.println(box3.getWeightFruit());
        System.out.println(box1.compare(box2));
        box2.remote(box3);
        System.out.println(box2.getWeightFruit());
        System.out.println(box3.getWeightFruit());
        System.out.println(box3.compare(box2));


    }

    private static void swap(int arrayLength, int arrayValue1, int arrayValue2){
        int array[] = new int[arrayLength];
        for ( int i = 0; i < array.length; i++){
            array[i] = i;
            System.out.print(" " + array[i]);
        }
        System.out.println();
        int a = array[arrayValue1];
        int b = array[arrayValue2];
        array[arrayValue1] = b;
        array[arrayValue2] = a;
        for ( int i = 0; i < array.length; i++){
            System.out.print(" " + array[i]);
        }
        System.out.println();
    }

    private static void arrayToString(int arrayLength){
        String array[] = new String[arrayLength];
        List<String> listOfStrings = new ArrayList<>();
        listOfStrings = Arrays.asList(array);;
    }
}

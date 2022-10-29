import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String args[]) {
//        Long[] array1 = {2L,3L,4L};
//        printArray(array1);

//        Box<Integer> box1 = new Box<Integer>(2);
//        Box<String> box2 = new Box<String>("jo");
//
//        System.out.println(box1.getField());
//        System.out.println(box2.getField());


//        int intnumber = 1001;
//        byte shortnumber = (byte) intnumber;                                             //castingi tipis dayvana
//        System.out.println(shortnumber);


//    public static <T> void printArray(T[] array){                                //generics
//        for(int i =0; i<array.length;i++){
//            System.out.println(array[i]);
//
//

        animal animal1 = new animal();
        animal1.eat();
        

        for (animal a : getanimals()) {
            a.eat();
        }
    }


        public static List<animal> getanimals() {
            List<animal> animals = new ArrayList<>();
            dog dog1 = new dog();
            cat cat1 = new cat();
            animals.add(dog1);
            animals.add(cat1);
            return animals;
        }


}


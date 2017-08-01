import java.util.*;
public class Exceptions {
    public static void main(String[] args){
        ArrayList<Object> myList = new ArrayList<>();
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");

        for (int i = 0; i < myList.size(); i ++){
            try{
                Integer castedValue = (Integer) myList.get(i);
                myList.set(i, castedValue);
            }
            catch (ClassCastException e){
                System.out.printf("ERROR ON INDEX {%d} %n", i);
                System.out.println("trying to cast  " + myList.get(i));
                System.out.println(e.getMessage());
            }
        }



//      to prevent compiling
//        ArrayList<Integer> myList = new ArrayList<>();
//        myList.add("13");
//        myList.add("hello world");
//        myList.add(48);
//        myList.add("Goodbye World");

    }
}

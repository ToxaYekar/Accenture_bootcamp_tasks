package Day4;
import java.util.*;

public class Collections_tasks {

    // Tasks using ArrayList
    public static void ArrayListExercise10() {
        List<String> ArrayList = new ArrayList<String>();
        ArrayList.add("Red");
        ArrayList.add("Purple");
        ArrayList.add("Yellow");
        ArrayList.add("Cyan");
        ArrayList.add("Black");
        System.out.println("List before shuffling: " + ArrayList);
        Collections.shuffle(ArrayList);
        System.out.println("List after shuffling: " + ArrayList);
        System.out.println("______________________________________");
    }
    public static void ArrayListExercise12() {
        List<String> ArrayList = new ArrayList<String>();
        ArrayList.add("Red");
        ArrayList.add("Purple");
        ArrayList.add("Yellow");
        ArrayList.add("Cyan");
        ArrayList.add("Black");

        System.out.println("Original list: " + ArrayList);
        List<String> sub_List = ArrayList.subList(0, 2);
        System.out.println("Portion of the list: " + sub_List);
        System.out.println("______________________________________");
    }
    public static void ArrayListExercise15() {
        List<String> ArrayList = new ArrayList<String>();
        ArrayList.add("Red");
        ArrayList.add("Purple");
        ArrayList.add("Yellow");
        ArrayList.add("Cyan");
        ArrayList.add("Black");
        System.out.println("First list: " + ArrayList);

        List<String> ArrayList2 = new ArrayList<String>();
        ArrayList.add("Orange");
        ArrayList.add("Violet");
        ArrayList.add("Blue");
        ArrayList.add("Green");
        ArrayList.add("White");
        System.out.println("Second list: " + ArrayList2);

        List<String> BigArrayList = new ArrayList<String>();
        BigArrayList.addAll(ArrayList);
        BigArrayList.addAll(ArrayList2);
        System.out.println("Big ArrayList:" + BigArrayList);
        System.out.println("______________________________________");
    }

    // Tasks using LinkedList
    public static void LinkedListExercise10() {
        LinkedList<String> LinkedList = new LinkedList<String>();
        LinkedList.add("Red");
        LinkedList.add("Purple");
        LinkedList.add("Yellow");
        LinkedList.add("Cyan");
        LinkedList.add("Black");

        System.out.println("List: " + LinkedList);

        Object firstElement = LinkedList.getFirst();
        System.out.println("First Element of LinkedList: " + firstElement);


        Object lastElement = LinkedList.getLast();
        System.out.println("Last Element of LinkedList: "+ lastElement);
        System.out.println("______________________________________");
    }
    public static void LinkedListExercise12() {
        LinkedList<String> LinkedList = new LinkedList<String>();
        LinkedList.add("Red");
        LinkedList.add("Purple");
        LinkedList.add("Yellow");
        LinkedList.add("Cyan");
        LinkedList.add("Black");
        System.out.println("List:" + LinkedList);
        LinkedList.remove(3);
        System.out.println("List after removing an element: " + LinkedList);
        System.out.println("______________________________________");
    }
    public static void LinkedListExercise15() {
        LinkedList<String> LinkedList = new LinkedList<String>();
        LinkedList.add("Red");
        LinkedList.add("Purple");
        LinkedList.add("Yellow");
        LinkedList.add("Cyan");
        LinkedList.add("Black");
        System.out.println("List:" + LinkedList);

        Collections.swap(LinkedList,2,3);
        System.out.println("List after swap:" + LinkedList);
        System.out.println("______________________________________");
    }

    // Tasks using HashSet
    public static void HashSetExercise10() {
        HashSet<String> HashSet = new HashSet<String>();
        HashSet.add("Red");
        HashSet.add("Purple");
        HashSet.add("Yellow");
        HashSet.add("Cyan");
        HashSet.add("Black");

        HashSet<String> HashSet2 = new HashSet<String>();
        HashSet2.add("Orange");
        HashSet2.add("Violet");
        HashSet2.add("Red");
        HashSet2.add("Green");
        HashSet2.add("Black");

        for (String element : HashSet) {
            System.out.print(HashSet2.contains(element) ? "Yes " : "No ");
        }
        System.out.println();
        System.out.println("______________________________________");
    }
    public static void HashSetExercise12() {
        HashSet<String> HashSet = new HashSet<String>();
        HashSet.add("Red");
        HashSet.add("Purple");
        HashSet.add("Yellow");
        HashSet.add("Cyan");
        HashSet.add("Black");
        System.out.println("HashSet: " + HashSet);
        HashSet.clear();
        System.out.println("HashSet after cleaning:" + HashSet);
        System.out.println("______________________________________");
    }

    // Task using TreeSet
    public static void TreeSetExercise12() {
        TreeSet <Integer> TreeSet = new TreeSet<Integer>();

        TreeSet.add(227);
        TreeSet.add(300);
        TreeSet.add(52);
        TreeSet.add(36);
        TreeSet.add(50);
        TreeSet.add(12);
        TreeSet.add(56);
        TreeSet.add(199);
        TreeSet.add(100);

        System.out.println("Strictly greater than 12 : "+TreeSet.higher(12));
    }

    public static void main(String[] args) {
        System.out.println("TASKS USING ARRAY LIST");
        ArrayListExercise10();
        System.out.println();
        ArrayListExercise12();
        System.out.println();
        ArrayListExercise15();

        System.out.println("TASKS USING LINKED LIST");
        LinkedListExercise10();
        System.out.println();
        LinkedListExercise12();
        System.out.println();
        LinkedListExercise15();

        System.out.println("TASKS USING HASHSET");
        HashSetExercise10();
        System.out.println();
        HashSetExercise12();
        System.out.println();

        System.out.println("TASK USING TREE SET");
        TreeSetExercise12();
    }
}

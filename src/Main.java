import java.util.*;

public class Main {
    public static void main(String[] args) {
        //  Collection - интерфейс
        // Collections - класс
        //Collections.binarySearch()
        // Collections.sort();

        // List-ы (Списки) - интерфейс
        // Реализации (Классы): ArrayList, LinkedList, Stack, Queue

        // Set-ы (множества) - множества
        // Реализации (Классы): TreeSet, HashSet

        // Map-ы (словари - пары: ключ-значение)
        // Не коллекция!!!
        // Реализации: Hashtable, HashMap, LinkedHashMap, TreeMap

        ArrayList arrayList = new ArrayList();
        List arrayList2 = new ArrayList();
        Collection arrayList3 = new ArrayList();

        arrayList.add(0);
        arrayList.add("sdfasdfasd");
        arrayList.add(new Object());

      //  int a = (int)arrayList.get(1);

        ArrayList<String> arrayList1 = new ArrayList<>();
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(333);

        //Collections.sort(integerArrayList);
        //Collections.binarySearch();

        //int[] b = {31234,3,3,23,3};
        //Arrays.sort();
        //Arrays.binarySearch();

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("sdfsdf");
        linkedList.add("sdfkskf");

        // добавление, удаление, поиск

        ArrayList<Integer> arrList = new ArrayList<>();
        LinkedList<Integer> lnkList = new LinkedList<>();

        long start = System.nanoTime();
        for(int i=0; i<100000; i++) {
            arrList.add(0,i);
        }
        long end = System.nanoTime();
        System.out.println("ArrayList add to begin: "+(end-start));

        start = System.nanoTime();
        for(int i=0; i<100000; i++) {
            lnkList.add(0,i);
        }
        end = System.nanoTime();
        System.out.println("LinkedList add to begin: "+(end-start));


        start = System.nanoTime();
        for(int i=30000; i<60000; i++) {
            arrList.get(i);
        }
        end = System.nanoTime();
        System.out.println("ArrayList get middle: "+(end-start));

        start = System.nanoTime();
        for(int i=30000; i<60000; i++) {
            lnkList.get(i);
        }
        end = System.nanoTime();
        System.out.println("LinkedList get middle: "+(end-start));

        start = System.nanoTime();
        for(int i=0; i<30000; i++) {
            arrList.add(i);
        }
        end = System.nanoTime();
        System.out.println("ArrayList add to the end: "+(end-start));

        start = System.nanoTime();
        for(int i=0; i<30000; i++) {
            lnkList.add(i);
        }
        end = System.nanoTime();
        System.out.println("LinkedList add the end: "+(end-start));

        // Stack
        // LIFO - Last In First Out

        // Queue
        // FIFO - First In First Out

        Stack<String> stack = new Stack<>();
        Queue<String> queue = new ArrayDeque<>();
        String[] str = {"1","2","3","4","5"};
        for(String s: str) {
            stack.push(s); // добавляем в конец стека
            queue.offer(s);
        }
        while(!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();
        while(!queue.isEmpty()) {
            System.out.print(queue.poll() + " ");
        }


    }
}
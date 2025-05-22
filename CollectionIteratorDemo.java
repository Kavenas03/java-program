import java.util.*;

public class CollectionIteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        System.out.println("ArrayList:");
        Iterator<String> arrayListIterator = arrayList.iterator();
        while (arrayListIterator.hasNext()) {
            System.out.println(arrayListIterator.next());
        }

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Dog");
        linkedList.add("Elephant");
        linkedList.add("Frog");
        System.out.println("\nLinkedList:");
        Iterator<String> linkedListIterator = linkedList.iterator();
        while (linkedListIterator.hasNext()) {
            System.out.println(linkedListIterator.next());
        }

        Vector<String> vector = new Vector<>();
        vector.add("Giraffe");
        vector.add("Horse");
        vector.add("Iguana");
        System.out.println("\nVector:");
        Iterator<String> vectorIterator = vector.iterator();
        while (vectorIterator.hasNext()) {
            System.out.println(vectorIterator.next());
        }

        Stack<String> stack = new Stack<>();
        stack.push("Jackal");
        stack.push("Kangaroo");
        stack.push("Lion");
        System.out.println("\nStack:");
        Iterator<String> stackIterator = stack.iterator();
        while (stackIterator.hasNext()) {
            System.out.println(stackIterator.next());
        }

        PriorityQueue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.add("Monkey");
        priorityQueue.add("Narwhal");
        priorityQueue.add("Octopus");
        System.out.println("\nPriorityQueue:");
        Iterator<String> pqIterator = priorityQueue.iterator();
        while (pqIterator.hasNext()) {
            System.out.println(pqIterator.next());
        }

        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.add("Penguin");
        arrayDeque.add("Quail");
        arrayDeque.add("Rabbit");
        System.out.println("\nArrayDeque:");
        Iterator<String> dequeIterator = arrayDeque.iterator();
        while (dequeIterator.hasNext()) {
            System.out.println(dequeIterator.next());
        }

        Set<String> set = new HashSet<>();
        set.add("Snake");
        set.add("Tiger");
        set.add("Umbrella bird");
        System.out.println("\nSet (HashSet):");
        Iterator<String> setIterator = set.iterator();
        while (setIterator.hasNext()) {
            System.out.println(setIterator.next());
        }

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Vulture");
        map.put(2, "Wolf");
        map.put(3, "Xerus");
        System.out.println("\nMap (HashMap):");
        Iterator<Map.Entry<Integer, String>> mapIterator = map.entrySet().iterator();
        while (mapIterator.hasNext()) {
            Map.Entry<Integer, String> entry = mapIterator.next();
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }

public class LinkedBagTest {
    public static void main(String[] args) {
        String[] array1 = {"A", "B", "B", "D", "C", "F"};
        String[] array2 = {"B", "A", "B", "F", "D", "G", "L", "T"};
        BagInterface<String> bag1 = new LinkedBag<String>();
        BagInterface<String> bag2 = new LinkedBag<String>();
        initBag(array1, bag1);
        initBag(array2, bag2);
        
        testUnion(bag1, bag2);
        testIntersection(bag1, bag2);
        testDifference(bag1, bag2);
    }

    public static void initBag(String[] a, BagInterface<String> bag) {
        String[] array = a;
        for (int i = 0; i < array.length; i++) {
            bag.add(array[i]);
        }
    }
    
    public static void testUnion(BagInterface<String> bag1, BagInterface<String> bag2) {
        System.out.println("Testing the union of a bag:");
        BagInterface<String> unionBag = (BagInterface<String>)bag1.union(bag2);
        Object[] bagArray = unionBag.toArray();
        for (int i = 0; i < bagArray.length; i++) {
            System.out.print(bagArray[i] + " ");
        }
    }

    public static void testIntersection(BagInterface<String> bag1, BagInterface<String> bag2) {
        System.out.println("Testing the intersection of a bag:");
        BagInterface<String> interBag = (BagInterface<String>)bag1.intersection(bag2);
        Object[] bagArray = interBag.toArray();
        for (int i = 0; i < bagArray.length; i++) {
            System.out.print(bagArray[i] + " ");
        }
    }

    public static void testDifference(BagInterface<String> bag1, BagInterface<String> bag2) {
        System.out.println("Testing the difference of a bag:");
        BagInterface<String> differentBag = (BagInterface<String>)bag1.difference(bag2);
        Object[] bagArray = differentBag.toArray();
        for (int i = 0; i < bagArray.length; i++) {
            System.out.print(bagArray[i] + " ");
        }
    }

}

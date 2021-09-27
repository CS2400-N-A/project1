public class ArrayBagTest {
    public static void main(String[] args) {
        String[] contents1 = {"one","two","three"};
        String[] contents2= {"one","two","three","four","five"};
        ResizableArrayBag<String> bag1 = new ResizableArrayBag<String>(contents1);
        ResizableArrayBag<String> bag2 = new ResizableArrayBag<String>(contents2);
        //testUnion(bag1,bag2);
        //testIntersection(bag1,bag2);
        //testDifference(bag1,bag2); 
        bag1.union(bag2);
        bag1.intersection(bag2);
        bag1.difference(bag2);
    }

    private static void testUnion(Object bag1, Object bag2){

    }
    
    private static void testIntersection(Object bag1, Object bag2){

    }
    
    private static void testDifference(Object bag1, Object bag2){

    }
}
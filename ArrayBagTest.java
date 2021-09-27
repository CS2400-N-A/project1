public class ArrayBagTest {
    public static void main(String[] args) {
        String[] contents1 = {"one","two","three"};
        String[] contents2= {"one","two","three","four","five"};
        BagInterface<String> bag1 = new ResizableArrayBag<String>(contents1);
        BagInterface<String> bag2 = new ResizableArrayBag<String>(contents2);
        testUnion(bag1,bag2);
        testIntersection(bag1,bag2);
        testDifference(bag1,bag2); 
    }

    private static void testUnion(BagInterface<String> bag1, BagInterface<String> bag2){
        System.out.println("Testing the union of a bag:" );
        BagInterface<String> unionBag = (BagInterface<String>)bag1.union(bag2);
        Object[] bagArray = unionBag.toArray();
        for (int index = 0; index < bagArray.length; index++)
		{
			System.out.print(bagArray[index] + " ");
		}
        System.out.println();
    }
    
    private static void testIntersection(BagInterface<String> bag1, BagInterface<String> bag2){
        System.out.println("Testing the intersection of a bag:");
        BagInterface<String> intersectionBag = (BagInterface<String>)bag1.intersection(bag2);
        Object[] bagArray = intersectionBag.toArray();
        for (int index = 0; index < bagArray.length; index++)
		{
			System.out.print(bagArray[index] + " ");
		}  
        System.out.println();
    }
    
    private static void testDifference(BagInterface<String> bag1, BagInterface<String> bag2){
        System.out.println("Testing the difference of a bag(leftOver1):");
        BagInterface<String> leftOver1 = (BagInterface<String>)bag1.difference(bag2);
        BagInterface<String> leftOver2 = (BagInterface<String>)bag2.difference(bag1);
        
        Object[] bagArray1 = leftOver1.toArray();
        for (int index = 0; index < bagArray1.length; index++)
		{
			System.out.print(bagArray1[index] + " ");
		}
        System.out.println();
        System.out.println("Testing the difference of a bag(leftOver2):");
        Object[] bagArray2 = leftOver2.toArray();
        for (int index = 0; index < bagArray2.length; index++)
		{
			System.out.print(bagArray2[index] + " ");
		}
        System.out.println();
    }
}
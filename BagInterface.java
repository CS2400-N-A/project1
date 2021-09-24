/**
   An interface that describes the operations of a bag of objects.
   @author Frank M. Carrano, Timothy M. Henry
*/
public interface BagInterface<T>
{
   /** Gets the current number of entries in this bag.
       @return  The integer number of entries currently in the bag. */ 
   public int getCurrentSize();

   /** Sees whether this bag is empty.
       @return  True if the bag is empty, or false if not. */ 
   public boolean isEmpty();

   /** Adds a new entry to this bag. 
       @param newEntry  The object to be added as a new entry. 
       @return  True if the addition is successful, or false if not. */ 
   public boolean add(T newEntry);

   /** Removes one unspecified entry from this bag, if possible. 
       @return  Either the removed entry, if the removal 
                was successful, or null. */ 
   public T remove();

   /** Removes one occurrence of a given entry from this bag, if possible. 
       @param anEntry  The entry to be removed. 
       @return  True if the removal was successful, or false if not. */ 
   public boolean remove(T anEntry);

   /** Removes all entries from this bag. */ 
   public void clear();

   /** Counts the number of times a given entry appears in this bag. 
       @param anEntry  The entry to be counted. 
       @return  The number of times anEntry appears in the bag. */ 
   public int getFrequencyOf(T anEntry);

   /** Tests whether this bag contains a given entry. 
       @param anEntry  The entry to find. 
       @return  True if the bag contains anEntry, or false if not. */ 
   public boolean contains(T anEntry);
 
   /** Retrieves all entries that are in this bag. 
       @return  A newly allocated array of all the entries in the bag. 
                Note: If the bag is empty, the returned array is empty. */ 
   public T[] toArray();

   /** Returns a new bag that contains both elements of the bag, including duplicates.
    *  Does not affect the contents of the bags used.
       @param bag1 The bag you want to union with.
       @return  The union of both bags as a new bag. Order does not matter and duplicates are allowed. */
    public Object union(Object bag1);

    /** Returns a new bag that contains elements that only appear in both bags. Duplicate items are counted
      * if both bags contain that duplicate item.
      * Does not affect the contents of the bags used.
       @param bag1  The bag you want to intersect with
       @return  The intersection of both bags as a new bag. */
    public Object intersection(Object bag1);

    /** Returns a new bag that contains elements in one bag after removing the elements that are found
      * in another bag. Does not affect the contents of the bags used.
        @param bag1 The bag that elements you don't want in the first bag.
        @return  The difference of both bags as a new bag. */
    public Object difference(Object bag1);

} // end BagInterface
public class bag {
    public boolean add(T newEntry){
        /*test if newEntry is a valid object*/
        /*test if bag is full*/
        if(isArrayFull())
            return false;
        else{
            bag[numberOfEntries] = newEntry;
            numberOfEntries++;
            return true;
        }       

    }

    public T[] toArray(){
        if (isEmpty())
            return null;
        else{
            T[] items = new Array(numberOfEntries);
            for (int i=0; i<numberOfEntries; i++) {
                items[i] = bag[i];
            }
            return items;
        }
    }
}
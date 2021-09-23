public class bag implements BagInterface{
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

    @Override
    public int getCurrentSize() {
        // TODO Auto-generated method stub
        for (int i = 0; i = T.length(); i++) {
            if (T[i] != null)
            i++;
        }
            return i;
        }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
            boolean result = true;
            for (int i = 0; i = T.length(); i++) {
               if (T[i] != null) {
                result = false;
             }
            } 
           return result;
    }

    @Override
    public Object remove() {
        // TODO Auto-generated method stub
        return null;        
    }

    @Override
    public boolean remove(Object anEntry) {
        // TODO Auto-generated method stub
        for (int i = 0; i = T.length(); i++) {
           if (T[i] = this.anEntry) {
               T[i] = null;
               while (T[i] != null) {
                   T[i] = T[i+1];
               }
           } 
        return false; 
    }
    }

    @Override
    public void clear() {
        // TODO Auto-generated method stub
        for (int i = 0; i = T.length(); i++) {
            T[i] = null;
        }        
    }

    @Override
    public int getFrequencyOf(Object anEntry) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean contains(Object anEntry) {
        // TODO Auto-generated method stub
        boolean contain = false;
        for (int i = 0; i = T.length(); i++) {
            {
                if (T[i] = this.anEntry)
                {
                    contain = true;
                }
            }        
        }
        return contain;
    }
}
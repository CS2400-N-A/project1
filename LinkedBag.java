public class LinkedBag<T> implements BagInterface<T> {
    private Node firstNode;
    private int numberOfEntries;

    public boolean add(T newEntry){
        /*test if newEntry is a valid object*/
        /*test if bag is full*/
        Node newNode = new Node(newEntry);
        newNode.net = firstNode;
        firstNode = newNode;
        numberOfEntries++;  
        return true;
    }

    @Override
    public int getCurrentSize() {
        // TODO Auto-generated method stub
        return numberOfEntries;
    }


    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
            return numberOfEntries == 0;
            
    }

    @Override
    public T remove() {
        // TODO Auto-generated method stub
        T result = null;
        if (firstNode !=null)
        {
            result = firstNode.getData();
            firstNode = firstNode.getNextNode();
            numberOfEntries--;
        }        
        return result;
    }

    @Override
    public boolean remove(T anEntry) {
        // TODO Auto-generated method stub
        boolean result = false;
        Node nodeN = getReferenceTo(anEntry);

        if (nodeN != null)
        {
            //Replace located entry
            nodeN.setData(firstNode.getData());
            //remove first node
            firstNode = firstNode.getNextNode();

            numberOfEntries--;
            result = true;
        }
        return result;
    }    

    @Override
    public void clear() {
        // TODO Auto-generated method stub
        while(!isEmpty())
        remove();
    }

    @Override
    public int getFrequencyOf(T anEntry) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public boolean contains(T anEntry) {
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

 public class Node
 {

    private T data;
    private Node next;
    private Node(T anEntry) {
       this(anEntry, null);
    }

    private Node(T anEntry, Node nextNode) {
        data = anEntry;
        next = nextNode; 
    }

    private T getData()
    {
        return data;
    }

    private void setData(T newData)
    {
        data = newData;
    }

    private T getNextNode()
    {
        return next;
    }

    private void setNextNode(Node nextNode)
    {
        next = nextNode;
    }
 }
}
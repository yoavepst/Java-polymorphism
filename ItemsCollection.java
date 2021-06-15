
public class ItemsCollection
{
    private Item [] _ItemsCollection;
    private final int NUM_OF_ITEMS = 20;
    private static int _numOfItems = 0;
    public ItemsCollection()
    {
        _ItemsCollection = new Item [NUM_OF_ITEMS];
        _numOfItems = 0;
    }

    public boolean addItem(Item newItem)
    {
        boolean add = false;
        if (_numOfItems < NUM_OF_ITEMS){
            _ItemsCollection [_numOfItems] = newItem;
            _numOfItems++;
            add = true;
        }

        return add;
    }

    public void playItem(int itemNumber)
    {
        String error;
        if (itemNumber > _numOfItems){
            error = "Item no. " + itemNumber + " doesn’t exist in the collection.";
            System.out.println (error);
        }
        else
            _ItemsCollection [itemNumber].play();
    }

    public int getNumberOfCDs()
    {
        int countCD = 0;
        for (int i = 0; i < _numOfItems; i++){
            if (_ItemsCollection [i] instanceof CD)
                countCD++;
        }
        return countCD;
    }

    public void oldiesButGoldies(int year)
    {
        String goldies = "";
        for (int i = 0; i < _numOfItems; i++){
            if (_ItemsCollection[i] instanceof Video && _ItemsCollection[i].getPublishYear() < year)
                goldies = goldies + " " + _ItemsCollection [i].toString();
        }
        System.out.println (goldies);

    }
}

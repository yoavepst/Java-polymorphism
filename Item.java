
public abstract class Item
{
    // instance variables
    private String _title;
    private int _publishYear;

    // Constractors
    public Item()
    {
        _publishYear = 0;
        _title = "";
    }
    
    public Item(String title, int year)
    {
        _publishYear = year;
        _title = title;
    }

    public Item(Item other)
    {
        _publishYear = other._publishYear;
        _title = other._title;
    }

    //Methods 
    public String getTitle()
    {
        return _title; 
    }

    public int getPublishYear()
    {
        return _publishYear; 

    }

    public void setTitle (String newTitle)
    {
        _title = newTitle;
    }

    public void setPublishYear(int newYear)
    {
        _publishYear = newYear;
    }

    public String toString()
    {
        String str;
        str = _title + "\t" + "Published at:" + _publishYear;
        return str;
    }

    public abstract void play();
}

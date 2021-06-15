
public class Video extends Item 
{
    private String _director;
    public Video(String title, int year, String director)
    {
        super (title, year);
        _director = director;
    }

    public Video(Video other)
    {
        super (other);
        _director = other._director;
    }

    public String getDirector()
    {
        return _director;
    }

    public void setDirector(String director)
    {
        _director = director;
    }

    public String toString()
    {
        String str;
        str = super.toString() + "directed by: " + _director;
        return str;
    }

    public void play()
    {
        String str = "Now playing " + getTitle() + "directed by: " + _director + "enjoy watching…";
        System.out.println (str);
    }

    public boolean isOlder(int year)
    {
        boolean is = false;
        if ( getPublishYear() < year)
            is = true;
        return is;
    }
}


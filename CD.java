
public class CD extends Item
{
    private String _artist;
    private int _numberOfTracks;

    public CD(String title, int year, String artist, int tracks)
    { 
        super();
        _artist = artist;
        _numberOfTracks = tracks;
    }

    public CD(CD other)
    {
        super (other);
        _artist = other._artist;
        _numberOfTracks = other._numberOfTracks;
    }

    public String getArtist()
    {
        return _artist;
    }

    public int getNumberOfTracks()
    {
        return _numberOfTracks;
    }

    public void setArtist(String artist)
    {
        _artist = artist;
    }

    public void setNumberOfTracks(int tracks)
    {
        _numberOfTracks = tracks;
    }

    public String toString()
    {
        String str;
        str = super.toString() + "\t" + "by: " + _artist + "\t" + "Number of tracks: " + _numberOfTracks;
        return str;
    }
    
    public void play()
    {
        String str = "Now playing " + getTitle() + " by" + _artist + " , enjoy listening…";
        System.out.println (str);
    }
}

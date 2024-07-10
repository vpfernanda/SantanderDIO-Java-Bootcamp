package Data;
public class Song {
    private String song;
    private String artist;

    public Song(String song){
        this.song = song;
    }
    
    public String getSong() {
        return song;
    }
    public void setSong(String song) {
        this.song = song;
    }
    public String getArtist() {
        return artist;
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return song + " - " + artist;
    }



}

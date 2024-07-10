package apps;
import java.util.ArrayList;
import Data.Song;

public class iPod implements App {
    private ArrayList<Song> playlist = new ArrayList<>();
    private Song song;
    private boolean isOpen = false;
    private boolean playingMusic = false;
    private final String NAME_APP = "iPod";

   
    public void addSongtoPlaylist(String song) {
        Song playlistSong = new Song(song);
        playlist.add(playlistSong);

    }

    public void playPlaylist(){
        for(Song s : playlist)
            System.out.println(s.getSong()+" - "+s.getArtist());
    }

    public Song getSong() {
        return song;
    }

    public void setSong(String song, String artist) {
        this.song = new Song(song);
        this.song.setArtist(artist);
    }

    public String playSong(){
        playingMusic = true;
        return "Playing...." + song.toString();
    }

    public void pauseSong(){
        if(playingMusic){
            playingMusic = !playingMusic;
            System.out.println(song.toString()+" paused");
        }
            
    }

    public void InstallApp(){
        System.out.println("Installing "+NAME_APP+".");
        OpenApp();
    }

    public void OpenApp(){
        System.out.println(NAME_APP+" is open.");
        isOpen = !isOpen;
    }

    public void closeApp(){
        if(isOpen){
            System.out.println(NAME_APP+" was closed.");
            isOpen = !isOpen;
        }
    }

    public void DeleteApp(){
        isOpen = false;
        System.out.println(NAME_APP+" was deleted.");
    };
    

    


}

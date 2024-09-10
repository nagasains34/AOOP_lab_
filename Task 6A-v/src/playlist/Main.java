package playlist;

public class Main {
    public static void main(String[] args) {
        MusicPlaylist playlist = new MusicPlaylist();
        playlist.addSong("Song A");
        playlist.addSong("Song B");
        playlist.addSong("Song C");
        playlist.displayPlaylist();
        playlist.moveSong(0, 2);
        playlist.displayPlaylist();
        playlist.removeSong("Song B");
        playlist.displayPlaylist();
    }
}

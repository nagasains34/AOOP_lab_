package playlist;

import java.util.LinkedList;

public class MusicPlaylist {
    private LinkedList<String> songs = new LinkedList<>();

    public void addSong(String song) {
        songs.add(song);
    }

    public void removeSong(String song) {
        songs.remove(song);
    }

    public void moveSong(int fromIndex, int toIndex) {
        if (fromIndex >= 0 && fromIndex < songs.size() && toIndex >= 0 && toIndex < songs.size()) {
            String song = songs.remove(fromIndex);
            songs.add(toIndex, song);
        }
    }

    public void displayPlaylist() {
        for (int i = 0; i < songs.size(); i++) {
            System.out.println((i + 1) + ". " + songs.get(i));
        }
    }
}

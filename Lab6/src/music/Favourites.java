
package music;
import java.util.ArrayList;

public class Favourites {

    private final ArrayList<MusicTrack> tracks = new ArrayList<>();

    public void addTrack(String artist, String title) {
        tracks.add(new MusicTrack(artist, title));
    }

    public void showFavourites() {
        System.out.println();
        for (int i = 0; i < tracks.size(); i++) {
            System.out.println(tracks.get(i));
        }
    }

    public static void main(String[] args) {
        Favourites fvs = new Favourites();

        fvs.addTrack("Fun", "Some Nights");
        fvs.addTrack("Oliver Tank", "Help You Breathe");
        fvs.addTrack("Horse Feathers", "Fit Against the Country");
        fvs.addTrack("Emile Sande", "Country House");
        fvs.addTrack("Fun", "Walking the Dog");
        fvs.addTrack("Porcelain Raft", "Put Me To Sleep");

        fvs.showFavourites();
    }

}

public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }

    public boolean equals(Object comp) {
        if (this == comp) {
            return true;
        }
/*
        if (!(comp instanceOf Song)) {
           return false;
        }
*/
        Song comparat = (Song) comp;

        if (this.artist.equals(comparat.artist)
                && this.durationInSeconds == comparat.durationInSeconds
                && this.name.equals(comparat.name)) {
            return true;
        }
        return false;
    }
}


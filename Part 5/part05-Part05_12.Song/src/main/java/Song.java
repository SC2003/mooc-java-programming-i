
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }
    
//    @Override
    public boolean equals(Object compared) {

        if (this == compared) {

            return true;

        }

        if (!(compared instanceof Song)) {

            return false;
            
        }
        
        Song newCompared = (Song) compared;
        
        if(this.artist.equals(newCompared.artist) &&
           this.name.equals(newCompared.name) &&
           this.durationInSeconds == newCompared.durationInSeconds) {
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }

}

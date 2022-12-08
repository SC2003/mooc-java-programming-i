
public class Bird {

    private String nameEng;
    private String nameLatin;
    private int observation;

    public Bird() {
        this.observation = 0;
    }

    public Bird(String nameEng, String nameLatin) {
        this.nameEng = nameEng;
        this.nameLatin = nameLatin;
        this.observation = 0;
    }

    public String getNameEng() {
        return nameEng;
    }

    public String getNameLatin() {
        return nameLatin;
    }

    public int getObservation() {
        return observation;
    }

    public void setNameEng(String nameEng) {
        this.nameEng = nameEng;
    }

    public void setNameLatin(String nameLatin) {
        this.nameLatin = nameLatin;
    }

    public void setObservation(int observation) {
        this.observation = observation;
    }

    @Override
    public String toString() {
        return (this.nameEng + " (" + this.nameLatin + "): " + this.observation + " observations");
    }

}

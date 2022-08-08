public class Pilot extends CabinCrewMember {

    private String licence;

    public Pilot(String name, Rank rank, String licence) {
        super(name, rank);
        this.licence = licence;
    }

    public String getLicence() {
        return licence;
    }

    public String fly() {
        return "let's go!";
    }
}

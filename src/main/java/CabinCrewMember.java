public class CabinCrewMember {
    private String name;
    private Rank rank;

    public CabinCrewMember(String name, Rank rank) {
        this.name = name;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public Rank getRank() {
        return rank;
    }

    public String relay() {
        return "we are now approaching";
    }
}

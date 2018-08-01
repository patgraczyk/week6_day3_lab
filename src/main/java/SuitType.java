public enum SuitType {
    CLUBS(0, "Club"),
    DIAMOND(1, "Diamond"),
    HEART(2, "Heart"),
    SPADE(3, "Spade");


    private final int rank;
    private final String name;

    SuitType(int rank, String name){
        this.rank = rank;
        this.name = name;
    }

    public int getRank(){
        return this.rank;
    }

}

public enum BusNumber {
    TWELVE(12),
    TWENTY_ONE(21),
    TWENTY_SIX(26),
    FORTY_SIX(46),
    FIFTY_FOUR(54);

    private final int number_indigit;
    BusNumber(int number_indigit){
        this.number_indigit = number_indigit;
    }

    public int getNumber_indigit(){
        return number_indigit;
    }
}

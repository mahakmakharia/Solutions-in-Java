public class Flight {
    String depCity;
    String daysOfWeek;
    String flightNum;
    String depTime;
    String arrTime;

    public String toString() {
        return depCity + "|" + daysOfWeek + "|" + flightNum + "|" + depTime + "/" + arrTime;
    }
}

import java.util.Arrays;

public class Calender {

    private int[][] calenderStorage;

    public void setCalenderStorage() {
        for (DaysInAMonth months: DaysInAMonth.values()) {
            calenderStorage = new int[DaysInAMonth.values().length][months.getValue()];
        }
    }

    public int[][] getCalenderStorage() {
        return calenderStorage;
    }

    public Calender() {
        setCalenderStorage();
    }

    @Override
    public String toString() {
        return "Calender{" +
                "calenderStorage=" + Arrays.deepToString(calenderStorage) +
                '}';
    }
}

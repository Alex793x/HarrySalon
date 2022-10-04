import java.util.Scanner;

public class CustomerAppointment {
    Scanner in = new Scanner(System.in);


    private String firstName;
    private String phone;
    private int dateDay;
    private int dateMonth;
    private Product product;



    boolean hasPaid = true;


    // GETTER / SETTER ---------------------

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getDateDay() {
        return dateDay;
    }

    public void setDateDay(int dateDay) {
        this.dateDay = dateDay;
    }

    public int getDateMonth() {
        return dateMonth;
    }

    public void setDateMonth(int dateMonth) {
        this.dateMonth = dateMonth;
    }

    public boolean hasPaid() {
        return hasPaid;
    }

    public void setHasPaid(boolean hasPaid) {
        this.hasPaid = hasPaid;
    }

    public CustomerAppointment() {
        System.out.print("Please enter name of the Customer?");
        setFirstName(in.nextLine());
        System.out.print("Please enter phone number: ");
        setPhone(in.nextLine());
        System.out.print("please enter which date: ");
        setDateDay(in.nextInt());
        System.out.print("Please enter which month: ");
        setDateMonth(in.nextInt());
    }

    @Override
    public String toString() {
        return "CustomerAppointment{" +
                "firstName='" + firstName + '\'' +
                ", phone='" + phone + '\'' +
                ", dateDay=" + dateDay +
                ", dateMonth=" + dateMonth +
                ", hasPaid=" + hasPaid +
                '}';
    }
}

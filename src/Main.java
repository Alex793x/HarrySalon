public class Main {

    public void run() {
        Product shampoo = new Product("Shampoo", 15.75);
        Product hairbrush = new Product("Hairbrush", 50.00);
        Calender calender = new Calender();

        VacantHours weekendOff = new VacantHours();
        //CustomerAppointment customerOne = new CustomerAppointment();



        //System.out.println(shampoo);
        //System.out.println(hairbrush);
        //System.out.println(weekendOff);
        //System.out.println(customerOne);

        System.out.println(calender);


    }

    public static void main(String[] args) {
        new Main().run();


    }
}
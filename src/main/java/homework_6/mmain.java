package homework_6;

public class mmain {
    public static void main(String[] args) {

        Invoice payment1 = new Invoice(
                "LG",
                "TV",
                3,
                7500);


        System.out.println(payment1.getAmount());

        Date date1 = new Date();
        date1.setDay(5);
        date1.setMonth(10);
        date1.setYear(2023);

        date1.displayDate();
    }
}



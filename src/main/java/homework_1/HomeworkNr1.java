package homework_1;

public class HomeworkNr1 {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        long CurrentWorldPopulation = 7811080815L ;
        int CarsProducedThisYear =  55235358 ;
        char FirstLetterInAlphabet = 'A' ;
        boolean JavaIsAmazing = true ;
        double Pi = 3.14159;

        System.out.println("CurrentWorldPopulation = " + CurrentWorldPopulation);
        System.out.println("CarsProducedThisYear = " + CarsProducedThisYear);
        System.out.println("FirstLetterInAlphabet= " + FirstLetterInAlphabet);
        System.out.println("JavaIsAmazing = " + JavaIsAmazing);
        System.out.println( "Pi = " + Pi);

        double Price = 16.2589 ;
        double Tax = 1.8597;
        int Quantity = 666666;
        double Sum = 0 ;

        System.out.println(Price);
        System.out.println(Tax);
        System.out.println(Quantity);
        System.out.println(Sum);

        double Total = (Price + Tax * Quantity + Sum);
        System.out.println("Total = " + Total);
    }
}

package homework_3;

public class TemperatureConverter {
        double Celsius;
        double Fahrenheit;

     public TemperatureConverter(double Celsius,double Fahrenheit){
            this.Celsius = Celsius;
            this.Fahrenheit = Fahrenheit;
        }
        public double toCelsius () {
            return ((Fahrenheit - 32) * 5 / 9);
        }
        public double toFahrenheit () {
            return (Celsius * 9 / 5 + 32);
        }

        public static void main (String[]args){
            TemperatureConverter New = new TemperatureConverter (20, 50);
            double Cels = New.toCelsius();
            double Fahre = New.toFahrenheit();
            System.out.println("Celsius = " + Cels + " C");
            System.out.println("Fahrenheit = " + Fahre + " F");
        }
    }

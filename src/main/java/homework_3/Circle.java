package homework_3;

public class Circle {
        double radius;
        public Circle(float radius) {
            this.radius = radius;
        }
        public double calculateArea(){
            double pi=3.14159265;
            return (pi*radius*radius);
        }
        public static void main(String[] args) {
        Circle alpha = new Circle(3);
        double area = alpha.calculateArea();
        System.out.println("Aria = " + area);

        }
    }
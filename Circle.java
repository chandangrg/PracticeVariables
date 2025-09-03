package practiceVariable;

class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void printArea() {
        double area = Math.PI * radius * radius; // local variable
        System.out.println("Area: " + area);
    }

    public void printCircumference() {
        double circumference = 2 * Math.PI * radius; // local variable
        System.out.println("Circumference: " + circumference);
    }

    public static void main(String[] args) {
        Circle c = new Circle(7);
        c.printArea();
        c.printCircumference();
    }
}

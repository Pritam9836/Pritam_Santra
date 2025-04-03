public class Rectangle {
    // Instance variables
    double length;
    double width;

    // Constructor to initialize the length and width of the rectangle
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method to calculate the area of the rectangle
    public double calculateArea() {
        return length * width;
    }

    // Method to calculate the perimeter of the rectangle
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    // Main method to demonstrate the use of the Rectangle class
    public static void main(String[] args) {
        // Create a Rectangle object
        Rectangle rect1 = new Rectangle(5.0, 3.0);

        // Display the area and perimeter of the rectangle
        System.out.println("Rectangle 1:");
        System.out.println("Area: " + rect1.calculateArea());
        System.out.println("Perimeter: " + rect1.calculatePerimeter());

        // Create another Rectangle object
        Rectangle rect2 = new Rectangle(7.5, 4.2);

        // Display the area and perimeter of the second rectangle
        System.out.println("\nRectangle 2:");
        System.out.println("Area: " + rect2.calculateArea());
        System.out.println("Perimeter: " + rect2.calculatePerimeter());
    }
}

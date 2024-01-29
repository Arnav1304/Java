import java.util.Scanner;

class Rectangle {
    double length;
    double breadth;

    public void read() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter length of the rectangle: ");
        length = scanner.nextDouble();
        
        System.out.print("Enter breadth of the rectangle: ");
        breadth = scanner.nextDouble();

        scanner.close();
    }

    public double calculateArea() {
        return length * breadth;
    }

    public double calculatePerimeter() {
        return 2 * (length + breadth);
    }

    public void display() {
        System.out.println("Area of the rectangle: " + calculateArea());
        System.out.println("Perimeter of the rectangle: " + calculatePerimeter());
    }
}

public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle myRectangle = new Rectangle();

        myRectangle.read();
        myRectangle.display();
    }
}
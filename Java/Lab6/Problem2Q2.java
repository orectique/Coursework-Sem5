/*Q1
Create a class named 'Shape' with a method to print "This is This is shape". Then create two other classes named 'Rectangle', 'Circle' inheriting the Shape class, both having a method to print "This is rectangular shape" and "This is circular shape" respectively. Create a subclass 'Square' of 'Rectangle' having a method to print "Square is a rectangle". Now call the method of 'Shape' and 'Rectangle' class by the object of 'Square' class.

Create a class named 'Rectangle' with two data members 'length' and 'breadth' and two methods to print the area and perimeter of the rectangle respectively. Its constructor having parameters for length and breadth is used to initialize length and breadth of the rectangle. Let class 'Square' inherit the 'Rectangle' class with its constructor having a parameter for its side (suppose s) calling the constructor of its parent class as 'super(s,s)'. Print the area and perimeter of a rectangle and a square.

Now repeat the above example to print the area of 10 squares.
Hint - Use array of objects */

public class Problem2Q2 {
    public static class Shape {
        public void printShape() {
            System.out.println("This is This is shape");
        }
    }

    public static class Rectangle extends Shape {
        int length;
        int breadth;

        public Rectangle(int length, int breadth) {
            this.length = length;
            this.breadth = breadth;
        }

        public int printArea() {
            return length * breadth;
        }

        public int printPerimeter() {
            return 2 * (length + breadth);
        }

    }

    public static class Square extends Rectangle {

        public Square(int side) {
            super(side, side);
        }

        public void printSquare() {
            System.out.println("Square is a rectangle");
        }
    }

    public static void main (String[] args) {
        Square s = new Square(5);
        s.printArea();
        s.printPerimeter();

        Rectangle[] r = new Rectangle[10];
        for (int i = 0; i < 10; i++) {
            r[i] = new Rectangle(i, i+1);
            System.out.println(r[i].printArea());
        }
    }
}
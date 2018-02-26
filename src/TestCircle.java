/**
 * The TestCircle class creates instances and invokes methods of class Circle.java
 */
public class TestCircle {

    public static void main(String[] args) {

        // Declare an instance of Circle class called c1.
        // Construct the instance c1 by invoking the "default" constructor
        // which sets its radius and color to their default value.
        Circle c1 = new Circle();
        // Invoke public methods on instance c1, via dot operator.
        System.out.println("The circle has radius of "
                + c1.getRadius() + " and area of " + c1.getArea());

        // Declare an instance of class circle called c2.
        // Construct the instance c2 by invoking the second constructor
        // with the given radius and default color.
        Circle c2 = new Circle(2.0);
        // Invoke public methods on instance c2, via dot operator.
        System.out.println("The circle has radius of "
                + c2.getRadius() + " and area of " + c2.getArea());

        // Creates an instance of class Circle using the 3rd constructor
        Circle c3 = new Circle(3.5, "green");
        // Invoke public methods on instance c3, via dot operator.
        System.out.println("The circle has radius of "
                + c3.getRadius() + " and area of " + c3.getArea() + ". The color of this circle is " + c3.getColor());

        /* You can't access the instance variable radius directly with the dot operator
        because it has a private access modifier. The solution is a getter in class Circle.

        System.out.println(c1.radius);
        */

        Circle c4 = new Circle();                                  // Construct an instance of Circle
        c4.setRadius(5.0);                                         // Change radius
        System.out.println("Radius for c4 is: " + c4.getRadius()); // Print radius via getter
        c4.setColor("purple");                                     // Change color
        System.out.println("Color for c4 is: " + c4.getColor());   // Print color via getter

        /* You cannot do the following because setRadius() returns void, which cannot be printed.
        System.out.println(c4.setRadius(4.0)); */

    }
}
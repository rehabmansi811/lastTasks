package circleinhertance;

import java.util.*;

class circle {

    double radius;
    String color;

    public circle() {
    }

    public circle(double radius) {
        this.radius = radius;
    }

    public circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea(double radius) {
        return 3.14 * radius * radius;
    }

    @Override
    public String toString() {
        return "circle{" + "radius=" + radius + ", color=" + color + '}';
    }
}

class cylinder extends circle {

    double height;

    public cylinder() {
    }

    public cylinder(double height) {
        this.height = height;
    }

    public cylinder(double height, double radius) {
        super(radius);
        this.height = height;
    }

    public cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume(double height) {
        double area = this.getArea(radius);
        return area * height;
    }
}

public class CircleInhertance {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double r, h;
        String color;
        circle ci = new circle();
        cylinder cy;
        System.out.print("enter radius of the circle : ");
        r = input.nextDouble();
        ci.setRadius(r);
        System.out.println("area of the circle = " + ci.getArea(r));
        System.out.print("enter color of the circle : ");
        color = input.next();
        ci.setColor(color);

        System.out.print("enter hieght of the cylinder : ");
        h = input.nextDouble();
        cy = new cylinder(h, r);
        System.out.println("volume of the cylinder = " + cy.getVolume(h));

        System.out.println("******************");
        System.out.println("circle : ");
        System.out.println(ci.toString());
        System.out.println("******************");
        System.out.println("cylinder : ");
        System.out.println(cy.toString());

    }

}

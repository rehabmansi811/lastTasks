package onlineshop;

import java.util.*;

abstract class product {

    double price;

    public abstract double price(double pir);

}

class book extends product {

    double price;

    @Override
    public double price(double pir) {
        price = pir * 0.5;
        return price;
    }
}

class childrenbook extends book {

    double price;

    @Override
    public double price(double pir) {
        price = pir * 0.3;
        return price;
    }

}

public class Onlineshop {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter number of books : ");
        int size = input.nextInt();
        product[] arr = new childrenbook[size];

        double price;
        double total = 0;
        for (int i = 0; i < size; i++) {
            System.out.print("enter price of the book " + (i + 1) + ": ");
            price = input.nextDouble();
            arr[i] = new childrenbook();
            arr[i].price(price);
            total = total + arr[i].price(price);

        }
        System.out.print("total prices of the books :" + total);

    }

}

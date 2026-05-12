package com.czy.designpattern.prototype;
/***
 * 原型模式
 */
public class PrototypePattern {
    public static void main(String[] args){
        Product product1 = new Product(1, 10.00);
        System.out.println(product1.getId() + " " + product1.getPrice());

        Product product2 = (Product) product1.Clone();
        System.out.println(product2.getId() + " " + product2.getPrice());
    }
}

interface Prototype{
    public Object Clone();
}

class Product implements Prototype{
    private int id;
    private double price;

    public Product(){};

    public Product(int id, double price){
        this.id = id;
        this.price = price;
    }
    public int getId(){
        return id;
    }

    public double getPrice(){
        return price;
    }

    @Override
    public Object Clone() {
        Product product = new Product();
        product.id = this.id;
        product.price = this.price;
        return product;
    }
}
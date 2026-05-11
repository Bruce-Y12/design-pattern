package com.czy.designpattern.simplefactory;

/**
 * @Author:yzc
 * @Date: 2026-05-10
 * @Description:
 * @Version: 1.0
 */
public class SimpleFactory {
    public static void main(String[] args){
        Product productA = Factory.createProduct("A");
        productA.info();

        Product productB = Factory.createProduct("B");
        productB.info();
    }
}
class Factory{
    public static Product createProduct(String type){
        Product product = null;
        switch(type){
            case "A":
                product = new ProductA();
                break;
            case "B":
                product = new ProductB();
                break;
            default:
                System.out.println("没有" + type + "类型的产品！");
                break;
        }
        return product;
    }
}


abstract class Product{
    public abstract void info();
}

class ProductA extends Product{

    @Override
    public void info() {
        System.out.println("Product A");
    }
}
class ProductB extends Product{

    @Override
    public void info() {
        System.out.println("Product B");
    }
}
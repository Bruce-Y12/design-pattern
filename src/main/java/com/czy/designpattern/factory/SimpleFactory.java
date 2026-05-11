package com.czy.designpattern.factory;

/**
 * @Author:yzc
 * @Date: 2026-05-10
 * @Description: 改成接口形式
 * @Version: 1.0
 */
public class SimpleFactory {
    public static void main(String[] args){
        FactoryA factoryA = new FactoryA();
        Product productA = factoryA.createProduct();
        productA.info();

        FactoryB factoryB = new FactoryB();
        Product productB = factoryB.createProduct();
        productB.info();
    }
}
interface Factory{
    public Product createProduct();
}
class FactoryA implements Factory{

    @Override
    public Product createProduct() {
        return new ProductA();
    }
}
class FactoryB implements Factory{

    @Override
    public Product createProduct() {
        return new ProductB();
    }
}


interface Product{
    public void info();
}

class ProductA implements Product{

    @Override
    public void info() {
        System.out.println("Product A");
    }
}
class ProductB implements Product{

    @Override
    public void info() {
        System.out.println("Product B");
    }
}
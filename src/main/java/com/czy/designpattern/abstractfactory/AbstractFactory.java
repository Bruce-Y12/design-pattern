package com.czy.designpattern.abstractfactory;

public class AbstractFactory {
    public static void main(String[] args){
        //父类 对象名 = new 子类()
        Factory1 factory1 = new Factory1();
        ProductA productA = factory1.createProductA();
        productA.info();

        Factory2 factory2 = new Factory2();
        ProductB productB = factory2.createProductB();
        productB.info();
    }
}
interface Factory{
    public ProductA createProductA();
    public ProductB createProductB();

}
class Factory1 implements Factory {

    @Override
    public ProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public ProductB createProductB() {
        return new ProductB1();
    }
}

class Factory2 implements Factory {

    @Override
    public ProductA createProductA() {
        return new ProductA2();
    }

    @Override
    public ProductB createProductB() {
        return new ProductB2();
    }
}

interface ProductA{
    public void info();
}

class ProductA1 implements ProductA {

    @Override
    public void info() {
        System.out.println("Product A1");
    }
}

class ProductA2 implements ProductA {

    @Override
    public void info() {
        System.out.println("Product A2");
    }
}
interface ProductB{
    public void info();
}

class ProductB1 implements ProductB {

    @Override
    public void info() {
        System.out.println("Product B1");
    }
}
class ProductB2 implements ProductB {

    @Override
    public void info() {
        System.out.println("Product B2");
    }
}

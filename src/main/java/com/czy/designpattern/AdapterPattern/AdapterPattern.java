package com.czy.designpattern.AdapterPattern;

public class AdapterPattern {
    public static void main(String[] args){
        Target target1 = new Target();
        target1.Request();

        Target target2 = new Adapter();
        target2.Request();
    }

}

class Target {
    public void Request(){
        System.out.println("USB数据线");
    }
}
class Adapter extends Target {
    private Adaptee adaptee = new Adaptee();

    @Override
    public void Request(){
        adaptee.SpecificRequest();
    }

}

class Adaptee { //被适配对象
    public void SpecificRequest(){
        System.out.println("Type-C数据线");
    }
}
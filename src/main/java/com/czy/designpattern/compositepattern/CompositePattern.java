package com.czy.designpattern.compositepattern;

public class CompositePattern {
}
abstract class AbstractFile{
    protected String name;
    public void printName(){
        System.out.println(name);
    }

}
class Folder extends AbstractFile{
    public Folder(String name){
        this.name = name;
    }
}
class File extends AbstractFile{
    public File(String name){
        this.name = name;
    }

}


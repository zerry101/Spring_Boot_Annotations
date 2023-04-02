/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.annotations;

/**
 *
 * @author macon
 */
public class Abstract_learning {

    public static void main(String[] args) {
//        Child2 child2 = new Child2();
//        child2.greet();

        Mobile Obj = new Mobile();
        Obj.Brand="Apple";
        Obj.price=2323;
//        Obj.name="phone";
        
        
        Mobile Obj2 = new Mobile();
        Obj2.Brand="samsung";
        Obj2.price=2323;
        Mobile.name="phone";
      
        
        Obj.show();
        Obj2.show();

    }

}

abstract class Parent {

    public Parent() {
        System.out.println("mai Parent ka constructor huun");

    }

    public void sayHello() {
        System.out.println("Hello");
    }

    abstract public void greet();

    abstract public void greet2();
}

class Child2 extends Parent {

    public Child2() {
        super();
    }
    
    @Override
    public void  greet(){
    System.out.println("hii");
    }

    @Override
    public void greet2() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}

abstract class Child3 extends Parent {

    public Child3() {
        super.sayHello();

    }

//        @Override
//        public void greet() {
//            System.out.println("child 3 is greeting");
//        }
    public void th() {
        System.out.println("I am good");
    }

    @Override
    public void greet2() {
        System.out.println("Child3 is greeting by greet2()");
    }

}

class Mobile {

    String Brand;
    int price;
    static  String  name="smp";
    
    public void show(){
        System.out.println(Brand+":"+name+":"+price+":");
    }
    

}

package com.annotations;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springboot/CfgProperties.java to edit this template
 */

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 *
 * @author macon
 */

public class Interfaces {
    public static void main(String[] args) {
        AvonCycle Avon1=new AvonCycle();
        Avon1.speed=10;
        Avon1.speedUp(10);
        Avon1.applyBrake(5);
    }
    
}

interface Bicycle{
    public void speedUp(int increaseTO);
    public void applyBrake(int decreaseTO);
    
}

class AvonCycle implements Bicycle{

    int speed=7;
   
    
    @Override
    public void speedUp(int increaseTO) {
   speed+=increaseTO;
        System.out.println("Speed increase to:"+speed);
    }

    @Override
    public void applyBrake(int deccreaseTO) {
    speed-=deccreaseTO;
        System.out.println("Speed decreased to:"+speed);
    }
    
}
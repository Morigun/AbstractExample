/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sda.aex;

import com.sda.interfaces.IFlying;

/**
 *
 * @author suvoroda
 */
public class Bird extends Animal implements IFlying{

    public Bird(){
        this._name = "Bird";
    }
    
    public Bird(String name){
        this._name = name;
    }
    
    @Override
    public String speak() {
        return "Chirick";
    }

    @Override
    public void fly() {
        System.out.println(this._name + " is fly");
    }

    @Override
    public String getName() {
        return this._name;
    }
    
}

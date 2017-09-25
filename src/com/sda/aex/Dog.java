/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sda.aex;

/**
 *
 * @author suvoroda
 */
public class Dog extends Animal {

    public Dog(){
        this._name = "Dog";
    }
    
    public Dog(String name){
        this._name = name;
    }
    
    @Override
    public String speak() {
        return "Waf";
    }

    @Override
    public String getName() {
        return this._name;
    }
    
}

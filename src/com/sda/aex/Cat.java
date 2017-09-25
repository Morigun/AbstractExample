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
public class Cat extends Animal {

    public Cat(){
        this._name = "Cat";
    }
    
    public Cat(String name){
        this._name =  name;
    }
    
    @Override
    public String speak() {
        return "Meow";
    }

    @Override
    public String getName() {
        return this._name;
    }
    
}

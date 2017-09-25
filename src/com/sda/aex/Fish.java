/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sda.aex;

import com.sda.interfaces.ISwiming;

/**
 *
 * @author suvoroda
 */
public class Fish extends Animal implements ISwiming {

    public Fish(){
        this._name = "Fish";
    }
    
    public Fish(String name){
        this._name = name;
    }
    
    @Override
    public String speak() {
        return "";
    }

    @Override
    public void swim() {
        System.out.println(this._name + " is swiming");
    }

    @Override
    public String getName() {
        return this._name;
    }
    
}

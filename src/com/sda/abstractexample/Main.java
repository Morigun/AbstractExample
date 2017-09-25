/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sda.abstractexample;

import com.sda.aex.*;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author suvoroda
 */
public class Main {
    public static void main(String[] Args){
        Animal cat = new Cat();
        Animal dog = new Dog();
        Animal vorodey = new Bird("Vorobey");
        Animal fish = new Fish("Plotva");
        Fish fish2 = new Fish("Okun");
        Fish fish3 = null;
        System.out.println(cat.getName() + " speak is " + cat.speak() + ", " + dog.getName() + " speak is " + dog.speak() + ", " + vorodey.getName() + " speak is " + vorodey.speak() + " and " + vorodey.getName() + " can fly:");
        ((Bird)vorodey).fly();
        System.out.println(fish.getName() + " can't speak, but " + fish.getName() + " can swim:");
        ((Fish)fish).swim();
        HashSet<Fish> fishStack = new HashSet<>();
        fishStack.add(((Fish)fish));
        fishStack.add(fish2);
        fishStack.add(fish3);
        fishStack.add(new Fish());
        System.out.println("Size fish stack is " + fishStack.size());
        fishStack.forEach(x -> {
            if(x != null){
                System.out.println(x.getName() + ":");
                System.out.print("\t");
                x.swim();
            }
        });
        /*Set<Dog> dogStack = new TreeSet<>();
        dogStack.add(new Dog("Bobic"));
        dogStack.add(new Dog("Sharik"));
        dogStack.forEach(x -> {
            System.out.println(x.getName() + ":" + x.speak()); 
        });*/
        LinkedHashSet<Cat> catStack = new LinkedHashSet<>();
        catStack.add(new Cat("Bob"));
        catStack.add(new Cat("Murzik"));
        
        catStack.forEach(x -> {
            System.out.println(x.getName() + ":" + x.speak());
        });
        //fishStack.
    }
}

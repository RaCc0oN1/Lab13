package com.company;

import java.util.ArrayList;

public class Container {
 ArrayList<Cargo> list = new ArrayList<Cargo>();

 void addInContainer(Cargo cargo){
     list.add(cargo);
 }

 void equalsContainer(Container container){
    int containerW = 0, containerW2 = 0;
    for(Cargo cargo : list){
        containerW = containerW + cargo.getWeight();
    }
     System.out.println("Conteiner1 weight = " + containerW);
    for(Cargo cargo : container.list){
        containerW2 = containerW2 + cargo.getWeight();
    }
     System.out.println("Conteiner2 weight = " + containerW2);

    if(containerW > containerW2){
        System.out.println("Container1 > Container2");
    } else if(containerW < containerW2){
        System.out.println("Container1 < Container2");

    } else {
        System.out.println("Container1 = Container2");
    }

 }

 void twoInOne(Container container){
     list.addAll(container.list);
     container.list.clear();
 }


}

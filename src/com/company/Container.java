package com.company;

import java.util.ArrayList;

public class Container {
 ArrayList<Cargo> list = new ArrayList<Cargo>();

 void addInContainer(Cargo cargo){
     for(Cargo cargoAd : list){
         if(cargoAd.getClass() != cargo.getClass()){
             System.out.println("DENIED!");
             return;
         }
     }
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
     for( Cargo cargo : list){
         for (Cargo cargoSecond : container.list){
             if (cargo.getClass() != cargoSecond.getClass()) {
                 System.out.println("DENIED!");
                 return;
             }
         }
     }
     list.addAll(container.list);
 }
// add int container \ sravnit two container / obidinenie ontainer


}

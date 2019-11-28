package com.company;

import java.util.ArrayList;

public class Container<T extends Cargo> {

    T cargo;

    ArrayList<T> list = new ArrayList<T>();

    void addInContainer(T cargo) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getClass() != cargo.getClass()) {
                System.out.println("DENIED!");
                return;
            }
        }
        list.add(cargo);
    }

    int containerGetWeight() {
        int cWeight = 0;
        for (int i = 0; i < list.size(); i++) {
            cWeight = cWeight + list.get(i).getWeight();
        }
        return cWeight;
    }

    void printWeight() {
        System.out.println("Conteiner weight = " + containerGetWeight());
    }

    void equalsContainer(Container container2) {
        if (containerGetWeight() > container2.containerGetWeight()) {
            System.out.println("Container1 > Container2");
        } else if (containerGetWeight() < container2.containerGetWeight()) {
            System.out.println("Container1 < Container2");

        } else {
            System.out.println("Container1 = Container2");
        }
    }


    void twoInOne(Container container) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < container.list.size(); j++) {
                if (list.get(i).getClass() != container.list.get(j).getClass()) {
                    System.out.println("DENIED!");
                    return;
                }
            }
        }
        list.addAll(container.list);
        container.list.clear();
    }
// add int container \ sravnit two container / obidinenie ontainer


}

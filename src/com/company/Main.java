package com.company;

import com.company.Items.Cactus;
import com.company.Items.Toys;

import java.util.ArrayList;

public class Main {
    void main() {
        Container contaner1 = new Container();
        Container contaner2 = new Container();

        Toys toysBaby = new Toys();
        toysBaby.setWeight(10);
        Toys toysCars = new Toys();
        toysCars.setWeight(20);
        Toys toysGuns = new Toys();
        toysGuns.setWeight(15);

        Cactus cactus1 = new Cactus();
        cactus1.setWeight(3);
        Cactus cactus2 = new Cactus();
        cactus2.setWeight(2);
        Cactus cactus3 = new Cactus();
        cactus3.setWeight(5);

        contaner1.addInContainer(toysBaby);
        contaner1.addInContainer(toysCars);
        contaner1.addInContainer(toysGuns);

        contaner2.addInContainer(cactus1);
        contaner2.addInContainer(cactus2);
        contaner2.addInContainer(cactus3);

contaner1.containerGetWeight();
contaner2.containerGetWeight();

contaner1.printWeight();
contaner2.printWeight();

contaner1.equalsContainer(contaner2);
contaner1.twoInOne(contaner2);

        contaner1.printWeight();
        contaner2.printWeight();
    }
}



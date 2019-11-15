package com.company;

import com.company.Items.Cactus;
import com.company.Items.Toys;

public class Main {
    void main(){
Container contaner1 = new Container();
Container contaner2 = new Container();

Toys toysBaby = new Toys();
Toys toysCars = new Toys();
Toys toysGuns = new Toys();
toysBaby.setWeight(10);
toysCars.setWeight(20);
toysGuns.setWeight(15);

Cactus cactus1 = new Cactus();
Cactus cactus2 = new Cactus();
Cactus cactus3 = new Cactus();
cactus1.setWeight(3);
cactus2.setWeight(2);
cactus3.setWeight(5);

contaner1.addInContainer(toysBaby);
contaner1.addInContainer(toysCars);
contaner1.addInContainer(toysGuns);

contaner2.addInContainer(cactus1);
contaner2.addInContainer(cactus2);
contaner2.addInContainer(cactus3);

contaner1.equalsContainer(contaner2);

        contaner1.twoInOne(contaner2);
        contaner1.equalsContainer(contaner2);
    }
}

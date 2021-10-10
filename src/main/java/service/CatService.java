package service;

import model.Cat;
import model.Plate;

public class CatService {
    private Cat cat;

    public CatService(Cat cat) {
        this.cat = cat;
    }

    public void eat(Plate p) {
        if (p.getFood()<cat.getAppetite()){
            System.out.println("В тарелке не достаточно еды для "+cat.name);
        } else {
            p.decreaseFood(cat.getAppetite());
            System.out.println("Кот "+cat.name+" покушал");
            cat.satiety = true;
        }
    }
}


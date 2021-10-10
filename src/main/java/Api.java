import model.Cat;
import model.Plate;
import service.CatService;

public class Api {
    public static void main(String[] args) {
        Cat[] cat = new Cat[5];
        cat[0] = new Cat("Barsik", 30, false);
        cat[1] = new Cat("Vasy", 15, false);
        cat[2] = new Cat("Fill", 40, false);
        cat[3] = new Cat("Kuzy", 10, false);
        cat[4] = new Cat("Tisha", 36, false);
        Plate plate = new Plate(100);


        for (int i = 0; i < cat.length; i++) {
            if (plate.getFood() < 15){
                plate.addFood(50);
            }
            CatService catService = new CatService(cat[i]);
            catService.eat(plate);
            cat[i].info();
            plate.info();
            System.out.println();

        }
    }
}

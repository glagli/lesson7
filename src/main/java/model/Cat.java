package model;

public class Cat {
    public String name;
    private int appetite;
    public boolean satiety;

    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }


    public void info() {
        if (satiety){
            System.out.println(name + " сыт.");
        }else {
            System.out.println(name + " голоден");
        }
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }
}
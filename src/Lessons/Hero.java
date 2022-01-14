package Lessons;

public class Hero implements AbleToEat {
    private int id;

    public Hero() {

    }

    public Hero(int id) {
        this.id = id;
    }

    public void eat() {
        System.out.println("Hero is eating");
    }



    @Override
    public String toString() {
        return String.valueOf(id);
    }
}

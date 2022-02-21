package lesson_3.homework;

public abstract class Category {
    protected String iconDescription;
    protected String name;
    protected String img;
    protected int battery;

    public Category (String iconDescription, String name, String img) {
        this.iconDescription = iconDescription;
        this.name = name;
        this.img = img;
    }
    public Category (String name, String img) {
        this.name = name;
        this.img = img;
    }
    public Category (String iconDescription, String name, String img, int battery) {
        this.iconDescription = iconDescription;
        this.name = name;
        this.img = img;
        this.battery = battery;
    }
    public Category(){}
public abstract void open ();
}

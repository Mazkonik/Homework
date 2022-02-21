package lesson_3.homework;

public class Laptops extends Category{
public Laptops(String iconDescription, String name, String img, int battery){
    super(iconDescription, name, img, battery);
}
    @Override
    public void open() {
        System.out.println("\nОткрывается ноутбук\n" + iconDescription+ "\n" + name+"\n" + img+ "\n"+"Емкость баттареи "+battery);
          }
}

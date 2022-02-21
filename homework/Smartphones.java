package lesson_3.homework;

public class Smartphones extends Category{
    public Smartphones(String iconDescription, String name, String img, int battery ){
        super(iconDescription,name,img,battery);
    }

    @Override
    public void open() {
        System.out.println("\nОткрывается смартфон\n" + iconDescription+ "\n" + name+"\n" + img+ "\n"+"Емкость баттареи "+battery);
    }
}

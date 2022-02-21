package lesson_3.homework;

public class Reklama extends Category{
    public Reklama(String name, String img){
        super(name, img);
    }
    @Override
    public void open() {
        System.out.println("\nОткрывается реклама\n" + name +"\n"+img);
    }
}

package lesson_3.homework;

class TV extends Category {

public TV(String iconDescription, String name, String img){
    super(iconDescription, name, img);

}

    @Override
    public void open() {
        System.out.println("\nОткрывается телевизор\n" + iconDescription+ "\n" + name+"\n" + img);
    }
}

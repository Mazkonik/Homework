package lesson_3.homework;

public class Main {
    public static void main(String[] args) {
TV Spectr = new TV("Описание Spectr", "Spectr","Картинка Spectr");
Spectr.open();
lesson_3.homework.TV LG = new TV("Описание LG", "LG","Картинка LG");
LG.open();

Smartphones Iphone = new Smartphones("Описание Iphone 4","Iphone 4","Картинка Iphone 4",4000);
Iphone.open();
Category Iosif = new Smartphones("Описание Iosif 4","Iosif 4","Картинка Iosif 4",60000);
 Iosif.open();

 Laptops HP = new Laptops("Описание HP","HP","Картинка HP",15000);
 HP.open();

Reklama Samsung = new Reklama("Электроника от Samsung","Картинка электроники");
Samsung.open();

Search SearchLine = new Search();
SearchLine.setName("Поисковый запрос");
SearchLine.setImg("+ Иконки результатов");
SearchLine.click();
SearchLine.open();
    }
   }

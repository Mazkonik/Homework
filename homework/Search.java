package lesson_3.homework;

public class Search extends Category implements Element{
    private Search(String name, String img){
        super(name, img);
    }
    public void setName(String searchLine){
    name = searchLine;
    }
    public String getName(){
        return name;
    }
    public void setImg(String searchImg){
        img = searchImg;
    }
    public String getImg(){
        return img;
    }
    public Search(){};
    @Override
    public void click() {
System.out.println("\n" + getName());
    }
    @Override
    public void open() {
System.out.println("Открыта страница с результатами поиска "+ getImg());
    }


}

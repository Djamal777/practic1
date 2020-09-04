package Ball;

public class Book {
    private int size;
    private String color;
    public Book(String c, int s){
        color=c;
        size=s;
    }
    public Book(String c){
        color=c;
        size=5;
    }
    public Book(){
        color="белый";
        size=5;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor(){
        return color;
    }
    public int getSize() {
        return size;
    }
    public String toString(){
        return "цвет мяча -  " + this.color+", размер -  "+this.size;
    }
}

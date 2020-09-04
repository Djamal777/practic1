package Book;

public class Book {
    private int pages;
    private String name;
    public Book(String n, int p){
        name=n;
        pages=p;
    }
    public Book(String n){
        name=n;
        pages=100;
    }
    public Book(){
        name="книга";
        pages=100;
    }
    public void setPages(int size) {
        this.pages = pages;
    }
    public void setName(String color) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public int getPages() {
        return pages;
    }
    public String toString() {
        return "название книги - " + this.name + ", количество страниц - " + this.pages;
    }
}

package Ball;

public class Main {
    public static void main(String[] args) {
        Book ball1 = new Book("зеленый", 3);
        Book ball2 = new Book("красный");
        Book ball3 = new Book();
        ball3.setSize(4);
        System.out.println(ball1.toString());
        System.out.println(ball2.toString());
        System.out.println(ball3.toString());
    }
}

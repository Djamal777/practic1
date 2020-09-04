package Dog;

import java.lang.*;
public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Sobaka1", 2);
        Dog dog2 = new Dog("Sobaka2", 7);
        Dog dog3 = new Dog("Sobaka3");
        dog3.setAge(1);
        System.out.println(dog1);
        dog1.intoHumanAge();
        dog2.intoHumanAge();
        dog3.intoHumanAge();
    }
}
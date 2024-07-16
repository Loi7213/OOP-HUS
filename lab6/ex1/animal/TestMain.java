package lab6.ex1.animal;

public class TestMain {
    public static void main(String[] args) {
        Animal animal = new Animal("Lớp thú");
        System.out.println(animal);
        System.out.println();

        Mammal mammal = new Mammal("Động vật có vú");
        System.out.println(mammal);
        System.out.println();

        Cat cat = new Cat("Mèo (Con mèo tên Mèo)");
        System.out.println(cat);
        cat.greets();
        System.out.println();

        Dog dog1 = new Dog("Chó (Con chó tên Chó)");
        System.out.println(dog1);
        Dog dog2 = new Dog("Chó bự (Là 1 con chó khác)");
        System.out.println(dog2);
        dog1.greets();
        dog1.greets(dog2);
    }
}

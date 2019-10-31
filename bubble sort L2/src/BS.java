
public class BS {
    public static void main(String[] args) {
        Cats cat1 = new Cats("Melissita", 3, "green");
        Cats cat2 = new Cats("Timoshok", 13, "yellow");
        Cats cat3 = new Cats("Nyasha", 2, "hazel");

        System.out.println(cat1);
        System.out.println(cat2);
        System.out.println(cat3);

        Dogs dog1 = new Dogs("Feya", "Немецкая овчарка");
        Dogs dog2 = new Dogs("Feya", "Немецкая овчарка");

        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog1 == dog2);

        dog1 = dog2;

        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog1 == dog2);

        LinkList collection = new LinkList();
        collection.add("первый");
        collection.add("второй");
        System.out.println(collection.get(0));
        System.out.println(collection.get(1));
    }
}




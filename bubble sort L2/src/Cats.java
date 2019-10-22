public class Cats {
    private String name;
    private int age;
    private String eyes;

public Cats (String name, int age, String eyes){
    this.name = name;
    this.age = age;
    this.eyes = eyes;
}
    @Override
    public String toString() {
        return name;
    }
}

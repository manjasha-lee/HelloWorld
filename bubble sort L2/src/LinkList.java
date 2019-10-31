public class LinkList {
    private String name;
    private int num;
    int counter = 0;

    public void add(String name){
        LinkList x = new LinkList();
        x.setNameAndNum(name, counter);
        counter++;
    }
    public void setNameAndNum(String name, int num){
        this.name = name;
        this.num = num;
    }
    public String get(int num){
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}

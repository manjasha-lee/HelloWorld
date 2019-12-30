public class LinkList {

public Node first;
public Node last;

    public Node getFirst() {
        return first;
    }

    public void setFirst(Node first) {
        this.first = first;
    }
    public void add (int value){
        if (first == null){
            Node node = new Node (value);
            first = node;
            last = node;
        }else{
            Node node = new Node (value);
            last.setNext(node);
            last = node;
        }
    }
    public int get (int num){
        Node value = first;
        int result = 0;
        for (int i = 0; i <= num; i++) {
            if(i == num){
                result = value.getValue();
            }else {
                value = value.getNext();
            }
        }
        return result;
    }
}


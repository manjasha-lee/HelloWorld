public class LinkList {

private Node first;
private Node last;

    public Node getFirst() {
        return first;
    }
    public void setFirst(Node first) {
        this.first = first;
    }

    public Node getLast() {
        return last;
    }
    public void setLast(Node last) {
        this.last = last;
    }

    public void add (int value){
        Node node = new Node (value);
        if (first == null){
            this.first = node;
            this.last = node;
        }else{
            last.setNext(node);
            this.last = node;
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


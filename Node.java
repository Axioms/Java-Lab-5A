public class Node {
    
    private int data;
    private int id;
    private Node next;
    private Node prev;
    
    public Node() {}

    public Node(int data) {
        this.data = data;
    }

    public Node(int data, Node next){
        this.data = data;
        this.next = next;
    }

    public Node(int data, Node next, Node prev){
        this.data = data;
        this.next = next;
        this.prev = prev;
    }

    public int getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public Node getPrev() {
        return prev;
    }

    public int getId() {
        return id;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void nullify(){
        this.next = null;
        this.prev = null;
    }

    @Override
    public String toString() {
        return "" + id;
    }
}
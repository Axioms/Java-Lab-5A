
public class LinkedList {
    private int length;
    private Node h;
    private Node t;


    public LinkedList() {
        this.length = 0;
    }

    public boolean isEmpty() {
        return h == null;
    }

    public int length() {
        return length;
    }

    public void add(int data) {

        Node temp = new Node(data);
        temp.setId(length);

        if (h == null) {
            h = temp;
            t = temp;
        }
        else {
            temp.setPrev(t);
            t.setNext(temp);
            t = temp;
        }

        length++;
    }

    public int sum() {
        int sum = 0;
        Node cN = h;
        for(int i=0; i < length; i++) {
            sum = sum + cN.getData();
            cN = cN.getNext();
        }
        return sum;
    }
    @Override
    public String toString() {
        String temp = "[";
        Node cN = h;

        for (int i=0; i < length; i++) {
            temp = temp + cN.getData();
            if(i != length -1) {
                temp = temp + ", ";
            }
            cN = cN.getNext();
        }

        return temp + "]";
    }
}
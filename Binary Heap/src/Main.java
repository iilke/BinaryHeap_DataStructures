public class Main {
    public static void main(String[] args) {
        minHeap heap = new minHeap();
        heap.insert(10);
        heap.insert(35);
        heap.insert(20);
        heap.insert(46);
        heap.insert(55);
        heap.insert(79);

        heap.print();

        heap.insert(9);

        heap.print();
    }
}

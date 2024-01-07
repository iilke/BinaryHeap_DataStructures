public class minHeap {
    private int[] arr;
    private int top = 0;
    public minHeap() {
        this.arr = new int[20];
    }
    public void insert( int value ) {
        if(top==0){//it's an enpty heap, no need to swim up
            arr[top] = value;
            top++;
        }
        else {
            arr[top] = value;
            swimRecursive(top);
            top++;
        }
    }

    private void swimRecursive( int index ) {
// You will implement this method RECURSIVELY!
// Method takes an item index and swims the item up in the tree
    }
    public String removeMin() {
// You will implement this method
// Method removes and returns the minimum element from the tree
    }
    private void sinkRecursive( int index ) {
// You will implement this method RECURSIVELY!
// Method takes an item index and sinks the item down in the tree
    }
    public void delete( int index ) {
// You will implement this method
// Method takes an item index and removes the item from the tree
    }
    public void update( int index, int newValue ) {
// You will implement this method
// Method takes an item index, a String and updates the item’s value
    }
    public void print() {

    }
}


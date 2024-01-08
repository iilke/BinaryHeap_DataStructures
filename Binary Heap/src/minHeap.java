public class minHeap {
    private int[] arr;
    private int top = 1;
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
        if(arr[index/2] < arr[index]){
            return;
        }
        else{
            if(index>0){
                int temp = arr[index/2];
                arr[index/2] = arr[index];
                arr[index] = temp;
                swimRecursive(index/2);
            }

        }
    }
    public int removeMin() {
        int min = arr[1];
        arr[1] = arr[top];
        
        return min;
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
        for (int i = 0; i < top; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}


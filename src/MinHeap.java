
public class MinHeap {


    public static void insertMinHeap(int[] heap, int size, int value)
    {
        heap[size] = value; //add element

        int index = size; //get the index of last element

        //swimming up while element is smaller than it's parent
        while (index>0 && heap[(index-1)/2]>heap[index]){
            swap(heap,(index-1)/2,index);
            index = (index - 1) / 2; //to make sure 'index' always shows index of our last added element
        }

        //to reach a parent, instead of using index/2 use (index-1)/2 because indexes starts from 0

    }


    public static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public static void main(String[] args)
    {
        int[] heap = new int[6];
        int[] values = { 10, 7, 11, 5, 4, 13 };
        int size = 0;

        for (int i = 0; i < values.length; i++) {
            insertMinHeap(heap, size, values[i]);
            size++;
            System.out.print("Inserted " + values[i] + " into the min-heap: ");

            for (int j = 0; j < size; j++) {
                System.out.print(heap[j] + " ");
            }

            System.out.println();
        }


    }
}

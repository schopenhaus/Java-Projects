/* SelectionSort Class - A class that performs selection sort */

public class SelectionSort
{
      /*
     * swap - swap the values of arr[a] and arr[b].
     * Used by several of the sorting algorithms below.
     */
    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    
    /*
     * indexSmallest - returns the index of the smallest element
     * in the subarray from arr[start] to the end of the array.  
     * Used by selectionSort.
     */
    private static int indexSmallest(int[] arr, int start) {
        int indexMin = start;
        
        for (int i = start + 1; i < arr.length; i++) {
            if (arr[i] < arr[indexMin]) {
                indexMin = i;
            }
        }
        
        return indexMin;
    }
    
    /** selectionSort */
    public static void selectionSort(int[] arr) 
        {
        for (int i = 0; i < arr.length - 1; i++) {
            int j = indexSmallest(arr, i);
            swap(arr, i, j);
        }
      
     /*
     * printArray - prints the specified array in the following form:
     * { arr[0] arr[1] ... }
     */
    public static void printArray(int[] arr) {
        System.out.print("{ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("}");
    }
  
  public static void main(String[] arr) 
  { 
        int[] orig = new int[NUM_ELEMENTS];
        for (int i = 0; i < NUM_ELEMENTS; i++) {
            orig[i] = (int)(50 * Math.random());
        }
        printArray(orig);
        
        int[] copy = new int[NUM_ELEMENTS];
        
        /* selection sort */
        System.arraycopy(orig, 0, copy, 0, orig.length); 
        selectionSort(copy);
        System.out.print("selection sort:\t");
        printArray(copy);

    }
  
}

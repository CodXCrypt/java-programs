public class selectionSort
{
    public static void main(String[] args) {
        selectionSort obj = new selectionSort();

        int a[] = {4, 2, -12, 22, 11};

        obj.sort(a);
        System.out.println("Sorted Array");
        obj.printArray(a);
    }

    void sort(int a[])
    {
        for(int i=0; i<a.length-1; i++)

        {
            int min_index = i;

            for(int j = i+1; j<a.length; j++)
// less than to arrange in ascending order!
            if(a[j] < a[min_index])

            min_index = j;

// Swapping!
    int temp = a[min_index];
    a[min_index] = a[i];
    a[i] = temp;            

     }
    }

    void printArray(int a[])
    {
        for(int i=0; i<a.length; i++)
        {
            
            System.out.print(a[i]+ " ");
        
        }
    }
}
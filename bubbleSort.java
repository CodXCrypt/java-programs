public class bubbleSort {

    public static void main(String[] args) {
        bubbleSort obj = new bubbleSort();

        int a[] = {64, 34, 89, 49, 52, 71};

        obj.bubbleSort(a);
        System.out.println("Sorted Array : ");
        obj.printArray(a);
    }

    public void bubbleSort(int a[])
    {
      for(int i=0; i<a.length-1; i++)
      {
          for(int j =0; j<a.length-i-1; j++)
          if(a[j] > a[j+1])
          {
              int temp = a[j];
              a[j] = a[j+1];
              a[j+1] = temp;
          }
      }
    }
    public void printArray(int a[])
    {
       for(int i=0; i<a.length; i++)
       System.out.print(a[i]+" ");

    System.out.println();
    
    }
    
}
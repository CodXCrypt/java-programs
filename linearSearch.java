public class linearSearch {

    public static void main(String[] args) {
        int a[] = {1, 19, 16, 52, 13};
        linearSearch obj = new linearSearch();
        int i = obj.searchIndex(a, 13);

        if( i == -1)
        {
            System.out.println("Value you are searching dosen't exist");
        }
        else
        {
            System.out.println("Value you searched for is present at index "+i);
        }
    }
    public int searchIndex(int a[], int val)
    {
        if(a.length == 0)
        {
            return -1;
        }

     for(int i=0; i<a.length; i++)
     {
         if(a[i] == val)
         
         {
             return i;
         }
     }
return -1;

    }
}
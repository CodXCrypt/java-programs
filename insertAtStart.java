public class insertAtStart {
    int count = 0 ;
        public static void main(String[] args) {
           insertAtStart obj = new insertAtStart();
            int a[] = new int [5];
            for(int j=0; j<a.length; j++)
            {
                obj.insert(a, j);
            }
        
    
        
        obj.print(a); 
    }
    
    public void insert(int a[], int val)
    {
        for(int i = a.length-1; i>0; i--)
        {
            a[i] = a[i-1];
        }
    
        a[0] = val;
    }
    
    public void print(int a[])
    {
        for(int i=0; i<a.length; i++)
        {
            System.out.print(a[i] + " ");
        }
    }
    }
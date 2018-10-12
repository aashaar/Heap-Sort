
public class HeapSort
{
    public static void main(String[] args)
    {
        //int array[] = {6,4,7,21,45,16,71};// ,23,56,2,89,57,47,105,98,}
        int array[] = {20,16,8,19,3,72,56,41,29,11,1,55,104,91,2,9,47,21,158,27,5};
        System.out.println("Initial array: ");
        System.out.println("Index - Value");
        for(int i=0;i<array.length;i++)
        {
            System.out.println("  "+i+"   -   "+array[i]);
        }
        System.out.println("The 1st element (Index = 0) stores the number of elements in the array");
        System.out.println("===========================================");


        for (int j=array[0]/2; j>0;j-- )
        {
            array = heapify(array,j);
        }

        System.out.println("Forming Max Heap : ");
        System.out.println("Index - Value");
        for(int i=0;i<array.length;i++)
        {
            System.out.println("  "+i+"   -   "+array[i]);
        }
        System.out.println("The 1st element (Index = 0) stores the number of elements in the array");
        System.out.println("===========================================");

        array = sort(array);

        System.out.println("Sorted Array : ");
        System.out.println("Index - Value");
        for(int i=0;i<array.length;i++)
        {
            System.out.println("  "+i+"   -   "+array[i]);
        }
        System.out.println("The sorted array starts from Index 1. The 1st element (Index = 0) is to be ignored. It is just a remainder of the calculations.");
        System.out.println("===========================================");

    }

    public static int[] sort (int A[])
    {
        for (int i=A[0];i>1;i--)
        {
            //swap 1st and last values
            int temp = A[1];
            A[1] = A[i];
            A[i] = temp;
            A[0] = A[0] -1;

             heapify(A,1);

        }
        //A[0] = A.length-1;
        return A;
    }

    static int[] heapify(int A[],int i)
    {
        //System.out.println("FLAG 01");
        if (i ==0)
        {
            //System.out.println("FLAG 02");
            return A;
        }
        int max = i;
        int leftChild = (2 * i);
        int rightChild = leftChild + 1;
        //System.out.println("FLAG 03" + "  max: "+max+"  lc: "+leftChild+"  rc "+rightChild);
        if(leftChild <= A[0] && A[leftChild] > A[max])
        {
            max = leftChild;
            //System.out.println("FLAG 04");
        }
        if(rightChild <= A[0] && A[rightChild] > A[max])
        {
            max = rightChild;
            //System.out.println("FLAG 05");
        }
        if (i != max)
        {
            int temp = A[i];
            A[i]= A[max];
            A[max] = temp;
            //System.out.println("FLAG 06");

            heapify(A,max);
        }
        return A;
    }
}

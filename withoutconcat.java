import java.util.Arrays;

class withoutconcat
   {
     public static void main(String[] args) 
    {
        int[] array1 = {1, 2, 3};
        int[] array2 = {2, 4, 3};

        int length = array1.length + array2.length;

        int[] result = new int[length];
        int pos = 0;
        for (int element : array1) 
        {
            result[pos] = element;
            pos++;
        }

        for (int element : array2) 
       {
            result[pos] = element;
            pos++;
        }

        System.out.println(Arrays.toString(result));
    }
}
class sorttest{
public static void sortColumns (int 
array[][])
    {
    for (int col = 0; col<=array[0].length - 1; col++)
         {
         int temp = 0;
         for (int row = 0, b=1; row<=array.length - 1; b=row+1, row++)
           {
            if (array[row][col] < array[b][col]) 
               {
               temp = array[b][col];  
               array[b][col] = array[row][col];
               array[row][col] = temp;
               }

            }
         }

    for (int col = 0; col<=array[0].length-1; col++)
         {
         for (int row = 0; row<=array.length-1; row++)
            {
            System.out.print (array[row][col] + " ");
            }

         }




}
public static void main(String[] args)
{
int array[][]=new int[][]{{23,12,43,4},{12,35,5,56}};
sortColumns(array);
}
}
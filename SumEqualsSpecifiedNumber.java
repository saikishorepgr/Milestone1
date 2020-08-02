public class SumEqualsSpecifiedNumber
{
    void sumEqualsSpecifiedNumber(int key, int arr[])
    {
        int iterator1,iterator2;
        for(iterator1=0;iterator1<arr.length-1;iterator1++)
        {
            for(iterator2=iterator1+1;iterator2<arr.length;iterator2++)
            {
                if(arr[iterator1]+arr[iterator2]==key)
                {
                    System.out.println(arr[iterator1] + " + " + arr[iterator2] + " = " + key);
                }
            }
        }
    }
}

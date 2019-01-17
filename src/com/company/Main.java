package com.company;

public class Main {

    public static void main(String[] args)
    {
        int[] arr1 = {-20, 3, 15, 81, 432};

        int index = binarySearch(arr1, 15);
        System.out.println(index);

        index = binarySearch(arr1, -20);
        System.out.println(index);

        index = binarySearch(arr1, 432);
        System.out.println(index);

        index = binarySearch(arr1, 53);
        System.out.println(index);
    }

    public static int binarySearch(int[] elements, int target)
    {
        int left = 0;
        int right = elements.length - 1;
        while(left <= right)
        {
            int middle = (left + right) / 2;
            if(target < elements[middle])
            {
                right = middle - 1;
            }
            else if(target > elements[middle])
            {
                left = middle + 1;
            }
            else
            {
                return middle;
            }
        }
        return -1;
    }
}

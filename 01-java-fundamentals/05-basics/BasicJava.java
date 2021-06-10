import java.util.ArrayList;
import java.util.Arrays;

public class BasicJava{
    public static void main(String[] args) {

        for(int i =1; i<255; i++){
            System.out.println(i);
        }

        for(int i=1; i<255; i++){
            if( i % 2 != 0){
                System.out.println(i);
            }
        }
        
        for (int i=1; i<255; i++){
            int sum = 1;
            sum = 1 + i;
            System.out.println(String.format("i :%d, sum: %d", i, sum));
        }
        int[] arrayX = {1,3,5,7,9,13};
        for (int i= arrayX[0]; i<arrayX.length; i++){
            System.out.println(arrayX[i]);
        }
        
        int[] arrayY = {-3, -5, -7};
        for (int i= arrayY[0]; i<arrayY.length; i++){
            int max = arrayY[0];
            if (int max > arrayY[i]){
                int max = arrayY[i];
            }
            System.out.println(arrayY[i]);
            }
        int sum =0;
        int[] arrayZ = {2, 10, 3};
        for (int i=0; i<arrayZ.length; i++){
            sum += arrayZ[i];
            }
        int average = (int)sum/arrayZ.length;
        System.out.println(String.format("Sum: %d, Average: %d", sum, average));
        }
}
            int count = 0;
            int[] myArray = {1,3,4,5};
            int y = 3;
            for(int i=myArray[0]; i<myArray.length; i++) {
                if(myArray[i] > y){
                    count ++;
                }
            }
            System.out.println(count);

            int[] myArrayB = {1, 5, 10, -2};
            for(int i=myArrayB[0]; i<myArrayB.length; i++){
                if(myArrayB[i] < 0){
                    myArrayB[i] = 0;
                }
            }
            System.out.println(myArrayB[i]);

            int[] myArrayC = {1, 5, 10, 7, -2}
		    for (int i = 1; i < arr.length; i++) {
			arr[i-1] = arr[i];
		    }
            arr[arr.length-1] = 0;
            System.out.println(myArrayC[i]);
	}

	public static int FindMax(int[] array) {
		int max = Integer.MIN_VALUE;
		for(int val: array){
			if(val > max)
				max = val;
		}
        return max;
    }
    public static int FindMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for(int val: array){
            if(val < min)
                min = val;
        }
        return min;
    }
    public static double GetAverage(int[] arrayZ) {
        int sum =0;
        int[] arrayZ = {2, 10, 3};
        for (int i=0; i<arrayZ.length; i++){
            sum += arrayZ[i];
            }
        int average = (int)sum/arrayZ.length;
        return average;
	}
    public static void MaxMinAverage(int[] nums) {
            int min = FindMin(nums);
            int max = FindMax(nums);
            double avg = GetAverage(nums);
            System.out.println(String.format("Max: %d, Min: %d, Average: %f", max, min, avg));
        }
}
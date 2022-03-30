// Name = Rahul Navin 
// Student id = 261062889
import java.util.Arrays;
import java.util.Random;

public class TMax {
    public static void main(String[] args) {
        int seed =  Integer.parseInt(args[0]);
        double[] array = getRandomArray(seed);
        System.out.println(thirdBiggest(array));
    }

    public static double[] getRandomArray(long seed){
        int lowerBound = 2;
        int upperBound = 10;
        // TODO change only the following part.

        Random ran = new Random(seed);
        int size = ran.nextInt((upperBound-lowerBound)+	1) + lowerBound;
        
        Random r = new Random(seed);
        double [] arr = new double[size];

        for (int i=0; i<arr.length; i++)	
        {

        	arr[i] = r.nextDouble();	
        
        }
        System.out.println(Arrays.toString(arr));
        return arr;

    }

    public static double thirdBiggest(double[] array){
        // TODO change only the following part.
    	System.out.println(" ");
    	double d;
    	int total = array.length;
    	if (total> 2)
    	{
    	for (int i = 0; i < total; i++)   
    	        {  
    	            for (int j = i + 1; j < total; j++)   
    	            {  
    	                if (array[i] > array[j])  
    	                {  
    	                    d = array[i];  
    	                    array[i] = array[j];  
    	                    array[j] = d;  
    	                }  
    	            }  
    	        }  
    	       return array[total-3];
    	}
    	else
    	{
    		if (array[0]> array[1])
    			return array[0];
    		
    		else 
    			return array[1];
    	}
    		
    }

 }

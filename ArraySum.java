// Name = Rahul Navin 
// Student id = 261062889
public class ArraySum {
	public static void main(String[] args) {
        int first = Integer.parseInt(args[0]);
        int[] firstArray = transform(first);
        int second = Integer.parseInt(args[1]);
        int[] secondArray = transform(second);
        int[] result = sum(firstArray, secondArray);
        print(result);
    }

    public static int[] transform(int num){
        // TODO change only the following part.
   
    	int length = Integer.toString(num).length(); 
    	int[] array = new int[length]; 
    	int i = 0; 
    	while(num!=0) 
    	{ 
    		array[length-i-1] = num%10; 
    		num=num/10; 
    		i++; 
    	} 
    	return array; 

    }

    public static int[] sum(int[] a, int[] b){
        // TODO change only the following part.
    	int length = a.length < b.length ? a.length : b.length; 
    	int[] result = new int[length]; 
    	for (int i = 0; i < length; i++) 
    	{ 
    		result[i] =a[i] + b[i]; 
    	} 
    	return result; 
 
    }


	public static void print(int[] array){
        System.out.print("[");
        for (int i = 0; i < array.length; i++){
            if(i != array.length - 1) {
                System.out.print(array[i] + ", ");
            }else{
                System.out.print(array[i] + "]");
            }
        }
    }


}

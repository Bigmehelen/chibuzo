import java.util.Arrays;
public class Categorize{

	public static int [] evaluate(int[] number){
		int multipleCount = 0;
		int count;
		int [] result = new int [2];

		for(count = 1; count < number.length; count++){

			if(number[count] % 5 == 0){		
				result[multipleCount] = number[count];
				multipleCount++;
			}
			
		}
		if(multipleCount == 0) System.out.print("No divisible number found");
		return result;
	}
}


public class CategorizeTest{

	public static void main( String [] args){
		
		int [] numbers = {21, 41, 10, 20,};

		System.out.print(Arrays.toString(Categorize.evaluate(numbers)));

	}

}

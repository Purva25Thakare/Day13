package com.bridzelabz.generics;

public class PrintMax {
		public static void toPrint(Integer[] inputArray) {
			for(int element : inputArray) {
				System.out.println("The array is :" +element);
				int max = inputArray[0];
				for(int i = 0;i<inputArray.length; i++)
				{
					if(inputArray[i]>max)
						max = inputArray[i];
				
				}
				}
			}
				
			/*public static void toPrint(Float[] inputArray) {
				for(float element : inputArray) {
					System.out.println("The array is :" +element);
						float max = inputArray[0];
						for(int i = 0;i<inputArray.length; i++)
						{
						if(inputArray[i]>max)
							max = inputArray[i];
						}
						System.out.println(+max);
					
				}
				}
				/*public static void toPrint(String[] inputArray) {
					for(String element : inputArray) {
						System.out.println("The array is :" +element);
						String max = inputArray[0];
						for(int i = 0;i<inputArray.length; i++)
						{
							if(inputArray[i]>max)
								max = inputArray[i];
						}
						PrintMax.toPrint(inputArray);
						System.out.println("The max of three numbers is :" +max);
					}
		}*/
		
		public static void main(String[] args) {
			Integer[] intArray = {25, 11, 4};
			Float[] floatArray = {25.8f, 11.03f, 4.7f};
			PrintMax.toPrint(intArray );
			//PrintMax.toPrint(floatArray );
			//PrintMax.toPrint(intArray );
			
			
	}

}
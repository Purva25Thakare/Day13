package com.bridzelabz.generics;

public class GenericMethod {  
		  public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
		    T max = x; 

		    if (y.compareTo(max) > 0)
		      max = y; 

		    if (z.compareTo(max) > 0)
		      max = z; 

		    return max; 
		  } 

		  public static void main(String args[]) {
		    System.out.println("Maximum of integers is: " +maximum(1, 11, 25));
		    System.out.printf("Maximum of Float is: ", maximum(2.6,8.66, 17.7));
		    //System.out.printf("Maximum of String is: ",  +compareTo("pear", "apple", "orange"));
		  }

}


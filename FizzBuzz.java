/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		for(int i = 1 ; i <= 100 ; ++i){
      if(i % (5*3) == 0){
        System.out.println("FizzBuzz");
      }else if(i % 3 == 0){
        System.out.println("Fizz");
      }else if(i % 5 == 0){
        System.out.println("Buzz");
      }else
        System.out.println(i);
    }
		
	
	}
}
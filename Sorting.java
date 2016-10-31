 package binary;
 import java.util.Arrays;
 import java.util.Scanner;

public class Sorting
{
	
int[]num = {64,32,98,12,2,78,11,35,47,8,6,13,46,12,24,1,84,38,43,58,17,77};
	
 public int[] sort(){             // sorting the given numbers
		    Arrays.sort(num);
			System.out.print("Sorted int array :");
			System.out.println();		
			for( int i=0;i<num.length;i++)
			{
				System.out.println(num[i]);
			}
			return num;
	}
	}

 class Searching extends Sorting implements Runnable {
	 

	 
 public void run() {     
				
	Thread t1 = new Thread();//searching the first half sorted numbers
	t1.start();
	int[] k =super.sort();
	System.out.println("elements after sorting are");
	for(int i =0;i<k.length/2;i++)
	  {
		System.out.println(k[i]);
		}
	Scanner S = new Scanner(System.in);
	System.out.println("enter no to search");
					
	int search = S.nextInt();
    for(int i =0;i<k.length/2;i++)
		{
        	if(search ==k[i])
						
       	{
			System.out.println("number found at index" +i);
			break;
			}
			else
			{
		
				System.out.println("number not found");
							
					}
				    }		
			 
					
					
    Thread t2 = new Thread();//searching the last half sorted numbers
	t2.start();
	System.out.println("elements after sorting are");
				
	for(int i =(k.length/2)+1;i<k.length;i++)
	{
		System.out.println(k[i]);
		}
	System.out.println("enter no to search");
	int search1 = S.nextInt();
					
					
	for(int i =(k.length/2)+1;i<k.length;i++)
	{
	 if(search1 ==k[i])
						
		{
		 System.out.println("number found at index" +i);
			break;
				}
	 
			else
			 {
		
			System.out.println("number not found");
							
		    	}
	S.close();
	
	       }
		}
			}
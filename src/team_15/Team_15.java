import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class texting {
	public static boolean ispala(String word)
	{
	    int i=0;
	    int j=word.length()-1;
	    while(j>i)
	    {
	        if(word.charAt(i)!=word.charAt(j))
	        { return false;}
	        i++;
	        j--;
	    }
	    return true;
	}
	    /**
	     * @param args the command line arguments
	     */
	    public static double getMedian(int []arr)
	    {
	        Arrays.sort(arr);
	        double median = arr[arr.length / 2];
	        if(arr.length % 2 == 0)
	        {
	            median = (arr[arr.length / 2] + arr[(arr.length / 2) - 1]) / 2.0;
	        }
	        return median;
	    }
	    
	    static void Shuffle(String s)
		{
			System.out.println("Shuffling!");
	    	int n = 0;
			char temp;
			Random rand;
			char [] arr = new char [s.length()];
			for(int i = 0; i < arr.length; i++)
				arr[i] = s.charAt(i);
			
			// if the input is 0 - 9
			if((int)arr[0] >= 48 && (int)arr[0] <= 57)
			{
				for(int i = 0; i < arr.length; i++)
				{
					
					rand = new Random();
					n = rand.nextInt(arr.length);
					temp = arr[i];
					arr[i] = arr[n];
					arr[n] = temp;
				}
				
				for (int i = 0; i < arr.length; i++)
					System.out.print((int) arr[i] - 48);
				return;
			}
			
			// if the input is a-z
			for(int i = 0; i < arr.length; i++)
			{
				rand = new Random();
				n = rand.nextInt(arr.length);
				temp = arr[i];
				arr[i] = arr[n];
				arr[n] = temp;
			}
			for (int i = 0; i < arr.length; i++)
				System.out.print(arr[i]);
			
		}
	    
	    public static void main(String[] args) {
	    	String check;
	    	System.out.println("Please enter the input: ");
	        Scanner input=new Scanner(System.in);
	        String word=input.next();
	        
	        // user enter the fn. to be executed
	        /*Add your function here*/
	        System.out.println("Enter Your Choice: ");
	        System.out.println("1) Palendrom Checking.");
	        System.out.println("2) Shuffling.");
	        System.out.println("0) Execute all functions.");
	        
	        
	        
	        
	        
	        
	        
	        
	        check=input.next();
	        if(check.equals("1"))
	        {
	        	boolean flag=ispala(word);
		        if(flag==true)
		        {
		            System.out.println("is pala");
		        }
		        else {
		            System.out.println("is not pala");
		        }
	        }
	        
	        else if(check.equals("2"))
	        {
	        	Shuffle(word);
	        }
	        
	        else if(check.equals("0"))
	        {
	        	boolean flag=ispala(word);
		        if(flag==true)
		        {
		            System.out.println("is pala");
		        }
		        else {
		            System.out.println("is not pala");
		        }
		        
		        Shuffle(word);
	        }
	        
	        // TODO code application logic here
	    }

}

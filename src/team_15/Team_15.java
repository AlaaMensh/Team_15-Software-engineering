import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Team_15 {
	public static void Shuffle(String s) {
		System.out.println("Shuffling!");
		int n = 0;
		char temp;
		Random rand;
		char[] arr = new char[s.length()];
		for (int i = 0; i < arr.length; i++)
			arr[i] = s.charAt(i);

		// if the input is 0 - 9
		if ((int) arr[0] >= 48 && (int) arr[0] <= 57) {
			for (int i = 0; i < arr.length; i++) {

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
		for (int i = 0; i < arr.length; i++) {
			rand = new Random();
			n = rand.nextInt(arr.length);
			temp = arr[i];
			arr[i] = arr[n];
			arr[n] = temp;
		}
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i]);

	}

	public static boolean ispala(String word) {
		int i = 0;
		int j = word.length() - 1;
		while (j > i) {
			if (word.charAt(i) != word.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

	/**
	 * @param args the command line arguments
	 */
	public static int[] convertStringToIntArr(String s) {
		String[] sArr = s.split(" ");
		int[] arr = new int[sArr.length];
		for (int i = 0; i < sArr.length; i++) {
			try {
				arr[i] = Integer.parseInt(sArr[i]);
			} catch (Exception e) {
				continue;
			}
		}
		return arr;
	}

	public static double getMedian(int[] arr) {
		if (arr.length == 0) {
			System.out.println("Array is empty or There's no numbers.");           
		double median = arr[arr.length / 2];
		if (arr.length % 2 == 0) {
			median = (arr[arr.length / 2] + arr[(arr.length / 2) - 1]) / 2.0;
		}
		return median;
	}

	public static int[] sortArray(int [] value) //Ibrahim20160004
	{
		for (int i = 0; i < value.length; i++)
		{
			for(int j=i+1;j<value.length;j++)
			{
				if(value[j]<value[i])
				{
					int temp=value[i];
					value[i]=value[j];
					value[j]=temp;
				}
			}
		}  return value;
	}

//get_average function #14
	public static void get_average()
	{
		while(true) {
				Scanner sc = new Scanner(System.in);

			    System.out.print("Enter the number of elements: \n" );
			  double n = sc.nextInt();

			    double sum = 0.0;

			    for (int i = 0; i < n; i++) {
			        System.out.print("Enter element "+ (i + 1) + ": \n");
			        int a = sc.nextInt();
			        sum += a;
			    }

			    double average = sum / n;

			    System.out.println("Average value of array elements is : \n" + average);
			    System.out.println("press 0 to exit or any other number to continue : \n");
		        int x = sc.nextInt();
		        if(x==0)
		        	break;
		        
		    }
		
	}
	
	public static void main(String[] args) {
		String check;
		System.out.println("Please enter the input: ");
		Scanner input = new Scanner(System.in);
		String word = input.next();

		// user enter the fn. to be executed
		/* Add your function here */
		System.out.println("Enter Your Choice: ");
		System.out.println("1) Palendrom Checking.");
		System.out.println("2) Shuffling.");
		System.out.println("3) Get Median.");
		System.out.println("4) Sort");
		System.out.println("0) Execute all functions.");
	   System.out.println("14) get average");
		check = input.next();

		if (check.equals("1")) {
			boolean flag = ispala(word);
			if (flag == true) {
				System.out.println("is pala");
			} else {
				System.out.println("is not pala");
			}
		}

		else if (check.equals("2")) {
			Shuffle(word);
			}
	
		else if (check.equals("3")) {
			// Get Median
			if (getMedian(convertStringToIntArr(word)) != -1.00251) {
				System.out.println(getMedian(convertStringToIntArr(word)));
			}
		}
		
		else if( check.equals("14") )
		{
			get_average();
		}

		else if (check.equals("0")) {
			boolean flag = ispala(word);
			if (flag == true) {
				System.out.println("is pala");
			} else {
				System.out.println("is not pala");
				
			}

			Shuffle(word);
			
			get_average();
		}
	}

}

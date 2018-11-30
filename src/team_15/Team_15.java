import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Team_15 {
	/******************************************/
    public static Integer[] strArrayToIntArray(String[] a){
        Integer [] b = new Integer[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = Integer.parseInt(a[i]);
        }

        return b;
    }
    /******************************************//**20160046 Osama_Shahat*/
	public static int[] Get3Max_numbers(Integer [] array)
	{
		System.out.println("Get3Max_numbers");
	    Arrays.sort(array,Collections.reverseOrder());
	   // array.sort(Collections.reverseOrder());
	    int [] arr=new int[3];
	    //System.out.print("The 3 max numbers : ");
	    for(int x=0;x<=2;x++)
	    {
	        arr[x]=array[x];
	    }
	    return arr;
	}
/************************************************/
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
		System.out.ptintln("getMedian");
		System.out.println("Input must be between numbers space ex:1 2 3");//1 2 3 4 5
		if (arr.length == 0) {
			System.out.println("Array is empty or There's no numbers.");
			return -1.00251;
		}
		Arrays.sort(arr);
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
	public static void MRV (String text)
	{
		ArrayList <String> letters = new ArrayList <String>();
		ArrayList <Integer> NumOfRepeated = new ArrayList <Integer>() ;
		ArrayList <String> mostrepeatedvalue = new ArrayList <String>();
		int sum = 1 ; 
		for (int i = 0 ; i < text.length() ; )
		{	
			sum = 1 ;
			char firstchar = text.charAt(0) ;
			for (int j = 1 ; j < text.length() ; j++)
			{	
				if (firstchar == text.charAt(j))
				{
					sum++; 
				}
			}
			letters.add(firstchar + "");
			NumOfRepeated.add(sum) ;
			text=text.replace(text.charAt(0)+"", "");
			if (text == "")
				break ;
		}
		int mx = NumOfRepeated.get(0);
		int idx = 0 ;
		for (int i = 1 ; i< letters.size()-1 ; i++ )
		{
			 
			if (mx < NumOfRepeated.get(i))
			{
				mx = NumOfRepeated.get(i) ;
				idx = i ;
			}
		}
		
		System.out.println(letters);
		System.out.println(NumOfRepeated);
		for (int i = 0 ; i<letters.size() ; i++)
		{
			if (NumOfRepeated.get(idx) == NumOfRepeated.get(i))
			{
				mostrepeatedvalue.add(letters.get(i)) ;
			}
		}
		System.out.println("The Most Repeated Value is : " + mostrepeatedvalue);
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
		System.out.println("5) Get the Max 3 Numbers.");
		System.out.println("0) Execute all functions.");

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
		} else if (check.equals("3")) {
			// Get Median
			if (getMedian(convertStringToIntArr(word)) != -1.00251) {
				System.out.println(getMedian(convertStringToIntArr(word)));
			}
		}else if (check.equals("5"))
		{
			String[] x = word.split("");
	        //Integer[] arr = new Integer[x.length];
	            System.out.println(Get3Max_numbers(strArrayToIntArray(x)));
		} else if (check.equals("0")) {
			boolean flag = ispala(word);
			if (flag == true) {
				System.out.println("is pala");
			} else {
				System.out.println("is not pala");
			}

			Shuffle(word);

			if (getMedian(convertStringToIntArr(word)) != -1.00251)
			{
				System.out.println(getMedian(convertStringToIntArr(word)));
			}
			String[] x = word.split("");
	        //Integer[] arr = new Integer[x.length];
	            System.out.println(Get3Max_numbers(strArrayToIntArray(x)));
		}
	}
	void minimum(int[]arr) {

        
        Arrays.sort(arr); 
        int ar[]=new int[3];
        
        for (int i=0;i<3;i++) {
        	ar[i]=arr[i];
        }
        System.out.printf("Modified arr[] : %s", 
                Arrays.toString(ar)); 



}

}

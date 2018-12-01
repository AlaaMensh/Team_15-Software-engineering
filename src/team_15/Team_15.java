import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Team_15 {
    public static void smallprime(int[] n){
        int min=n[0];
        for (int o:n){
            if (isPrime(o)){
                if (o<min){min=o;}
            }
        }
        System.out.println("smallest prime : "+min);;
    }

    /******************************************/
    public static Integer[] strArrayToIntArray(String[] a) {
        Integer[] b = new Integer[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = Integer.parseInt(a[i]);
        }

        return b;
    }

    /******************************************/
    /**
     * 20160046 Osama_Shahat
     */
    public static int[] Get3Max_numbers(Integer[] array) {
        System.out.println("Get3Max_numbers");
        Arrays.sort(array, Collections.reverseOrder());
        // array.sort(Collections.reverseOrder());
        int[] arr = new int[3];
        // System.out.print("The 3 max numbers : ");
        for (int x = 0; x <= 2; x++) {
            arr[x] = array[x];
        }
        return arr;
    }

    private static boolean Check_Sorted() {
        System.out.println("FN Check Sorted");
        int Size;
        System.out.println("Enter the Size");
        Scanner in = new Scanner(System.in);
        Size = in.nextInt();
        char[] arr = new char[Size];
        for (int i = 0; i < Size; i++) {
            arr[i] = in.nextLine().charAt(0);
        }
        for (int counter1 = 0; counter1 < Size - 1; counter1++)
            if (arr[counter1] > arr[counter1 + 1])
                return false;
        return true;
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

    /* ================ 20160007 Ahmed Ehab====================================== */
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
        System.out.println("getMedian");
        System.out.println("Input must be between numbers space ex:1 2 3");// 1 2 3 4 5
        if (arr.length == 0) {
            System.out.println("Array is empty or There's no numbers.");
            double median = arr[arr.length / 2];
            if (arr.length % 2 == 0) {
                median = (arr[arr.length / 2] + arr[(arr.length / 2) - 1]) / 2.0;
            }
            return median;
        }
    }
    /**************************************************************************************/

    public static int[] sortArray(int[] value) // Ibrahim20160004
    {
        for (int i = 0; i < value.length; i++) {
            for (int j = i + 1; j < value.length; j++) {
                if (value[j] < value[i]) {
                    int temp = value[i];
                    value[i] = value[j];
                    value[j] = temp;
                }
            }
        }
        return value;
    }
	
	/**************************************************************************************/
    public static <T> ArrayList<T> ReverseArray (ArrayList<T> array) //mazen gera ///////////
    {
        ArrayList<T> ReverseArr =new ArrayList<>();
        for(int i=array.size()-1 ; i>=0 ;i--)
        {
            ReverseArr.add(array.get(i));
        }
        for(int i=0 ; i<ReverseArr.size() ; i++)
        {
            System.out.print(ReverseArr.get(i) + " ");
        }

        return ReverseArr;
    }

    public static String ReturnOnlyPrimes(int n) // Diaa 20160121
    {
        String factors = "";
        int max_divisor = sqrt(n);
        for (int i = 2; i <= max_divisor; i++) {
            while (n % i == 0) {
                n /= i;
                max_divisor = sqrt(n);
                if (n == 1)
                    factors = factors + Integer.valueOf(i).toString();
                else
                    factors = factors + Integer.valueOf(i).toString() + "*";
            }
        }
        // check for the last prime divisor
        if (n != 1)
            factors = factors + Integer.valueOf(n).toString();

        System.out.println(factors);
    }

    public static void MRV(String text) {
        ArrayList<String> letters = new ArrayList<String>();
        ArrayList<Integer> NumOfRepeated = new ArrayList<Integer>();
        ArrayList<String> mostrepeatedvalue = new ArrayList<String>();
        int sum = 1;
        for (int i = 0; i < text.length(); ) {
            sum = 1;
            char firstchar = text.charAt(0);
            for (int j = 1; j < text.length(); j++) {
                if (firstchar == text.charAt(j)) {
                    sum++;
                }
            }
            letters.add(firstchar + "");
            NumOfRepeated.add(sum);
            text = text.replace(text.charAt(0) + "", "");
            if (text == "")
                break;
        }
        int mx = NumOfRepeated.get(0);
        int idx = 0;
        for (int i = 1; i < letters.size() - 1; i++) {

            if (mx < NumOfRepeated.get(i)) {
                mx = NumOfRepeated.get(i);
                idx = i;
            }
        }

        System.out.println(letters);
        System.out.println(NumOfRepeated);
        for (int i = 0; i < letters.size(); i++) {
            if (NumOfRepeated.get(idx) == NumOfRepeated.get(i)) {
                mostrepeatedvalue.add(letters.get(i));
            }
        }
        System.out.println("The Most Repeated Value is : " + mostrepeatedvalue);
    }

    /***********************************************************************************************************/
    // Zero If Less Than Zero Function 
    public static void Zero(int[] x) {
        for (int i = 0; i < x.length; i++) {
            if (x[i] < 0)
                x[i] = 0;

        }
        System.out.println("The array after applying function: Zero If less than zero...");
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);

        }
    }


    /***********************************************************************************************************/
    public static void removeDuplicates(String word){
        String[] temp = word.split(" ");
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> distinctNumbers = new ArrayList<>();
        for(int i=0 ; i< temp.length ; i++){
            numbers.add(Integer.parseInt(temp[i]));
        }
        for(int i=0 ;i<numbers.size() ; i++){
            if(! distinctNumbers.contains(numbers.get(i))){
                distinctNumbers.add(numbers.get(i));
            }
        }


        System.out.println("Remove duplicates : " +distinctNumbers);

    }
    /***********************************************************************************************************/
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
    /*==============================================================================================================*/
    /************* Nermine Mohsen 20160327**************/
    public static boolean isPrime(int sample) {
        int i;
        boolean flag = false;
        if (sample == 0 || sample == 1) {
            return false;
        }
        else {
            for (i = 2; i <= (sample / 2); i++) {
                if (sample % i == 0) {
                 //   flag = true;
                    return false;
                   // break;
                }
            }
            if (!flag) {
                return true;
            }
        }
        return true;
    }
    public static int CountPrime(Vector<Integer> container){
        boolean result;
        int count=0;
        for (int x:container){
                result=isPrime(x);
                if (result){count++;}
        }
        return count;
    }
    /********************************************************************************************************************************/
    
    /********************************************************************************************************************************/
    /* ----------------- Nada Bassem -------------------------- */
    static boolean isPrimeOr(int n) 
    { 
        if (n <= 1) 
            return false; 
       
        for (int i = 2; i < n; i++) 
            if (n % i == 0) 
                return false; 
       
        return true; 
    } 
      
	static void findLargestPrime(int [] arr){
		Arrays.sort(arr);
		Vector <Integer> primes = new Vector<Integer>();
		for(int i=0 ; i<arr.length;i++){
			if(isPrimeOr(arr[i])) {
				primes.add(arr[i]);
			}
		}
		if(primes.size()==0) {
			System.out.println("No Primes Found");
			return;
		}
		System.out.println(primes.elementAt(primes.size()-1));
	}
	/********************************************************************************************************************************/


    public static void main(String[] args) {
        String check;
        System.out.println("Please enter the input: ");
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        int prime = Integer.parseInt(word);

        // user enter the function to be executed
        /* Add your function here */
        System.out.println("Enter Your Choice: ");
        System.out.println(" 1) Palendrom Checking.");
        System.out.println(" 2) Shuffling.");
        System.out.println(" 3) Get Median.");
        System.out.println(" 4) Sort");
        System.out.println(" 5) Get the Max 3 Numbers.");
        System.out.println(" 6) Check Sorted Array.");
        System.out.println(" 7) Returning only primes");
        System.out.println(" 8) Zero If Less Than Zero.");
        System.out.println(" 9) Remove Duplicates");
	      System.out.println("14) get average");
        System.out.println(" 0) Execute all functions.");

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
        else if (check.equals("3")) {// Get Median
            if (getMedian(convertStringToIntArr(word)) != -1.00251) {
                System.out.println(getMedian(convertStringToIntArr(word)));
            }
        } 
        else if (check.equals("4")) {
            int[] arr = sortArray(convertStringToIntArr(word));
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        } 
        else if (check.equals("5")) {
            String[] x = word.split("");
            System.out.println(Get3Max_numbers(strArrayToIntArray(x)));
        } 
        else if (check.equals("6")) {
            if (Check_Sorted())
                System.out.println("Array is Sorted");
            else
                System.out.println("Array is Not Sorted");
        } 
        else if (check.equals("7")) {
            // Return only primes
            ReturnOnlyPrimes(prime);
        }
        else if (check.equals("8")) {
            Zero(convertStringToIntArr(word));

        }
        else if (check.equals("9")) {
           removeDuplicates(word);

        }
 	else if (check.equals("10")) {
            findLargestPrime(prime);

         }
        else if (check.equals("14")) {
            get_average();
        } else if (check.equals("0")) {

            boolean flag = ispala(word);
            if (flag == true) {
                System.out.println("is pala");
            } else {
                System.out.println("is not pala");

            }

            Shuffle(word);
            removeDuplicates(word);

            get_average(); //====> Get Average <====//

            if (getMedian(convertStringToIntArr(word)) != -1.00251) {
                System.out.println(getMedian(convertStringToIntArr(word)));
            }

            String[] x = word.split("");
            System.out.println(Get3Max_numbers(strArrayToIntArray(x)));

            if (Check_Sorted())
                System.out.println("Array is Sorted");
            else
                System.out.println("Array is Not Sorted");

            ReturnOnlyPrimes(prime);
        }

    }

    void minimum(int[] arr) {

        Arrays.sort(arr);
        int ar[] = new int[3];

        for (int i = 0; i < 3; i++) {
            ar[i] = arr[i];
        }
        System.out.printf("Modified arr[] : %s", Arrays.toString(ar));

    }

}

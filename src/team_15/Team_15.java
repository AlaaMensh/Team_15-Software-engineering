import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class d {
    public static void Shift_Arr(String s)
    {
        char temp = s.charAt(0);
        for(int i=1 ; i<(s.length()) ; i++)
        {
            System.out.print(s.charAt(i));
        }
        System.out.print(temp);
        System.out.println();
    }
    /************* Nermine Mohsen 20160327**************/
    public static boolean isPrime(int sample) {
        int i;
        boolean flag = false;
        if (sample == 0 || sample == 1) {
            return false;
        } else {
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
    public static void CountPrime(int[] container) { /////////////////////edit
        boolean result;
        int count = 0;
        for (int x : container) {
            result = isPrime(x);
            if (result) {
                count++;
            }
        }
        System.out.println("prime count = "+count);    }
    /**
     * 20160046 Osama_Shahat
     */
    public static void Get3Max_numbers(int[] array) {
        System.out.println("Get3Max_numbers");
        int []newarr=new int[array.length];
        for (int o=0;o<array.length;o++){
            newarr[o]=array[o];
        }
        Arrays.sort(newarr);
        // array.sort(Collections.reverseOrder());
        int[] arr = new int[3];
         System.out.println("The 3 max numbers : ");
        int i = 0;
        for (int x = newarr.length - 1; x >= 0&&i<3; x--, i++) { /////////////////////edit
            arr[i] = newarr[x];
            System.out.print(newarr[x]+" ");
        }
       // return arr;
    }
    private static void Check_Sorted(int[] arr) {
        int Size = arr.length;
        for (int counter1 = 0; counter1 < Size - 1; counter1++){
            if (arr[counter1] > arr[counter1 + 1]){
                System.out.println("not sorted ");
                return;}}
        System.out.println("sorted");
        return ;
    }
    /************************************************/
    public static void Shuffle(String s) {
        String[] arr = s.split(" ");
        //int[] arr = new int[sArr.length];
        //String ans = new String();
        System.out.println("Shuffling!");
        int n = 0;
        char temp;
        Random rnd = ThreadLocalRandom.current();
        for (int i = arr.length - 1; i > 0; i--)
        {
            int index = rnd.nextInt(i + 1);
            // Simple swap
            String tmp = arr[index];
            arr[index] = arr[i];
            arr[i] = tmp;
        }

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i]+" ");
        return;


    }
    public static void ispala(String word) {
        int i = 0;
        int j = word.length() - 1;
        while (j > i) {
            if (word.charAt(i) != word.charAt(j)) {
                System.out.println("is not pala");
                return;
            }
            i++;
            j--;
        }
        System.out.println("is pala");
        return;    }
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
    public static void getMedian(int[] arr) {
        if (arr.length == 0) {
            System.out.println("Array is empty or There's no numbers.");
        } /////////////////////edit
        double median = arr[arr.length / 2];
        if (arr.length % 2 == 0) {
            median = (arr[arr.length / 2] + arr[(arr.length / 2) - 1]) / 2.0;
        }
        System.out.println("median = "+ median);

    }

    public static void smallprime(int[] n){
        int min=n[0];
        for (int o:n){
            if (isPrime(o)){
                if (o<min){min=o;}
            }
        }
        System.out.println("smallest prime : "+min);;
    }
    /*
     * =============================================================================
     * ==========
     */
    public static void get_average(int arr[])
    {

        double sum = 0.0;
        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];
        }
        double average = sum / arr.length;
        System.out.println("Average value of array elements is : \n" + average);

    }
    public static void minimumthree(int[] arr) {
        Vector <Integer> ans = new Vector<Integer>();
        for(int i=0 ; i<arr.length;i++){
            ans.add(arr[i]);
        }
        Collections.sort(ans);
        int ar[] = new int[3];
        for (int i = 0; i < 3&&i<ans.size(); i++) {
            ar[i] = ans.get(i);
        }
        System.out.println("smallest three numbers : ");
        for (int k:ar){
            System.out.println(k);
        }

    }
    public static void sortArray(int[] org) // Ibrahim20160004
    {
        int []value=new int[org.length];
        for (int o=0;o<org.length;o++){
             value[o]=org[o];
        }
        for (int i = 0; i < value.length; i++) {
            for (int j = i + 1; j < value.length; j++) {
                if (value[j] < value[i]) {
                    int temp = value[i];
                    value[i] = value[j];
                    value[j] = temp;
                }
            }
        }
        for (int o=0;o<value.length;o++){
            System.out.println(value[o]);
        }
    }
    public static void ReverseArray(String array) //mazen gera ///////////
    {//////////EDIT
        String ReverseArr = "";
        for (int i = array.length() - 1; i >= 0; i--) {
            ReverseArr += (array.charAt(i));
        }

        System.out.println("Reversed ARR: "+ReverseArr);
    }
    public static void ReturnOnlyPrimes(int[] n) // Diaa 20160121
    {
        System.out.println("primes are:");
        for (int o : n) {
            if (isPrime(o)) {
                System.out.println(o + " ");
            }
        }
    }
    public static void removeDuplicates(int[] numbers){
        ArrayList<Integer> distinctNumbers = new ArrayList<>();

        for(int i=0 ;i<numbers.length ; i++){
            if(! distinctNumbers.contains(numbers[i])){
                distinctNumbers.add(numbers[i]);
            }
        }
        System.out.println("Remove duplicates : " +distinctNumbers);
    }
    public static void MRV(int [] data) {
       Vector<Integer> x=new Vector<>();
       int ans=0,maxfreq=0,freq=0;
       for (int o : data){
           x.add(o);
       }
       for (int o:x){
           freq=Collections.frequency(x,o);
           if (freq>maxfreq){
               maxfreq=freq;
               ans=o;
           }
       }
       System.out.println("The Most Repeated Value is : " + ans + " repeated "+ maxfreq+" times");
    }

    static void findLargestPrime(int [] arr){
      //  Arrays.sort(arr);
        Vector <Integer> primes = new Vector<Integer>();
        for(int i=0 ; i<arr.length;i++){
            if(isPrime(arr[i])) {
                primes.add(arr[i]);
            }
        }
        Collections.sort(primes);
        if(primes.size()==0) {
            System.out.println("No Primes Found");
            return;
        }
        System.out.println("largest prime : "+primes.elementAt(primes.size()-1));
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
    public static void main(String[] args) {
        String check;
        System.out.println("Please enter the input: ");
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        int[] num = convertStringToIntArr(word);
        System.out.println("Enter Your Choice: ");
        System.out.println("1) Palendrom Checking.");
        System.out.println("2) Shuffling.");
        System.out.println("3) Get Median.");
        System.out.println("4) Sort");
        System.out.println("5) Get the Max 3 Numbers.");
        System.out.println("6) Check Sorted Array.");
        System.out.println("7) Returning only primes");
        System.out.println("8) Zero If Less Than Zero.");
        System.out.println("9) Count Prime");
        System.out.println("10) Reverse Array");
        System.out.println("11) Remove duplicates");
        System.out.println("12) Most repeated value");
        System.out.println("13) Smallest prime");
        System.out.println("14) get average");
        System.out.println("15) shift array");
        System.out.println("16) largest prime");
        System.out.println("17) minimum 3 values");

        System.out.println("0) Execute all functions.");
        System.out.println("E) to exit");
        check = input.next();
        while (check.equals("E") == false) {
            if (check.equals("1")) {
                 ispala(word);
            }
            else if (check.equals("2")) {
                Shuffle(word);
            } else if (check.equals("3")) {// Get Median
                getMedian(num);
            } else if (check.equals("4")) {
                sortArray(num);
            } else if (check.equals("5")) {
                Get3Max_numbers(num);
            } else if (check.equals("6")) {
                Check_Sorted(num);
            } else if (check.equals("7")) {
                ReturnOnlyPrimes(num);
            } else if (check.equals("8")) {
                Zero(num);

            } else if (check.equals("9")) {
                CountPrime(num);
            } else if (check.equals("10")) {
                ReverseArray(word);
            }
            else if (check.equals("11")) {
                removeDuplicates(num);
            } else if (check.equals("12")) {
                MRV(num);
            }
            else if (check.equals("13")) {
                smallprime(num);
            }
            else if (check.equals("14")) {
                get_average(num);
            }
            else if (check.equals("15")) {
                Shift_Arr(word);
            }
            else if (check.equals("16")) {
                findLargestPrime(num);
            }
            else if (check.equals("17")) {
                minimumthree(num);
            }
            else if (check.equals("0")) {
                 ispala(word);
                Shuffle(word);
                Zero(num);
                sortArray(num);
                getMedian(num);
                Get3Max_numbers(num);
                Check_Sorted(num);
                ReturnOnlyPrimes(num);
                CountPrime(num);
                ReverseArray(word);
                removeDuplicates(num);
                smallprime(num);
                get_average(num);
                Shift_Arr(word);
                findLargestPrime(num);
                MRV(num);
                minimumthree(num);


            }
            System.out.println("Enter Your Choice: ");
            System.out.println("1) Palendrom Checking.");
            System.out.println("2) Shuffling.");
            System.out.println("3) Get Median.");
            System.out.println("4) Sort");
            System.out.println("5) Get the Max 3 Numbers.");
            System.out.println("6) Check Sorted Array.");
            System.out.println("7) Returning only primes");
            System.out.println("8) Zero If Less Than Zero.");
            System.out.println("9) Count Prime");
            System.out.println("10) Reverse Array");
            System.out.println("11) Remove duplicates");
            System.out.println("12) Most repeated value");
            System.out.println("13) Smallest prime");
            System.out.println("14) get average");
            System.out.println("15) shift array");
            System.out.println("16) largest prime");
            System.out.println("17) minimum 3 values");
            System.out.println("0) Execute all functions.");
            System.out.println("E) to exit");
            check = input.next();
        }
    }



}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package team_15;

import java.util.Scanner;

/**
 *
 * @author FUTURE
 */
import java.util.Arrays;

public class Team_15 {
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
            return -1.00251;
        }
        Arrays.sort(arr);
        double median = arr[arr.length / 2];
        if (arr.length % 2 == 0) {
            median = (arr[arr.length / 2] + arr[(arr.length / 2) - 1]) / 2.0;
        }
        return median;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.next();
        boolean flag = ispala(word);
        if (flag == true) {
            System.out.println("is pala");
        } else {
            System.out.println("is not pala");
        }
        // Get Median
        if(getMedian(convertStringToIntArr(word)) != -1.00251){
            System.out.println(getMedian(convertStringToIntArr(word)));
        }
    }

}

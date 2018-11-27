/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team_15;

/**
 *
 * @author FUTURE
 */
public class Team_15 {

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
    public static void main(String[] args) {
        System.out.print("hello");
        // TODO code application logic here
    }
    
}

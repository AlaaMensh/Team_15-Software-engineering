/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shift_array;

import java.util.Scanner;

/**
 *
 * @author ELADWYSOFT
 */
 
public class Shift_Array {
    public static void Shift_Arr(char []arr)
    {
        
        char temp = arr[0];
        for(int i=1 ; i<(arr.length) ; i++)
        {            
            System.out.print(arr[i]);
        }
        System.out.print(temp);
        System.out.println();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        int arr_size ; 
        System.out.println("Please Enter the size of the array :");
        arr_size = input.nextInt();
        char []array=new char[arr_size];
        System.out.println("Enter elements of the array :");
        for(int i=0 ; i<arr_size ;i++)
        {
            array[i]=input.next().charAt(0);
        }
        System.out.println("The Array after shifting :");
        Shift_Arr(array);
    }
    
}

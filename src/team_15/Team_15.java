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
public class Team_15 {
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
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String word=input.next();
        boolean flag=ispala(word);
        if(flag==true)
        {
            System.out.print("is pala");
        }
        else {
            System.out.print("is not pala");
        }
        
       
        
        // TODO code application logic here
    }
    
}

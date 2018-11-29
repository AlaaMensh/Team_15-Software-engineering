import java.util.Scanner;
import java.util.ArrayList;
public class MostRepeatedValue {

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
		Scanner str = new Scanner (System.in);
		String text = str.nextLine() ;
		MRV (text) ;
	}
}

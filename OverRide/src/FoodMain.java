import java.util.*;
public class FoodMain {
	public static void main(String [] args){
		int n,m,temp=0,ans=0;
		System.out.println("Enter Number:");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		n = Integer.parseInt(str);
		m = n;
		for(int i=0; i<str.length();i++)
		{
			temp = m % 10;
			m = m / 10;
			ans += temp*temp*temp;
			System.out.println(m);
		}
		
		if(ans == n){
			
			System.out.println("Armstrong");
		}
		else
		{
			System.out.println("Not Armstrong");
			
			
			
			
		}
	}
}


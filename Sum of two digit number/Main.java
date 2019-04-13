import java.util.*;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner sc=new Scanner(System.in);
      int num=sc.nextInt();
      int first=num/10;
      int second=num%10;
      //int sum=(num/10)/10;
      System.out.println(first+second);
    }
}
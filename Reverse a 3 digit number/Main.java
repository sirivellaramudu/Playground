import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc =new Scanner(System.in) ;
    int first, second, last, reverse;
    int n=sc.nextInt();
    first=n/100;
    second=((n/10)%10);
            last=n%10;
             reverse=(last*100)+(second*10)+first;
    System.out.println(reverse) ;
  }
}
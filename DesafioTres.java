import java.util.Scanner;

public class DesafioTres {
  public static void main (String[] args)
  {
    Scanner scanner = new Scanner (System.in);

    int n = scanner.nextInt ();
    int k = scanner.nextInt ();
    int[] arr = new int[n];

    for (int i = 0; i < n; i++)
    {
	    arr[i] = scanner.nextInt ();
    }

    int count = 0;
    for (int i = 0; i < n; i++)
    {
    	for (int j = i + 1; j < n; j++)
    	{
    	 if (Math.abs (arr[i] - arr[j]) == k)
            count++;
    	}
    }
    System.out.println(count);
  }
}

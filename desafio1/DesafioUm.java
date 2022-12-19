import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DesafioUm {
    public static void main(String[] args) {
        
        ArrayList<Integer> pares = new ArrayList<>();
        ArrayList<Integer> impares = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();

            if (num % 2 == 0) 
            {
                pares.add(num);
            } 
            else 
            {
                impares.add(num);
            }
        }

        Collections.sort(pares);
        Collections.sort(impares);
        Collections.reverse(impares);

        for (int num : pares) 
        {
            System.out.println(num);
        }
        for (int num : impares) 
        {
            System.out.println(num);
        }
    }
}

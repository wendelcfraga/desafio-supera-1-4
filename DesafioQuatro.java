import java.util.Scanner;

public class DesafioQuatro {
    public static void main(String[] args) {
        
    Scanner ler = new Scanner(System.in);

    int n = ler.nextInt();
    ler.nextLine();
    int i = 0; 
    do 
    {
        String s = ler.nextLine();
    
        int metade = s.length() / 2;
        String primeiraMetade = s.substring(0, metade);
        String segundaMetade = s.substring(metade);
    
        String reverterPrimeira = new StringBuilder(primeiraMetade).reverse().toString();
        String reverterSegunda = new StringBuilder(segundaMetade).reverse().toString();
    
        System.out.println(reverterPrimeira + reverterSegunda);
        i++;
    } while (i < n);

    ler.close();
  }
}

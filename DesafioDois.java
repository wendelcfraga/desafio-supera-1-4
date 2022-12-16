import java.util.Scanner;

public class DesafioDois {
  public static void main (String[] args)
  {
    Scanner scanner = new Scanner (System.in);

    double valor = scanner.nextDouble ();

    int notas100 = (int) (valor / 100);
      valor -= notas100 * 100;

    int notas50 = (int) (valor / 50);
      valor -= notas50 * 50;

    int notas20 = (int) (valor / 20);
      valor -= notas20 * 20;

    int notas10 = (int) (valor / 10);
      valor -= notas10 * 10;

    int notas5 = (int) (valor / 5);
      valor -= notas5 * 5;

    int notas2 = (int) (valor / 2);
      valor -= notas2 * 2;

    int moedas1 = (int) (valor / 1);
      valor -= moedas1 * 1;

    int moedas050 = (int) (valor / 0.50);
      valor -= moedas050 * 0.50;

    int moedas025 = (int) (valor / 0.25);
      valor -= moedas025 * 0.25;

    int moedas010 = (int) (valor / 0.10);
      valor -= moedas010 * 0.10;

    int moedas005 = (int) (valor / 0.05);
      valor -= moedas005 * 0.05;

    int moedas001 = (int) (valor / 0.01);
      valor -= moedas001 * 0.01;

    System.out.println ("NOTAS:");
    System.out.println (notas100 + " nota(s) de R$ 100.00");
    System.out.println (notas50 + " nota(s) de R$ 50.00");
    System.out.println (notas20 + " nota(s) de R$ 20.00");
    System.out.println (notas10 + " nota(s) de R$ 10.00");
    System.out.println (notas5 + " nota(s) de R$ 5.00");
    System.out.println (notas2 + " nota(s) de R$ 2.00");
    System.out.println ("MOEDAS:");
    System.out.println (moedas1 + " moeda(s) de R$ 1.00");
    System.out.println (moedas050 + " moeda(s) de R$ 0.50");
    System.out.println (moedas025 + " moeda(s) de R$ 0.25");
    System.out.println (moedas010 + " moeda(s) de R$ 0.10");
    System.out.println (moedas005 + " moeda(s) de R$ 0.05");
    System.out.println (moedas001 + " moeda(s) de R$ 0.01");
  }
}

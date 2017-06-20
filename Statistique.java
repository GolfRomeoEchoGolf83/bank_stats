package bank_stats;
import java.util.*;

public class Statistique {
	public static void main (String [] arg)
	{
		int nbCB = 0, nbCheque = 0, nbVirement = 0, nbDebit = 0;
		float prctCB, prctCh, prctVi;
		
		Scanner lectureClavier = new Scanner(System.in);
		System.out.print("Nombre de paiements par Carte Bleue : ");
		nbCB = lectureClavier.nextInt();
		System.out.print("Nombre de chèques émis : ");
		nbCheque = lectureClavier.nextInt();
		System.out.println("Nombre de virements automatiques : ");
		nbVirement = lectureClavier.nextInt();
		
		nbDebit = nbCB + nbCheque + nbVirement;
		
		prctCB = (float) nbCB / nbDebit * 100;
		prctCh = (float) nbCheque / nbDebit * 100;
		prctVi = (float) nbVirement / nbDebit * 100;
		
		System.out.println("Vous avez émis " + nbDebit + " ordres de debit");
		System.out.print("dont " + prctCB + " % par Carte Bleue");
		System.out.print("     " + prctCh + " % par chèque");
		System.out.print("     " + prctVi + " % par virement");	
	}

}

package com.nauka;

import java.util.Random;
import java.util.Scanner;

public class Kamien_Papier_Nozyce 
{

	public static void main(String[] args) 
	{
		System.out.println("=========================================");
		System.out.println("Witaj w grze \"Kamien, papier, nozyce\".");
		System.out.println("=========================================");
		System.out.println("                                          ");
		System.out.println("Gra trwa do trzech zwyciestw.");
		int resultDraw = 0;
		int resultUser = 0;
		int resultComputer = 0;
		
		while ((resultUser < 3) && (resultComputer < 3))
		{
			
		System.out.println("Wybierz: kamien (wybierz 1), papier (wybierz 2) lub nozyce (wybierz 3).");
		
		Scanner input = new Scanner(System.in);
		int choiseUser = input.nextInt();

			if (choiseUser == 1)
			{
				System.out.println("Kamien");
			}
			else if (choiseUser == 2)
			{
				System.out.println("Papier");
			}
			else if (choiseUser == 3)
			{
				System.out.println("Nozyce");
			}
				Random random = new Random ();
				int choiseComputer = random.nextInt(3)+1;
				
				System.out.println("Komputer wybiera: ");
				
				if (choiseComputer == 1)
				{
					System.out.println("Kamien");	
				}
				else if (choiseComputer == 2)
				{
					System.out.println("Papier");
				}
				else if (choiseComputer == 3)
				{
					System.out.println("Nozyce");
				}
				
				System.out.println("=========================================");
				
					if (choiseUser - choiseComputer == 0)
					{	resultDraw = resultDraw +1; 
						System.out.println("Remis. Sprobuj ponownie");
						System.out.println("Stan gry: "+ "Remisy = "+ resultDraw +" Wygrane Gracza = " + resultUser + " Wygrane Komputera = " + resultComputer);
					}
				
					else if ( choiseUser - choiseComputer == -2)
					{	resultUser = resultUser +1;
						System.out.println("Wygrales! Gratulacje!");
						System.out.println("Stan gry: "+ "Remisy = "+ resultDraw +" Wygrane Gracza = " + resultUser + " Wygrane Komputera = " + resultComputer);
					}
					
					else if (choiseUser - choiseComputer == 1)
					{	resultUser = resultUser +1;
						System.out.println("Wygrales! Gratulacje!");
						System.out.println("Stan gry: "+ "Remisy = "+ resultDraw +" Wygrane Gracza = " + resultUser + " Wygrane Komputera = " + resultComputer);
					}
					
					else 
					{	resultComputer = resultComputer +1;
						System.out.println("Niestety, przegrales! Moze nastepnym razem sie uda!");
						System.out.println("Stan gry: "+ "Remisy = "+ resultDraw +" Wygrane Gracza = " + resultUser + " Wygrane Komputera = " + resultComputer);
					}
					
					System.out.println("                                      ");
					System.out.println("                                      ");
			}
		
		System.out.println("Koniec gry");
	}

}

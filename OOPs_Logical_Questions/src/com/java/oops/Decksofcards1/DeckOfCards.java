package com.java.oops.Decksofcards1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class DeckOfCards 
{
	static String[] suits= {"Clubs", "Diamonds", "Hearts", "Spades"};
	static String[] ranks= {"2", "3", "4", "5", "6", "7", "8","9", "10", "Jack", "Queen", "King", "Ace"};
	
	public static void main(String[] args) 
	{
		List<String> deck=initializeDeck();
		shuffle(deck);
		String[][] playersCards=distributeCards(deck);
		printplayersCards(playersCards);
	}

	private static void printplayersCards(String[][] playersCards) 
	{
		for(int i=0;i<playersCards.length;i++)
		{
			System.out.println("Player"+" "+(i+1)+" cards : ");
			for(int j=0;j<9;j++)
			{
				System.out.println(playersCards[i][j]+" ");
			}
			System.out.println();
		}
	}

	private static String[][] distributeCards(List<String> deck) 
	{
		String[][] playersCards=new String[4][9];
		int index=0;
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<9;j++)
			{
				playersCards[i][j]=deck.get(index++);
			}
		}
		return playersCards;
	}
	
	private static void shuffle(List<String> deck) 
	{
		Collections.shuffle(deck);
	}

	private static List<String> initializeDeck() 
	{
		List<String> deck=new ArrayList<>();
		for(String suit : suits)
		{
			for(String rank : ranks)
			{
				deck.add(rank+" of "+ suit);
			}
		}
		return deck;
	}
}

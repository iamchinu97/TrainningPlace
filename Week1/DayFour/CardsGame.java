package com.sapient.week1.day4;

import java.util.ArrayList;
import java.util.Random;

public class CardsGame {
	public int status=1;
	ArrayList<Integer> arr= new ArrayList<Integer>();
	public synchronized void g1() {
		try {
			while(status!=1)
			{
				wait();
			}
			status=2;
			System.out.println("Player1 selected =");
			System.out.println(new Random().nextInt(52));
			notifyAll();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	public synchronized void g2()
	{
		try {
			while(status!=2)
			{
				wait();
			}
			status=3;
			System.out.println("Player2 selected =");
			System.out.println(new Random().nextInt(52));
			notifyAll();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	public synchronized void g3()
	{
		try {
			while(status!=3)
			{
				wait();
			}
			status=1;
			System.out.println("Player3 selected =");
			System.out.println(new Random().nextInt(52));
			notifyAll();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		CardsGame game= new CardsGame();
		for(int i=0;i<52;i++)
		{
			game.arr.add(i+1);
		}
		player1 p1 = new player1(game);
		player2 p2 = new player2(game);
		player3 p3 = new player3(game);
		p1.start();
		p2.start();
		p3.start();
	}
}
class player1 extends Thread
{
	CardsGame card;
	public player1(CardsGame card)
	{
		this.card=card;
	}
	@Override
	public void run() {
		for(int i=0;i<10;i++)
		{
			try {
				sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			card.g1();
		}
	}	
}
class player2 extends Thread
{
	CardsGame card;
	public player2(CardsGame card)
	{
		this.card=card;
	}
	@Override
	public void run() {
		for(int i=0;i<2;i++)
		{
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			card.g2();
		}
	}
}
class player3 extends Thread
{
	CardsGame card;
	public player3(CardsGame card)
	{
		this.card=card;
	}
	@Override
	public void run() {
		for(int i=0;i<2;i++)
		{
			try {
				sleep(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			card.g3();
		}
	}
}
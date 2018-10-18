package com.zl;

import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Console console=new Console();
		Scanner in=new Scanner(System.in);
		System.out.println("用户输入出发地");
		String StartPlace=in.nextLine();
		System.out.println("用户输入目的地");
		String ArrivePlace=in.nextLine();
		System.out.println("用户输入距离");
		Double distance=in.nextDouble();
		console.Print(distance);
		

	}

}

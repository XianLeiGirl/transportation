package com.zl;

public class Car extends Transportation
{
//	double distance=0;
	public Car()
	{
		TransportationName="汽车";
		price=0.32;
		Speed=40;
	}

	@Override
	public void TimePrice(double distance)
	{
		double time=distance/Speed;
		double allprice=distance*price;
		System.out.println(time+"小时"+","+allprice+"元");

	}

}

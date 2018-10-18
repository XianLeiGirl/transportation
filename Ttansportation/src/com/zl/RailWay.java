package com.zl;

public class RailWay extends Transportation
{
	double distance=0;
	public RailWay()
	{
		TransportationName="高铁";
		price=0.45;
		Speed=200;
		
	}

	@Override
	public void TimePrice(double distance)
	{
		double time=distance/Speed;
		double allprice=distance*price;
		System.out.println(time+"小时"+","+allprice+"元");

	}

}

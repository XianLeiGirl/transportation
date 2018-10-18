package com.zl;

public class AirPlane extends Transportation
{
	double distance=0;
	public AirPlane()
	{
		TransportationName="飞机";
		price=0.75;
		Speed=800;
	}

	@Override
	public void TimePrice(double distance)
	{
		double time=distance/Speed;
		double allprice=distance*price;
		System.out.println(time+"小时"+","+allprice+"元");
	}

}

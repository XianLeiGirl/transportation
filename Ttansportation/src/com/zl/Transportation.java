package com.zl;

import java.util.Date;

public abstract class Transportation
{
	String TransportationName;
	Date StartTime;
	Date ArriveTime;
	Date TickTime;
	Date CheckTime;
	Date PickTime;
	double Speed;
	double price;
//	double distance;
//	计算时间和价格
	abstract public void TimePrice(double distance);
//	输出时间和价格
	public void PrintTimePrice(double distance)
	{
		double time=0;
		double allprice=0;
		System.out.println("时间、价格分别为");
		TimePrice(distance);
//		System.out.println("时间为"+time+"价格为"+allprice);调用PrintTimePrice中的time,allprice,输出均为0
		
		
	}

}

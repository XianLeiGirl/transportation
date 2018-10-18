package com.zl;

public class Console
{
	Car car=new Car();
	RailWay railway=new RailWay();
	AirPlane airplane=new AirPlane();
	public void Print(double distance)
	{	
		System.out.println(car.TransportationName);
		car.PrintTimePrice(distance);
	    System.out.println(railway.TransportationName);
	    railway.PrintTimePrice(distance);
	    System.out.println("airplane.TransportationName");
	    airplane.PrintTimePrice(distance);
	}
	

}

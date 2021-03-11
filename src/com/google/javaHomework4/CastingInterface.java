package com.google.javaHomework4;

import com.google.javaHomework3.CEO;
import com.google.javaHomework3.Programmer;

public class CastingInterface {
	public static void main(String[] args) {
		CEO ceo = new CEO("Captain","Marvel", 30000,"CEO");
		IWebsiteCreator dang = new Programmer("Dang","Red",10000,"Staff");
		Programmer dang2 = (Programmer) dang;
		AI alphaGo = new AI("alphaGo","Java");
		IWebsiteCreator alphaGo2 = alphaGo;
					
		ceo.orderWebsite(dang);
		ceo.orderWebsite(dang2);
		ceo.orderWebsite(alphaGo);
		ceo.orderWebsite(alphaGo2);
	}
}

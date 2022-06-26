package br.com.factory.apple.simple;

import br.com.factory.apple.simple.factory.IPhoneSimpleFactory;
import br.com.factory.apple.simple.model.IPhone;

public class Client {
	
	public static void main(String[] args) {
		
		System.out.println("### Ordering an iPhone X");
		IPhone iphone1 = IPhoneSimpleFactory.orderIPhone("X", "standard");
		System.out.println(iphone1);
		
		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhone iphone2 = IPhoneSimpleFactory.orderIPhone("11", "highEnd");
		System.out.println(iphone2);
		
		System.out.println("\n\n### Ordering an iPhone 12 HighEnd");
		IPhone iphone3 = IPhoneSimpleFactory.orderIPhone("12", "standard");
		System.out.println(iphone3);
		
	}
}

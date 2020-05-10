package com.akash.abstractfactory;

public class Client {

	public static void main(String[] args) {

		// getting AudiFactory instance from FactoryProducer
		AudiFactory audiFactory = (AudiFactory) FactoryProducer.getFactory(Car.AUDI);
		AudiTire audiTire = (AudiTire) audiFactory.makeTire();
		AudiHeadlight audiHeadlight = (AudiHeadlight) audiFactory.makeHeadlight();
		System.out.println("Is audiTire instanceof AudiTire ? " + (audiTire instanceof AudiTire));
		System.out.println("Is audiHeadlight instanceof AudiHeadlight ? " + (audiHeadlight instanceof AudiHeadlight));

		// getting MercedesFactory instance from FactoryProducer
		MercedesFactory mercedesFactory = (MercedesFactory) FactoryProducer.getFactory(Car.MERCEDES);
		MercedesTire mercedesTire = (MercedesTire) mercedesFactory.makeTire();
		MercedesHeadlight mercedesHeadlight = (MercedesHeadlight) mercedesFactory.makeHeadlight();
		System.out.println("Is mercedesTire instanceof MercedesTire ? " + (mercedesTire instanceof MercedesTire));
		System.out.println("Is mercedesHeadlight instanceof MercedesHeadlight ? "
				+ (mercedesHeadlight instanceof MercedesHeadlight));
	}

}

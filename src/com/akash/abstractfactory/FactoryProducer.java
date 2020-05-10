package com.akash.abstractfactory;

public class FactoryProducer {

	public static Factory getFactory(Car car) {
		if (car == Car.AUDI) {
			return new AudiFactory();
		}
		return new MercedesFactory();
	}

}

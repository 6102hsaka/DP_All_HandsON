package com.akash.handson1;

public class ProcessOrderImpl implements IProcessOrder {

	@Override
	public void processOrder(String modelName) {
		System.out.println(String.format("%s order accepted!", modelName));

	}

}

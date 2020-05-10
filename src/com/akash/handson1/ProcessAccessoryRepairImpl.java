package com.akash.handson1;

public class ProcessAccessoryRepairImpl implements IProcessAccessoryRepair {

	@Override
	public void processAccessoryRepair(String accessoryType) {
		System.out.println(String.format("%s repair accepted!", accessoryType));

	}

}

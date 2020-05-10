package com.akash.handson1;

public class ProcessPhoneRepairImpl implements IProcessPhoneRepair {

	@Override
	public void processPhoneRepair(String modelName) {
		System.out.println(String.format("%s repair accepted!", modelName));

	}

}

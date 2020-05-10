package com.akash.chainofresponsibility;

public class HR implements ILeaveRequestHandler {
	
	private ILeaveRequestHandler nextHandler;

	public HR() {
		super();
	}

	public HR(ILeaveRequestHandler nextHandler) {
		super();
		this.nextHandler = nextHandler;
	}

	@Override
	public void handleRequest(LeaveRequest leaveRequest) {
		System.out.println("HR approves leave for " + leaveRequest);
	}

}


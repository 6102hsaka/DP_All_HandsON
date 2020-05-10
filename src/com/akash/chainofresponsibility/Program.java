package com.akash.chainofresponsibility;

public class Program {

	public static ILeaveRequestHandler getChainOfILeaveRequestHandlers() {
		ILeaveRequestHandler hr = new HR();
		ILeaveRequestHandler projectManager = new ProjectManager(hr);
		ILeaveRequestHandler supervisor = new Supervisor(projectManager);
		return supervisor;
	}
	
	public static void main(String[] args) {
		
		//leave requests
		LeaveRequest leaveRequest1 = new LeaveRequest("Mr. Abc", 1);
		LeaveRequest leaveRequest2 = new LeaveRequest("Mr. Def", 2);
		LeaveRequest leaveRequest3 = new LeaveRequest("Mr. Ghi", 3);
		LeaveRequest leaveRequest4 = new LeaveRequest("Mr. Jkl", 4);
		LeaveRequest leaveRequest5 = new LeaveRequest("Mr. Mno", 5);
		LeaveRequest leaveRequest6 = new LeaveRequest("Mr. Pqr", 6);
		LeaveRequest leaveRequest7 = new LeaveRequest("Mr. Xyz", 10);
		
		ILeaveRequestHandler handler = getChainOfILeaveRequestHandlers();
		handler.handleRequest(leaveRequest1);
		handler.handleRequest(leaveRequest2);
		handler.handleRequest(leaveRequest3);
		handler.handleRequest(leaveRequest4);
		handler.handleRequest(leaveRequest5);
		handler.handleRequest(leaveRequest6);
		handler.handleRequest(leaveRequest7);
	}


}

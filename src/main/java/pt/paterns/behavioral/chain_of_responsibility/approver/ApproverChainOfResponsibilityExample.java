package pt.paterns.behavioral.chain_of_responsibility.approver;

import pt.paterns.behavioral.chain_of_responsibility.approver.handlers.CEO;
import pt.paterns.behavioral.chain_of_responsibility.approver.handlers.Director;
import pt.paterns.behavioral.chain_of_responsibility.approver.handlers.VP;

public class ApproverChainOfResponsibilityExample {

    public static void main(String[] args) {
        // Handlers
        Director bryan = new Director();
        VP crystal = new VP();
        CEO jeff = new CEO();

        bryan.setSuccessor(crystal);
        crystal.setSuccessor(jeff);

        Request request = new Request(RequestType.CONFERENCE, 500);
        bryan.handleRequest(request);

        request = new Request(RequestType.PURCHASE, 1000);
        bryan.handleRequest(request);

        request = new Request(RequestType.PURCHASE, 2000);
        bryan.handleRequest(request);

    }

}

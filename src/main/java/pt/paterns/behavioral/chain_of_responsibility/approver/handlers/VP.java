package pt.paterns.behavioral.chain_of_responsibility.approver.handlers;

import pt.paterns.behavioral.chain_of_responsibility.approver.Request;
import pt.paterns.behavioral.chain_of_responsibility.approver.RequestType;

public class VP extends Handler {

    @Override
    public void handleRequest(Request request) {
        if (request.getRequestType() == RequestType.PURCHASE && request.getAmount() < 1500) {
            System.out.println("VPs can approve purchases below 1500.");
        } else {
            super.successor.handleRequest(request);
        }
    }

}

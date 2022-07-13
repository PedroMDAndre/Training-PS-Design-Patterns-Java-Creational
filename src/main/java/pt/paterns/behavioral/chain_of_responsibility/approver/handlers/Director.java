package pt.paterns.behavioral.chain_of_responsibility.approver.handlers;

import pt.paterns.behavioral.chain_of_responsibility.approver.Request;
import pt.paterns.behavioral.chain_of_responsibility.approver.RequestType;

public class Director extends Handler {

    @Override
    public void handleRequest(Request request) {
        if (request.getRequestType() == RequestType.CONFERENCE) {
            System.out.println("Directors can approve conferences.");
        } else {
            super.successor.handleRequest(request);
        }
    }

}

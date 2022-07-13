package pt.paterns.behavioral.chain_of_responsibility.approver.handlers;

import pt.paterns.behavioral.chain_of_responsibility.approver.Request;

public class CEO extends Handler {

    public void handleRequest(Request request) {
        System.out.println("CEOs can approve anything they want.");
    }

}

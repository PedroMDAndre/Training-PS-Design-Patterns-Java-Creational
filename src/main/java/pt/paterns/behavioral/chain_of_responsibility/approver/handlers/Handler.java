package pt.paterns.behavioral.chain_of_responsibility.approver.handlers;

import pt.paterns.behavioral.chain_of_responsibility.approver.Request;

public abstract class Handler {

    protected Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract void handleRequest(Request request);

}

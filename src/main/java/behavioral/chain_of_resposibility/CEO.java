package behavioral.chain_of_resposibility;

public class CEO extends Handler {

    @Override
    public void handleRequest(Request request) {
        System.out.println("CEO can approve anything they want");
    }
}

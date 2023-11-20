package signatureChange;

public class AuthenticatorClient {
    private AuthenticationService authenticationService;

    public static void main(String[] args) {
        new AuthenticatorClient(new AuthenticationService()).run();
    }

    public AuthenticatorClient(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    public void run() {
        ID id = new ID(33);
        boolean authenticated = authenticationService.isAuthenticated(id);
        System.out.println("33 is authenticated = " + authenticated);
    }
}

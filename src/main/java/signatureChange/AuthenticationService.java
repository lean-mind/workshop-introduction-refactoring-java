package signatureChange;

public class AuthenticationService {

    private ID adminID = new ID(12345);

    public boolean isAuthenticated(ID id) {
        return id.equals(adminID);
    }
}

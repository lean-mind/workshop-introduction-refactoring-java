package signatureChange;

public class AuthenticationService {

    private ID adminId2 = new ID(12345);

    public boolean isAuthenticated(ID id) {
        return id.equals(adminId2);
    }
}

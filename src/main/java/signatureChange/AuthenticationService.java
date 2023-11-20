package signatureChange;

public class AuthenticationService {

    private int adminID = 12345;
    private ID adminID2 = new ID(12345);

    public boolean isAuthenticated(int id) {
        return isAuthenticated(new ID(id));
    }

    public boolean isAuthenticated(ID id) {
        return id.equals(adminID2);
    }
}

package signatureChange;

public class AuthenticationService {

    private int adminId = 12345;
    private ID adminId2 = new ID(12345);

    public boolean isAuthenticated(int id) {
        return id == adminId;
    }

    public boolean isAuthenticated(ID id) {
        return id.equals(adminId2);
    }
}

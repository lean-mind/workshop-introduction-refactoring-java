package signatureChange;

public class AuthenticationService {
    public boolean isAuthenticated(int id) {
        return id == 12345;
    }

    public boolean isAuthenticated(ID id) {
        return false;
    }
}

package signatureChange;

public class AuthenticationService {


    public boolean isAuthenticated(ID ID) {
        return ID.getId() == 12345;
    }
}

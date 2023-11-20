package unit;

import org.junit.Assert;
import org.junit.Test;
import signatureChange.AuthenticationService;
import signatureChange.ID;

public class AuthenticationServiceShould {

    @Test
    public void distinguish_administrator_role() throws Exception {
        AuthenticationService service = new AuthenticationService();
        ID adminId = new ID(12345);
        Assert.assertTrue(service.isAuthenticated(adminId));
    }
    @Test
    public void distinguish_non_admin_role() throws Exception {
        AuthenticationService service = new AuthenticationService();
        ID normalUserId = new ID(11111);
        Assert.assertFalse(service.isAuthenticated(normalUserId));
    }
}

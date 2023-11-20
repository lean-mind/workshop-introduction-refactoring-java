package unit;

import signatureChange.AuthenticationService;
import org.junit.Assert;
import org.junit.Test;
import signatureChange.ID;

public class AuthenticationServiceShould {

    @Test
    public void distinguish_administrator_role() throws Exception {
        AuthenticationService service = new AuthenticationService();
        int adminId = 12345;
        Assert.assertTrue(service.isAuthenticated(adminId));
    }
    @Test
    public void distinguish_non_admin_role() throws Exception {
        AuthenticationService service = new AuthenticationService();
        int normalUserId = 11111;
        Assert.assertFalse(service.isAuthenticated(normalUserId));
    }

    @Test
    public void distinguish_administrator_role_value_object() throws Exception {
        AuthenticationService service = new AuthenticationService();
        ID adminId = new ID(12345);
        Assert.assertTrue(service.isAuthenticated(adminId));
    }
    @Test
    public void distinguish_non_admin_role_value_object() throws Exception {
        AuthenticationService service = new AuthenticationService();
        ID normalUserId = new ID(11111);
        Assert.assertFalse(service.isAuthenticated(normalUserId));
    }
}

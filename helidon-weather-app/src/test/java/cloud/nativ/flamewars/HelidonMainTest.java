
package cloud.nativ.flamewars;

import javax.inject.Inject;
import javax.json.JsonObject;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.client.WebTarget;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import io.helidon.microprofile.tests.junit5.HelidonTest;

import static org.junit.jupiter.api.Assertions.*;

@HelidonTest
class HelidonMainTest {

    @Inject
    private WebTarget target;

    @Test
    void testHelloHelidon() {
        String message = target.path("/api/hello").request().get(String.class);
        assertEquals("Hello Helidon", message);
    }
}

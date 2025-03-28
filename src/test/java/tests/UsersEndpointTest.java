package tests;

import org.junit.jupiter.api.Test;
import service.UserService;

import static org.hamcrest.Matchers.hasSize;


public class UsersEndpointTest {

    private final UserService userService = new UserService();

    @Test
    public void verifyStatusCodeResponse(){
        userService.getAllUsers()
                .then().assertThat()
                .statusCode(200);
    }

    @Test
    public void verifyHeaderResponse(){
        userService.getAllUsers()
                .then().assertThat()
                .contentType(
                        "application/json; charset=utf-8"
                );
    }

    @Test
    public void verifyArrayResponseSize(){
        userService.getAllUsers()
                .then().assertThat()
                .body("", hasSize(10));
    }
}

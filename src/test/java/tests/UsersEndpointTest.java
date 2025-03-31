package tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import service.UserService;

import java.time.LocalTime;

import static org.hamcrest.Matchers.hasSize;

public class UsersEndpointTest {

    private final UserService userService = new UserService();

    @Test
    public void verifyStatusCodeResponse(){
        logTest("Test 1 for Users");
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        userService.getAllUsers()
                .then()
                .assertThat()
                .statusCode(200);
    }

    @Test
    public void verifyHeaderResponse(){
        logTest("Test 2 for Users");
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        userService.getAllUsers()
                .then()
                .assertThat()
                .contentType("application/json; charset=utf-8");
    }

    @Test
    public void verifyArrayResponseSize(){
        logTest("Test 3 for Users");
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        userService.getAllUsers()
                .then()
                .assertThat()
                .body("", hasSize(10));
    }

    private void logTest(String testName) {
        System.out.println(testName + " - Start: " + LocalTime.now() + " - Thread: " + Thread.currentThread().getId());
    }
}

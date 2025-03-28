package service;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class UserService {

    static {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com/";
    }

    public Response getAllUsers(){
        return given()
                .when().get("users");
    }
}

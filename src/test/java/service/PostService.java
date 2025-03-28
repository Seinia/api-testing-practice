package service;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import model.Post;

import static io.restassured.RestAssured.given;

public class PostService {

    static {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com/";
    }

    public Response getAllPosts(){
        return given()
                .when().get("posts");
    }


    public Response getPostById(int postId){
        return given().pathParam("postId", postId)
                .when().get("posts/{postId}");
    }

    public Response createPost(Post post){
        return given().body(post)
                .when().post("posts");
    }

    public Response updatePost(Post post, int postId){
        return given().pathParam("postId", postId).body(post)
                .when().put("posts/{postId}");
    }

    public Response deletePost(int postId){
        return given().pathParam("postId", postId)
                .when().delete("posts/{postId}");
    }


}

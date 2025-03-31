package tests;

import model.Post;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import service.PostService;

import java.time.LocalTime;

public class PostsEndpointTest {

    private final PostService postService = new PostService();

    @Test
    public void getAllPostsAndVerifyStatus(){
        logTest("Test 1 for Posts");
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        postService.getAllPosts()
                .then().log().body()
                .assertThat()
                .statusCode(200);
    }

    @Test
    public void getSpecifiedPostAndVerifyStatus(){
        logTest("Test 2 for Posts");
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        postService.getPostById(1)
                .then().log().body()
                .assertThat()
                .statusCode(200);
    }

    @Test
    public void createSpecifiedPostAndVerifyStatus(){
        logTest("Test 3 for Posts");
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        postService.createPost(
                Post.builder()
                        .title("My first post API test")
                        .body("RestAssured helped me to do this task").build()
                )
                .then().log().body()
                .assertThat()
                .statusCode(201);
    }

    @Test
    public void updateSpecifiedPostAndVerifyStatus(){
        logTest("Test 4 for Posts");
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        postService.updatePost(
                Post.builder()
                        .body("RestAssured helped me to do this task")
                        .build(),
                        1)
                .then().log().body()
                .assertThat()
                .statusCode(200);
    }

    @Test
    public void deleteSpecifiedPostAndVerifyStatus(){
        logTest("Test 5 for Posts");
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        postService.deletePost(1)
                .then().assertThat()
                .statusCode(200);
    }

    private void logTest(String testName) {
        System.out.println(testName + " - Start: " + LocalTime.now() + " - Thread: " + Thread.currentThread().getId());
    }

}

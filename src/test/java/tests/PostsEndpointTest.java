package tests;

import model.Post;
import org.junit.jupiter.api.Test;
import service.PostService;


public class PostsEndpointTest {

    private final PostService postService = new PostService();

    @Test
    public void getAllPostsAndVerifyStatus(){
        postService.getAllPosts()
                .then().log().body()
                .assertThat()
                .statusCode(200);
    }

    @Test
    public void getSpecifiedPostAndVerifyStatus(){
        postService.getPostById(1)
                .then().log().body()
                .assertThat()
                .statusCode(200);
    }

    @Test
    public void createSpecifiedPostAndVerifyStatus(){
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
        postService.deletePost(1)
                .then().assertThat()
                .statusCode(200);
    }

}

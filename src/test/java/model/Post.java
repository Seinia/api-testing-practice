package model;

import lombok.Builder;
import lombok.extern.jackson.Jacksonized;

@Builder
@Jacksonized
public class Post {
    private int userId;
    private int id;
    private String title;
    private String body;
}

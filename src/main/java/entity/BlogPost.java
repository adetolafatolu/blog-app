package com.tola.blogpost.entity;

import jakarta.persistence.*;


import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class BlogPost {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int postID;
    private int UserID;
    private String title;
    private String content;
    private String createDate;
    private String status;


    public int getPostID() {
        return postID;
    }
    public void setPostID(int postID) {
       this.postID = postID;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public String getCreateDate() {
        return createDate;
    }
    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    @OneToMany (mappedBy = "blog_post")
    private List<Comments> comments;

    @ManyToMany
    @JoinTable(
            name = "post_tag",
            joinColumns = @JoinColumn(name = "blog_post_id"),
            inverseJoinColumns = @JoinColumn(name = "tag_id")
    )
    private Set<Tag> tags = new HashSet<>();

    @ManyToOne
    @JoinColumn (name ="user_id")
    private User user;


}

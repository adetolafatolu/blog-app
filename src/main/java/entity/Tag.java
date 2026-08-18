package com.tola.blogpost.entity;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Tag {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int TagId;
    private String TagName;

    private int id;
    public int getTagId() {
        return TagId;
    }
    public void setTagId(int tagId) {
       this.TagId = tagId;
    }
    public String getTagName() {
        return TagName;
    }
    public void setTagName(String tagName) {
        this.TagName = tagName;
    }

    @ManyToMany(mappedBy = "tags")
    private Set<BlogPost> blogPosts = new HashSet<>();

}

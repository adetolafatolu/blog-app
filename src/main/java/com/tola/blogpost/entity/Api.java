package com.tola.blogpost.entity;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/blog-posts")
public class Api {

    @GetMapping
    public void getBlogPosts() {
    }

    @GetMapping("/{id}")
    public void getBlogPost(@PathVariable String id) {
    }

    @PostMapping
    public void postBlogPost() {
    }

    @PutMapping("/{id}")
    public void putBlogPost(@PathVariable String id) {
    }

    @PatchMapping("/{id}")
    public void patchBlogPost(@PathVariable String id) {
    }

    @DeleteMapping("/{id}")
    public void deleteBlogPost(@PathVariable String id) {
    }
}
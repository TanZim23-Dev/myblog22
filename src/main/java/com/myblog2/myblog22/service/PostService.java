package com.myblog2.myblog22.service;

import com.myblog2.myblog22.payload.PostDto;

import java.util.List;

public interface PostService {

    PostDto createPost(PostDto postDto);

    PostDto getPostById(long id);


    List<PostDto> getAllPosts(int pageNo, int pageSize, String sortBy, String sortDir);

    void deletePost(long id);
}

package com.myblog2.myblog22.service.impl;

import com.myblog2.myblog22.entity.Post;
import com.myblog2.myblog22.exception.ResourceNotFoundException;
import com.myblog2.myblog22.payload.PostDto;
import com.myblog2.myblog22.repository.PostRepository;
import com.myblog2.myblog22.service.PostService;
import org.springframework.stereotype.Service;


@Service
public class PostServiceImpl implements PostService {



   private PostRepository postRepository;

      public PostServiceImpl(PostRepository postRepository) {
           this.postRepository = postRepository;
    }

    @Override
    public PostDto createPost(PostDto postDto) {
        Post post = new Post();
       post.setTitle(postDto.getTitle());
        post.setDescription(postDto.getDescription());
        post.setContent(postDto.getContent());
        Post savedPost = postRepository.save(post);

        PostDto dto = new PostDto();
        dto.setTitle(savedPost.getTitle());
        dto.setDescription(savedPost.getDescription());
        dto.setContent(savedPost.getContent());


        return dto;
    }

    @Override
    public PostDto getPostById(long id) {

        Post post = postRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Post not found with id:" + id)

        );

        PostDto dto = new PostDto();
        dto.setId(post.getId());
        dto.setTitle(post.getTitle());
        dto.setDescription(post.getDescription());
        dto.setContent(post.getContent());
        return  dto;
    }
}

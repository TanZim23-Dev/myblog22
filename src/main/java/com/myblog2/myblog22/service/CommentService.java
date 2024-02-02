package com.myblog2.myblog22.service;

import com.myblog2.myblog22.payload.CommentDto;


public interface CommentService {

    CommentDto createComment(CommentDto commentDto, long postId);

    void deleteComment(long id);

    CommentDto updateComment(long id, CommentDto commentDto, long postId);
}
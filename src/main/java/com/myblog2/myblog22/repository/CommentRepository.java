package com.myblog2.myblog22.repository;

import com.myblog2.myblog22.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment,Long> {


}

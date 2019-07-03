package com.oaec.teachingsystem.service.impl;

import com.oaec.teachingsystem.domain.Comment;
import com.oaec.teachingsystem.mapper.CommentMapper;
import com.oaec.teachingsystem.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentMapper commentMapper;

    public List<Comment> findAllbyNote_id(Long id) {
        return commentMapper.findAllbyNote_id(id);
    }

    public int createComment(Comment comment) {
        return commentMapper.createComment(comment);
    }

    public int deleteCommentByid(Long id) {
        return commentMapper.deleteCommentByid(id);
    }

    public int updataCommentbyid(Comment comment) {
        return commentMapper.updataCommentbyid(comment);
    }
}

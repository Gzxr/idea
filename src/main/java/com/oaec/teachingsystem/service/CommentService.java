package com.oaec.teachingsystem.service;

import com.oaec.teachingsystem.domain.Comment;

import java.util.List;

public interface CommentService {
    List<Comment> findAllbyNote_id(Long id);//查询笔记下的评论

    int createComment (Comment comment);//发表评论

    int deleteCommentByid(Long id);//删除评论

    int updataCommentbyid(Comment comment);//修改评论内容
}

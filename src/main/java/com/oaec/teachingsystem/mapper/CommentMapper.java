package com.oaec.teachingsystem.mapper;

import com.oaec.teachingsystem.domain.Comment;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface CommentMapper {
    List<Comment> findAllbyNote_id(Long id);//查询笔记下的所有评论

    int createComment (Comment comment);//发表评论

    int deleteCommentByid(Long id);//删除评论

    int updataCommentbyid(Comment comment);//修改评论内容


}

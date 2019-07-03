package com.oaec.teachingsystem.controller;


import com.oaec.teachingsystem.domain.Comment;
import com.oaec.teachingsystem.domain.Notesonexperience;
import com.oaec.teachingsystem.domain.User;
import com.oaec.teachingsystem.service.CommentService;
import com.oaec.teachingsystem.service.NotesonexperienceService;
import com.oaec.teachingsystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.List;


@Controller
@RequestMapping("note")
public class NotesonexperienceController {

    @Autowired
    public NotesonexperienceService notesonexperienceService;

    @Autowired
    public CommentService commentService;

    @Autowired
    public UserService userService;

    @GetMapping("/adding")
    public String adding(){
        return "user/Note_add";
    }

    @GetMapping("/list")
    public String list(Model model){
        List<Notesonexperience> list = notesonexperienceService.findAll();
        model.addAttribute("list",list);
        return "Notelist";
    }

    @GetMapping("/see")
    public String see(Long id,Model model){
        Notesonexperience notesonexperience = notesonexperienceService.findnoteByid(id);//获取对应心得
        User user = userService.findById(notesonexperience.getUser_id());//获取心得的作者
        notesonexperience.setUser(user);//获取到的作者user set进心得里

        List<Comment> allbyNote_id = commentService.findAllbyNote_id(id);//获取评论
        for(int i=0;i<allbyNote_id.size();i++){//获取评论里评论的用户user
            User user1=userService.findById(allbyNote_id.get(i).getUser_id());//把第i个评论的userid取出 再通过service获取User类
            allbyNote_id.get(i).setUser(user1);//再把获取到的user类存入当前第i个的评论类里
        }

        notesonexperience.setCommentList(allbyNote_id);//把整合好的评论list放入心得中
        model.addAttribute("note",notesonexperience);
        return "user/Note_see";
    }

    @PostMapping("/addnote")
    public String addnote(Long userid,String title,String content,String uname,String uheadshot,Model model){
        Date date = new Date();
        Notesonexperience note = new Notesonexperience();
        note.setUser_id(userid);
        note.setCreatetime(date);
        note.setTitle(title);
        note.setContent(content);
        note.setUname(uname);
        note.setUheadshot(uheadshot);


        int i = notesonexperienceService.createNote(note);
        if(i>0){
            model.addAttribute("message","发布成功");
            return "redirect:list";
        }else{
            model.addAttribute("error","发表失败");
            return "redirect:list";
        }
    }

    @GetMapping("/deletenote")
    public String deletenote(Long user_id,Long id,Model model){
        Notesonexperience notesonexperience = notesonexperienceService.findnoteByid(id);
        Long ifuser_id = notesonexperience.getUser_id();
        if(user_id == ifuser_id){
            int i = notesonexperienceService.deletenotebyid(id);
            if(i>0){
                model.addAttribute("message","删除心得笔记成功");
                return "redirect:note/list";
            }else{
                model.addAttribute("error","删除心得笔记失败");
                return "redirect:note/list";
            }
        }else{
            model.addAttribute("error","无法删除帖子");
            return"redirect:note/list";
        }
    }

    @PostMapping("/comment")
    public String comment(Long user_id,Long no_id,String content,Model model){
        Comment comment = new Comment();
        comment.setUser_id(user_id);
        comment.setNotesonexperience_id(no_id);
        comment.setContent(content);
        Date date = new Date();
        comment.setCreatetime(date);
        int i = commentService.createComment(comment);
        if(i>0){
            return "redirect:see?id="+no_id;
        }else{
            model.addAttribute("error","评论失败");
            return "redirect:see?id="+no_id;
        }

    }


}

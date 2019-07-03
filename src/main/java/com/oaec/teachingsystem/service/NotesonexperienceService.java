package com.oaec.teachingsystem.service;

import com.oaec.teachingsystem.domain.Notesonexperience;

import java.util.Date;
import java.util.List;

public interface NotesonexperienceService {

    List<Notesonexperience> findAll();

    Notesonexperience findnoteByuserid(Long user_id);//根据用户id查询笔记

    Notesonexperience findnoteByid(Long id);//根据id查找笔记

    List<Notesonexperience> findnoteByname(String title);//根据name查找笔记

    int deletenotebyid(Long id);//删除笔记

    int updataNote(Notesonexperience notesonexperience);//更新笔记

    int createNote(Notesonexperience notesonexperience);//发布笔记
}

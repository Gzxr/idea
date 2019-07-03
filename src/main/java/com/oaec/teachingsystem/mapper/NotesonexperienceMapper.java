package com.oaec.teachingsystem.mapper;

import com.oaec.teachingsystem.domain.Notesonexperience;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface NotesonexperienceMapper {
    /**
     * 对于多个参数来说，每个参数之前都要加上@Param注解，
     * 要不然会找不到对应的参数进而报错
     */
    List<Notesonexperience> findAll();

    Notesonexperience findnoteByuserid(Long user_id);//根据用户id查询笔记

    Notesonexperience findnoteByid(Long id);//根据id查找笔记

    List<Notesonexperience> findnoteByname(String title);//根据name查找笔记

    int deletenotebyid(Long id);//删除笔记

    int updataNote(Notesonexperience notesonexperience);//更新笔记

    int createNote(Notesonexperience notesonexperience);//发布笔记




}

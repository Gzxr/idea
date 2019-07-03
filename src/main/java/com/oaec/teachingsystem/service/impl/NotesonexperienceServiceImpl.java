package com.oaec.teachingsystem.service.impl;

import com.oaec.teachingsystem.domain.Notesonexperience;
import com.oaec.teachingsystem.mapper.NotesonexperienceMapper;
import com.oaec.teachingsystem.service.NotesonexperienceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotesonexperienceServiceImpl implements NotesonexperienceService {

    @Autowired
    private NotesonexperienceMapper notesonexperienceMapper;

    public List<Notesonexperience> findAll() {
        List<Notesonexperience> list = notesonexperienceMapper.findAll();
        return list;
    }


    public Notesonexperience findnoteByuserid(Long id) {
        return notesonexperienceMapper.findnoteByuserid(id);
    }


    public Notesonexperience findnoteByid(Long id) {
        return notesonexperienceMapper.findnoteByid(id);
    }


    public List<Notesonexperience> findnoteByname(String name) {
        return notesonexperienceMapper.findnoteByname(name);
    }


    public int deletenotebyid(Long id) {
        return notesonexperienceMapper.deletenotebyid(id);
    }


    public int updataNote(Notesonexperience notesonexperience) {
        return notesonexperienceMapper.updataNote(notesonexperience);
    }

    public int createNote(Notesonexperience notesonexperience) {
        return notesonexperienceMapper.createNote(notesonexperience);
    }
}

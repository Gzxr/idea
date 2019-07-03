package com.oaec.teachingsystem.service.impl;

import com.oaec.teachingsystem.domain.Networkwork;
import com.oaec.teachingsystem.mapper.NetworkworkMapper;
import com.oaec.teachingsystem.service.NetworkworkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NetworkworkServiceImpl implements NetworkworkService {

    @Autowired
    private NetworkworkMapper networkworkMapper;

    public List<Networkwork> findAllnetworkwork() {
        List<Networkwork> list = networkworkMapper.findAllnetworkwork();
        return list;
    }

    public Networkwork findNetworkworkById(long id) {
        Networkwork networkworkById = networkworkMapper.findNetworkworkById(id);
        return networkworkById;
    }

    public List<Networkwork> findNetworkworkBycourseId(long id) {
        List<Networkwork> list = networkworkMapper.findNetworkworkBycourseId(id);
        return list;
    }

    public int createNetworkwork(Networkwork networkwork) {
        int i = networkworkMapper.createNetworkwork(networkwork);
        return i;
    }

    public int updataNetworkwork(Networkwork networkwork) {
        int i = networkworkMapper.updataNetworkwork(networkwork);
        return i;
    }

    public int deleteNetworkworkById(long id) {
        int i = networkworkMapper.deleteNetworkworkById(id);
        return i;
    }
}

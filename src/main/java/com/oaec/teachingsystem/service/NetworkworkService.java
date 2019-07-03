package com.oaec.teachingsystem.service;

import com.oaec.teachingsystem.domain.Networkwork;

import java.util.List;

public interface NetworkworkService {
    List<Networkwork> findAllnetworkwork();//查询所有电子作业

    Networkwork findNetworkworkById(long id);//查询指定id电子作业

    List<Networkwork> findNetworkworkBycourseId(long id);//查看相应课程下的电子作业

    int createNetworkwork(Networkwork networkwork);//创建电子作业

    int updataNetworkwork(Networkwork networkwork);//修改电子作业

    int deleteNetworkworkById(long id);//删除电子作业
}

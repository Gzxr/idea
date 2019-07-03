package com.oaec.teachingsystem.mapper;

import com.oaec.teachingsystem.domain.Networkwork;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NetworkworkMapper {

    List<Networkwork> findAllnetworkwork();//查询所有电子作业

    Networkwork findNetworkworkById(long id);//查询指定id电子作业

    List<Networkwork> findNetworkworkBycourseId(long id);//查看相应课程下的电子作业

    int createNetworkwork(Networkwork networkwork);//创建电子作业

    int updataNetworkwork(Networkwork networkwork);//修改电子作业

    int deleteNetworkworkById(long id);//删除电子作业
}

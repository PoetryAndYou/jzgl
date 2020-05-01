package com.ytmj.jzgl.mapper;

import com.ytmj.jzgl.domain.Drug;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author rui
 * @create 2020-04-19 19:07
 */
public interface DrugMapper {
    //查询所有药物
    @Select("select * from drug")
    List<Drug> findAllDrug();
    //更新药物
    @Update("update drug set name=#{name },money=#{money} ,count=#{count} where id=#{id} ")
    public void updataDrug(Drug drug);
    //添加药物
    @Insert("insert into drug(name, count, money) values (#{name} , #{count} ,#{money}) ")
    public void addDrug(Drug drug);

    //删除药物

    @Delete("delete from drug where id=#{id}")
    public void deleteDrug(@Param("id") Integer id);



}

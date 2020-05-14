package com.ytmj.jzgl.service;

import com.ytmj.jzgl.domain.ICheck;
import com.ytmj.jzgl.domain.PCheck;
import io.swagger.models.auth.In;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @author rui
 * @create 2020-04-18 21:46
 */
public interface CheckService {

    public List<ICheck> findAllCheck();
    public List<PCheck> findAllPCheck(Integer page, Integer size);
    public void addPcheck(String name, String pname);
    public void deleteCheck(Integer id);

    //添加检查项
    void addCheck(ICheck iCheck);
    //修改
    void updateCheck(ICheck iCheck);
    //删除
    public void deleteICheck(@Param("id")Integer id);
}

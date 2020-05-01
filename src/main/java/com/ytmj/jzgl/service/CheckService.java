package com.ytmj.jzgl.service;

import com.ytmj.jzgl.domain.ICheck;
import com.ytmj.jzgl.domain.PCheck;
import io.swagger.models.auth.In;
import org.apache.ibatis.annotations.Param;

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
}
